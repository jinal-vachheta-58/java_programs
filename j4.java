// 1. Create a Person class with the following properties: 
// name, age, and gender. Implement
// methods to set and get these properties.
import java.util.Scanner;
class person{
    private String name;
    private int age;
    private char gender;

    // constructor 
    public person(String name, int age, char gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    private void getdata()
    {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.gender);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        person p1 = new person("jinal",18,'f');
        p1.getdata();
    }
}
