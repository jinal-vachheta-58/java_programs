/*
 Q: Write a program to calculate the grade of a student. There are five subjects. Marks in each subject are entered from keyboard.
Assign grade based on the following rule:
Total Marks >= 90 Grade: Ex
90 > Total Marks >= 80 Grade: A
80 > Total Marks >;= 70 Grade: B
70 > Total Marks >= 60 Grade: C
60 > Total Marks Grade: F
 */

import java.util.Scanner;

public class q11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int totalMarks = 0;
        int numSubjects = 5;
        
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = sc.nextInt();
            totalMarks += marks; 
        }
        
        double avgeMarks = (double) totalMarks / numSubjects;
        
        String grade;
        if (avgeMarks >= 90) {
            grade = "Excellent";
        } else if (avgeMarks >= 80) {
            grade = "A";
        } else if (avgeMarks >= 70) {
            grade = "B";
        } else if (avgeMarks >= 60) {
            grade = "C";
        } else {
            grade = "F";
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Marks: %.2f%n", avgeMarks);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}

/*
 
Z:\java(sessional-1)\problem statement>java q11
Enter marks for subject 1: 56
Enter marks for subject 2: 98
Enter marks for subject 3: 32
Enter marks for subject 4: 56
Enter marks for subject 5: 43
Total Marks: 285
Average Marks: 57.00
Grade: F
 */