import java.util.Scanner;

public class demo03 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double num=in.nextDouble();
        String[] s=String.valueOf(num).split("\\.");
        int a=Integer.parseInt(s[0]);
        int b=Integer.parseInt(s[1]);
        int length = s[1].length();

        int FenZi = (int) (a * Math.pow(10, length) + b);

        int FenMu = (int) Math.pow(10, length);

        int MaxYueShu = getGongYueShu(FenZi, FenMu);

        System.out.println(FenZi / MaxYueShu + "/" + FenMu / MaxYueShu);


    }
    public static int getGongYueShu(int a, int b) {//求两个数的最大公约数

        int t = 0;
        if(a < b){
            t = a;a = b;b = t;
        }
        int c = a % b;
        if(c == 0){
            return b;
        }else{
            return getGongYueShu(b, c);
        }
        }

}
