abstract class Poultry
{
    private String name;
    private String symptom;
    private int age;
    private String illness;
    public Poultry() {}
    public Poultry(String name, String symptom, int age, String illness) {
        this.name = name;
        this.symptom = symptom;
        this.age = age;
        this.illness = illness;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public int getAge() {
        return age;
    }

    public String getSymptom() {
        return symptom;
    }

    public String getName() {
        return name;
    }

    public String getIllness() {
        return illness;
    }

    public abstract void showSymptom();

    public void showMsg() {
        System.out.printf("动物种类:%s,年龄:%d\n", name, age);
        System.out.printf("入院原因:%s\n", illness);
    }
}

class Duck extends Poultry {
    public Duck(String name, String symptom, int age, String illness) {
        super(name, symptom, age, illness);
    }

    public Duck() {
    }

    public void getMsg() {
        super.showMsg();
        showSymptom();
    }

    public void showSymptom() {
        System.out.printf("症状:%s\n", getSymptom());
    }
}


public class Test7 {
    public static void main(String[] args) {
        Duck duck = new Duck("夹娃", "发烧48.8", 0, "感冒99天");
        duck.getMsg();
    }
}
