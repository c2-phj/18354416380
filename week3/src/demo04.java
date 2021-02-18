import java.util.HashMap;
import java.util.Scanner;

public class demo04 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s=in.nextLine();
        // s.toCharArray();
        //length()+charAt();

        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray())
        {
            if(map.containsKey(c))
            {
                Integer value=map.get(c);
                value++;
                map.put(c,value);
            }
            else
            {
                Integer value=1;
                map.put(c,value);
            }

        }
        for (Character key : map.keySet()) {
            Integer value=map.get(key);
            System.out.println(key+"-"+value);

        }
    }
}
