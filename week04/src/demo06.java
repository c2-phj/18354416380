import java.util.Scanner;
import java.util.Stack;
/*
* 1、输入一个字符串
* 2、判断是否为空
* 3、匹配*/
public class demo06 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        if(s.isEmpty())
            return true;
        if(s.length()%2==0) {
            Stack<Character> stack = new Stack<>();
            for (char c : s.toCharArray()) {
                if (c == '(') {
                    stack.push(')');
                } else if (c == '{') {
                    stack.push('}');
                } else if (c == '[') {
                    stack.push(']');
                } else if (stack.empty() || c != stack.pop())
                    return false;
            }
            if (stack.empty()) {
                return true;
            }
        }
        return false;
    }
    }

