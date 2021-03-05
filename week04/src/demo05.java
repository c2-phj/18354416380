import java.util.Scanner;

public class demo05 {
    public static void main(String[] args) {
        /*1、创建一个数组
        * 2、从头开始遍历数组
        * 3、计数标记*/
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int [] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=in.nextInt();
        }
        System.out.println(show01(a));

        }

    private static int  show01(int[] a) {
        for (int i = 0; i < a.length; i++)
        {
            int count=1;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]==a[i])
                {
                    count++;
                }
                if(count>a.length/2)
                {
                    return a[i];
                }
            }

        }
        return -1;

}
}
