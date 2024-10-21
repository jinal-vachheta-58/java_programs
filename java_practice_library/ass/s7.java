/*1. Create a Person class with the following properties: name, age, and gender. Implement
methods to set and get these properties.
*/

import java.util.Scanner;
class person{

    String name;
    int age;
    String gender;

    person(String name,int age,String gender)
    {
        this.name = name;
        this.age = age;
        this.gender=gender;
    }

    String getname()
    {
        return name;
    }

     int getage()
    {
        return age;
    }

    String getGender()
    {
        return gender;
    }

    String setName(String name)
    {
        return this.name = name;
    }

    void setAge(int age)
    {
        if(age>0)
        {
             this.age = age;
        }

        else
        {
             System.out.println("age can not be negative");
        }
    }

    String setGender(String gender)
    {
        return this.gender = gender;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the name:");
        String name = sc.nextLine();

        System.out.println("enter the age:");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("enter the gender:");
        String gender = sc.nextLine();

        person p1 = new person(name,age,gender);

        System.out.println("details:");
        System.out.println("name:"+p1.getname());
        System.out.println("age:"+p1.getage());
        System.out.println("gender:"+p1.getGender());

        sc.close();
        
    }


/*

enter the name:
khushi
enter the age:
19
enter the gender:
female

details:

name:khushi
age:19
gender:female

*/