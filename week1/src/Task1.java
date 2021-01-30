import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int weight=in.nextInt();
        double high=in.nextDouble();
        double BMI=0;
        System.out.print("输入体重(kg): ");
        System.out.println(weight);
        System.out.print("输入身高 (m): ");
        System.out.println(high);
        BMI=weight/(high*high);
        if(BMI<=18.5)
            System.out.println("过轻");
        else if(18.5<BMI&&BMI<=25)
            System.out.println("正常");
        else if(25<BMI&&BMI<28)
            System.out.println("过重");
        else if(28<=BMI&&BMI<=32)
            System.out.println("肥胖");
        else
            System.out.println("非常肥胖");

    }
}
