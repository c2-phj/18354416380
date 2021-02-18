import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class demo03 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入字符串");
        String s=in.nextLine();
        char[] s2 = s.toCharArray();
        HashSet<Character> hash= new HashSet<>();
        for (char c : s2) {
            hash.add(c);
        }
        for(Character c:hash)
        {
            System.out.print(c+"、");
        }


    }
}
