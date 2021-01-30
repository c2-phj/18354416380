import java.util.Scanner;

public class Account {
    long zhanghu;
    double yue;
    double cunkuan;
    double qukaun;
    public Account(long zhanghu,double yue)
    {
        this.zhanghu=zhanghu;
        this.yue=yue;
    }
    public void getcunkuan()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入存款金额");
        double number= in.nextDouble();
        System.out.println("您的存款金额为"+number+"元， 账户余额为："+(yue+number)+"元");
    }
    public  void getyue()
    {
        System.out.println("您的余额为："+yue+"元");
    }
    public void getqukuan()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入取款金额");
        double num1=in.nextDouble();
        if(yue<num1)
        {
            System.out.println("对不起，您的余额不足！");
        }
        else
        {
            System.out.println("您的取款金额为："+num1+"元，账户余额为"+(yue-num1)+"元");
        }
    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Account account=new Account(1830,888);
        System.out.println("请选择服务类型\n1、存款\n2、取款\n3、查询余额");
        int a=in.nextInt();
        if(a==1)
            account.getcunkuan();
        if(a==2)
            account.getqukuan();
        if(a==3)
            account.getyue();
    }
}
