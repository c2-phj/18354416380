class Vehicle{
    private int wheels;
    private int weight;
    public Vehicle(int wheels,int weight)
    {
        this.wheels=wheels;
        this.weight=weight;
    }
    public int getWheels() {
        return wheels;
    }
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void print()
    {
        System.out.println("车轮个数是"+wheels+"\t"+"车重"+weight);}}
/*
if(wheels==4)
{
    System.out.println("这是一辆小车，能载6人，实载"+loader+"人");
    if(loader>=6) System.out.println("你超员了");
}
if(wheels==6)
{
    System.out.println("这是一辆卡车，能载3人，实载"+loader+"人");
    if(loader>=3) System.out.println("你超员了");
}

}
}*/
class Car extends Vehicle
{
    private  int loader;
    public Car(int wheels, int weight,int loader) {
        super(wheels, weight);
        this.loader=loader;
    }
    public void setLoader(int loader) {
        this.loader = loader;
    }
    public int getLoader()
    {return this.loader;}
    public void print1()
    {
        System.out.print("这是一辆小车，能载6人，实载"+loader+"人");
        if(loader>=6) System.out.println("你超员了");
    }
}

class Truck extends Vehicle{
    private int loader;
    private int payload;

    public int getPayload() {
        return payload;
    }
    public void setPayload(int payload) {
        this.payload = payload;
    }
    public void setLoader(int loader) {
        this.loader = loader;
    }
    public int getLoader()
    {return this.loader;}

    //构造
    public Truck(int wheels, int weight, int loader, int payload)
    {
        super(wheels,weight);
        this.payload=payload;
        this.loader=loader;
    }
    public void print2()
    {
        System.out.print("这是一辆卡车，能载3人，实载"+loader+"人");
        if(loader>=3) System.out.println("你超员了");
        System.out.print("这是一辆卡车，核载5000kg,你一装载了"+this.payload+"kg");
        if(payload>5000) System.out.println("你超载了");
    }

}

public class Test6 {
    public static void main(String[] args) {
        Vehicle v=new Vehicle(4,3);
        v.print();
        Car car=new Car(4,5,6);
        car.print();
        car.print1();
        Truck truck=new Truck(6,8,4,5600);
        truck.print();
        truck.print2();
    }
}
