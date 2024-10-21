import java.util.Scanner;

public class Person {

     String name;
     int age;
     String gender;

    
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

   
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

  
        System.out.print("Enter name: ");
        String name = p.nextLine();

        System.out.print("Enter age: ");
        int age = p.nextInt();
        p.nextLine(); 

        System.out.print("Enter gender: ");
        String gender = p.nextLine();

        
        Person pr = new Person(name, age, gender);

       
        System.out.println("\nPerson Details:");
        System.out.println("Name: " + pr.getName());
        System.out.println("Age: " + pr.getAge());
        System.out.println("Gender: " + pr.getGender());

        p.close();
    }
}

/*

Enter name: khushi
Enter age: 19
Enter gender: female

Person Details:
Name: khushi
Age: 19
Gender: female

*/
