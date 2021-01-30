import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int count=in.nextInt();
        int []num=new int [count];
        for(int i=0;i<num.length;i++) {
            num[i]=in.nextInt();
        }
        int j=0;
        for(int i=0;i< num.length;i++) {
            if(num[i]!=0)
            {
                num[j++]=num[i];
            }
        }
        while(j<num.length)
        {
            num[j++]=0;
        }
        for(int k=0;k<num.length;k++) {
            System.out.print(num[k]+" ");
        }
    }
}
