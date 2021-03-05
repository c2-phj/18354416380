import java.util.Scanner;

public class demo04 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[]a={1,2,5,2,3,5,8,4,6};
        int k=in.nextInt();
        int low=0;
        int high=a.length-1;
        System.out.println(quick(a,low, high, k));


    }

    private static int  quick(int[] a, int low, int high, int k) {

        int i=low,j=high;
        int t=a[i];
        while(i<j)
        {
            while(i<j&&a[j]>=t)
            {
                j--;
            }
            if(i<j)
            {
                a[i++]=a[j];
            }
            while(i<j&&a[i]<=t)
            {
                i++;
            }
            if(i<j)
            {
                a[j--]=a[i];
            }
        }
        a[i]=t;
        if(i+1==k)
        {
            return t;
        }else if(i+1>k)
        {
            return quick(a,low,i-1,k);
        }
        else
            return quick(a,i+1,high,k);
    }

}
