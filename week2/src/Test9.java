interface Universe{
    public abstract void doAnything();
}
class Star{
    public void shine()
    {System.out.println("star:星星一闪一闪亮晶晶");
        System.out.println("_______________");};
}
class Sun extends Star implements Universe{
    public void shine()
    {
        System.out.println("sun:光照8分钟，到达地球");
    }
    public void doAnything() {
        System.out.println("sun:太阳吸引九大行星旋转");
    }
}
public class Test9 {
    public static void main(String[] args) {
        Star s=new Star();
        s.shine();
        Universe sun = new Sun();
        sun.doAnything();
        Sun sun1 = (Sun) sun;
        sun1.shine();
    }
}
