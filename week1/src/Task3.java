import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s1=in.nextLine();
        char[]chars=s1.toCharArray();
        String s2="";
        for(int i=s1.length()-1;i>=0;i--)
        {
            s2+=chars[i];
        }
        System.out.println(s2);

    }
}
