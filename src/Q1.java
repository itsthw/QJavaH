import java.util.*;

/*Write a program to input 3 integers
and print the largest and the smallest of the 3 numbers entered
 */

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Integer> numArr = new LinkedList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter number #" + (i + 1) + ": ");
            int num = input.nextInt();
            numArr.add(num);
        }

        int largest = numArr.getFirst();
        int smallest = numArr.getFirst();

        for (int k : numArr) {
            if (k > largest) {
                largest = k;
            }
            if (k < smallest) {
                smallest = k;
            }
        }

        System.out.println("Largest number is " + largest);
        System.out.println("Smallest number is " + smallest);
    }
}