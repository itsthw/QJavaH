import java.util.*;

/*
Write a program to input marks of 100 students
and to display number of pass-fail students
Pass (Marks >= 50), else fail
 */

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int marks, passCount = 0, failCount = 0;

        for (int i = 0; i < 100; i++) {
            System.out.print("Enter marks of student #" + (i + 1) + ": ");
            marks = input.nextInt();
            if (marks >= 50) {
                passCount++;
            } else {
                failCount++;
            }
        }

        System.out.println("Number of passed students: " + passCount);
        System.out.println("Number of failed students: " + failCount);
    }
}
