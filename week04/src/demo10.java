package ThreadDemo;
class Message
{
    private String title;
    private String concent;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getConcent() {
        return concent;
    }

    public void setConcent(String concent) {
        this.concent = concent;
    }
}

class Producer implements Runnable
{

    private Message msg=null;

    public Producer(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        for(int i=0;i<50;i++)
        {
            if(i%2==0)
            {
                this.msg.setTitle("李兴华");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.msg.setConcent("java讲师");
            }
            else
            {
                this.msg.setTitle("aaaa");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.msg.setConcent("bbbb");
            }

        }
    }
}


class Concumer implements Runnable
{
    private  Message msg=null;

    public Concumer(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        for(int i=0;i<50;i++)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.msg.getTitle()+"----->"+this.msg.getConcent());
        }
    }
}






public class demo10 {
    public static void main(String[] args) {
        Message msg=new Message();
        new Thread(new Producer(msg)).start();
        new Thread(new Concumer(msg)).start();
    }
}
