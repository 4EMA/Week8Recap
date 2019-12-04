package task2_Constructor;

public class Person {
    public int age;
    public String name;
    public String lastName;

    public String toString (){

        return "Name and Last name : " + name + " " + lastName;
    }

    public  Person ( String name,String lastName, int age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;

    }
    public Person (int age){
        this.age = age;
    }
}
 class Sena {
     public static void main(String[] args) {
         // without constructor
//         Person s = new Person();
//         s.name = "Sena";
//         s.lastName = "Ulgur";
//         s.age = 21;

         // with constructor
         Person s = new Person("Sena","Ulgur ",21);
         System.out.println(s.toString());
     }
    
 }
 class Ahmet {
     public static void main(String[] args) {
         Person a = new Person(18);
         if (a.age> 21){
             System.out.println("you can enter");
         }
         else
             System.out.println("you can not enter");
     }
 }
