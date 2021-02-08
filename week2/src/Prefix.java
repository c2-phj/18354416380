import java.util.ArrayList;
import java.util.Scanner;

public class Prefix {
    public static String findPre(ArrayList<String> strings) {
        String prefix = "";
        String first = strings.get(0);
        for (int i = 0; i < first.length(); i++) {
            String prefix1= prefix;
            prefix += first.charAt(i);
            for (String str : strings) {
                if (!str.startsWith(prefix)) {
                    prefix = prefix1;
                    break;
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        String added = in.nextLine();
        while (!added.equals("0")) {
            strings.add(added);
            added = in.nextLine();
        }
        String s = findPre(strings);
        System.out.println(s);
    }

}