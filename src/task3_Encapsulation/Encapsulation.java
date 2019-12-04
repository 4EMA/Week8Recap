package task3_Encapsulation;

// create a private attribute as name,
// then create the getName and setName methods and call them from another class

public class Encapsulation {
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
class Age {
    public static void main(String[] args) {
        Encapsulation s = new Encapsulation();
        s.setAge(35);
        System.out.println(s.getAge());


    }
}
