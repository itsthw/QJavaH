import java.util.*;

/*
Write a program to input 10 numbers from the keyboard
and find how many odd numbers and how many even numbers were entered
 */

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, evenCount = 0, oddCount = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a number #" + (i + 1) + ": ");
            num = input.nextInt();
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
    }
}
