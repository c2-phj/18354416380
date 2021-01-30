import java.util.Scanner;

public class Complex {

    int reality;
    int virtual;

    public Complex() {
        this.reality = 0;
        this.virtual = 0;
    }

    public Complex(int reality, int virtual) {
        this.reality = reality;
        this.virtual = virtual;
    }

    public void add(Complex num) {
        int x = this.reality + num.reality;
        int y = this.virtual + num.virtual;
        Complex t=new Complex(this.reality,this.virtual);
        System.out.println("加法：");
        System.out.println(x + "+(" + y + ")i");

    }
    public void sub(Complex num) {
        int x = this.reality - num.reality;
        int y= this.virtual - num.virtual;
        Complex t = new Complex(this.reality, this.virtual);
        System.out.println("减法：");
        System.out.println(x + "+(" + y + ")i");
    }

    public  void multipy(Complex num)
    {
        int x= this.reality * num.reality;
        int y = this.virtual * num.virtual;
        Complex t=new Complex(this.reality,this.virtual);
        System.out.println("乘法：");
        System.out.println(x + "+(" + y + ")i");

    }

    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int d=in.nextInt();
        Complex num1 = new Complex(a,b);
        Complex num2 = new Complex(c,d);
        num1.add(num2);
        num1.sub(num2);
        num1.multipy(num2);
    }
}
