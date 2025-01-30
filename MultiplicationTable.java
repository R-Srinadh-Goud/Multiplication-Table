import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Ask user for the number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Print multiplication table
        System.out.println("Multiplication table for " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
        
        sc.close();
    }
}

