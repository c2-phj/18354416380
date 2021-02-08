class Monkey
{
    private String name;
    public Monkey(String s)
    { this.name = s; }
    public String getName()
    { return name; }
    public void speak()
    {System.out.println("咿咿呀呀......");}
}
class People extends Monkey
{
    public People(String s) {
        super(s);
    }
    public void speak() {
        System.out.println("小样的，不错嘛！会说话了！");
    }
    public void think() {
        System.out.println("别说话！认真思考！");
    }
}

public class Test5 {
    public static void main(String[] args) {
        Monkey mon=new Monkey("夹娃");
        People p=new People("潘洪杰");
        mon.speak();
        p.speak();
        p.think();

    }
}
