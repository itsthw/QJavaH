import java.util.*;

/*
Write a program to enter your computer marks through the keyboard
and output the grade
 */

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int marks;
        System.out.print("Enter marks: ");
        marks = input.nextInt();
        if (marks > 79) {
            System.out.println("Distinction");
        } else if (marks > 60) {
            System.out.println("Credit");
        } else if (marks > 49) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
