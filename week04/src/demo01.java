import java.util.Scanner;

public class demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String child=in.nextLine();
        String parent=in.nextLine();
        System.out.println( parent.indexOf(child));
    }

}
