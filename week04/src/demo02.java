import java.util.Scanner;

public class demo02 {
    public static void main(String[] args) {

       /* String str="njkvrjk";
        char[]ch=str.toCharArray();
        int i=0;int j=ch.length-1;
        while(i<j)
        {
            if(ch[i]==ch[j]&&i==j) {
                System.out.println(1);
                System.out.println(i);
                break;
            }
            else
            {
                i++;
                j--;
            }
        }*/

        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        for(int i=0; i<str.length();i++)
        {
            if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i)))
            {
                System.out.println(i);
                break;
            }
        }




    }
}
