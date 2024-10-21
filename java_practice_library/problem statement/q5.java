/*
 Q: Write a Java Application to read the name of a student (studentName), roll Number (rollNo) and marks (totalMarks) obtained.
rollNo may be an alphanumeric string. Display the data as read..
 */

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the student's name: ");
        String stu_name = sc.nextLine();

        System.out.print("Enter the roll number: ");
        String rollno = sc.nextLine();

        System.out.print("Enter the total marks obtained: ");
        int marks = sc.nextInt();

        System.out.println("\nStudent Information:");
        System.out.println("Name: " + stu_name);
        System.out.println("Roll Number: " + rollno);
        System.out.println("Total Marks: " + marks);

        sc.close();
    }
}

/*

Enter the student's name: khushi
Enter the roll number: mcs45
Enter the total marks obtained: 98

Student Information:
Name: khushi
Roll Number: mcs45
Total Marks: 98

*/
