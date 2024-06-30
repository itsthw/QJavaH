import java.util.*;

/*
Write a program to obtain series of positive numbers from the keyboard
and display the sum of the numbers.
Assume that the user type the sentinel value -1 to indicate end of data entry
 */

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0, sum = 0;
        System.out.println("Enter -1 to end the data entries");
        while (num != -1) {
            System.out.print("Enter number: ");
            num = input.nextInt();
            if (num > 0) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
