import java.util.Scanner;

public class Game {
    private int v=100;
    public void guess()
    {
        System.out.println("欢迎来到猜字游戏，请输入一个数");
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        while(x!=v)
        {
            if (x > v)
                System.out.println("猜的有点大，再试一次吧！");
            else
                System.out.println("猜的有点小，再试一次吧！");
            x=in.nextInt();
        }
        System.out.println("恭喜你,猜对了！");

    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Game game=new Game();
        game.guess();

    }
}
