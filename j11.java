
/*
Part 4: Putting It All Together
Create a Student class with the following properties: name, grade, and age. Implement the following
methods:
setName(String name): Sets the student's name.
getGrade(): Returns the student's grade.
incrementAge(): Increments the student's age by 1.
printStudentInfo(): Prints the student's name, grade, and age.
In the main method, create an array of Student objects and perform the following tasks:
Prompt the user to enter the number of students.
Create the Student objects and populate their information.
Use a for loop to iterate through the array and call the printStudentInfo() method for each
student.
Find the student with the highest grade and print their information.
Note: Remember to include appropriate comments and documentation throughout your code to
make it more readable and maintainable.
*/
import java.util.Scanner;

class student {
   private String name;
   private char grade;
   private int age;

   public student(String name, char grade, int age) {
      this.name = name;
      this.grade = grade;
      this.age = age;
   }

   public void setdata(String name, char grade, int age) {
      this.name = name;
      this.grade = grade;
      this.age = age;

   }

   public void setName(String name) {
      this.name = name;
   }

   public char getGrade() {
      return this.grade;
   }

   public String getname() {
      return this.name;
   }

   public void incrementAge() {
      this.age = this.age + 1;
   }

   public void printStudentInfo() {
      System.out.println("name : " + name);
      System.out.println("grade : " + grade);
      System.out.println("age : " + age);
   }

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int total_s = input.nextInt();
      input.nextLine();
      student[] s = new student[total_s];
      String n;
      char g;
      int a;
      for (int i = 0; i < total_s; i++) {
         System.out.println("Enter name : ");
         n = input.nextLine();
         System.out.println("Enter grade : ");
         g = input.nextLine().charAt(0);
         System.out.println("Enter age : ");
         a = input.nextInt();
         input.nextLine();
         s[i] = new student(n, g, a);
         // s[i] ;
      }

      for (int i = 0; i < total_s; i++) {

         s[i].printStudentInfo();
      }

      char highest_grade = ' ';
      // String highest_grade_s = "";
      // highest grade
      for (int i = 0; i < total_s; i++) {
         if (s[i].getGrade() > highest_grade) {
            highest_grade = s[i].getGrade();
            System.out.println("hiest : ");
            // highest_grade_s = s[i].getname();
            s[i].printStudentInfo();
         }

      }
      // tem.out.println(highest_grade_s)
   }
}