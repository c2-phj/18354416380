import java.util.Scanner;

public class Circle {
    double x,y,radius;
    public double getArea() {
        return radius*radius*Math.PI;
    }
    public double getPerimeter() {
        return 2*radius*Math.PI;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Circle c=new Circle();
        c.radius=in.nextInt();
        System.out.printf("the area is %.2f\n",c.getArea());
        System.out.printf("the perimeter is %.2f",c.getPerimeter());

    }
}
