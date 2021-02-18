import java.util.LinkedList;
import java.util.Scanner;

public class demo02 {
    Scanner in=new Scanner(System.in);
    public  static class A
    {
        int Id,Salary;
        String name;
        Integer ManagerID;

        public A() {
        }

        public A(int id, int salary, String name, Integer managerID) {
            Id = id;
            Salary = salary;
            this.name = name;
            ManagerID = managerID;
        }

        public int getId() {
            return Id;
        }

        public void setId(int id) {
            Id = id;
        }

        public int getSalary() {
            return Salary;
        }

        public void setSalary(int salary) {
            Salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getManagerID() {
            return ManagerID;
        }

        public void setManagerID(Integer managerID) {
            ManagerID = managerID;
        }

        @Override
        public String toString() {
            return "A{" +
                    "Id=" + Id +
                    ", Salary=" + Salary +
                    ", name='" + name + '\'' +
                    ", ManagerID=" + ManagerID +
                    '}';
        }
    }

    public static void main(String[] args) {
        LinkedList<A>list=new LinkedList<>();
        list.add(new A(1,70000,"Joe",3));
        list.add(new A(2,80000,"Henry",4));
        list.add(new A(3,60000,"Sam",null));
        list.add(new A(4,90000,"Max",null));
        for (A a : list) {
            System.out.println(list.toString());
        }
    }
}
