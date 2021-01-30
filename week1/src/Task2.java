import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int a=0;
        int b=0;
        int c=0;
        System.out.println("请输入一个数字");
        System.out.println(x);
        a=x/100;
        c=x%10;
        b=(x-a*100)/10;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        if(x==(a*a*a+b*b*b+c*c*c))
            System.out.println("是水仙花数！");
        else
            System.out.println("不是水仙花数！");
    }
}
