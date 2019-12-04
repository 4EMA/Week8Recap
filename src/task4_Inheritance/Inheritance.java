package task4_Inheritance;

// create a Person class,
// assign at least 3 attributes to it,
// then create a new class with your name which inherits from Person class
// and assign values to your attributes.

public class Inheritance {


}
class Person {
    public String name;
    public String lastName;
    public int age;

}
class Ema extends Person{

    public Ema (String name, String lastName,int age) {

        this.name = name;
        this.lastName = lastName;
        this.age = age;


    }

    public static void main(String[] args) {
        Ema s = new Ema("Ema ", " Barutcu" ,37 );
        System.out.println(s.name + s.lastName +"\n" + s.age + " \n" );
    }
}