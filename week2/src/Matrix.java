import java.util.Scanner;

public class Matrix{

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int [][]a=new int [3][3];
        int m,n;
        System.out.println("m:n");
        m=in.nextInt();n=in.nextInt();
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
            {
                a[i][j]=in.nextInt();
            }
        for(int x=n-1;x>=0;x--) {
            for (int y = 0; y < m; y++) {
                System.out.print(a[x][y]+" ");
            }
            System.out.print("\n");
        }
    }
}