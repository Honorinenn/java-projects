package smu.edu;
import java.util.Scanner;

public class HelloAndAdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scan.nextLine();

        System.out.println("Hello, " + name);

        System.out.println("Please enter a number.");
        int numberOne = Integer.parseInt(scan.nextLine());

        System.out.println("Please enter another number");
        int numberTwo = Integer.parseInt(scan.nextLine());

        int sum = numberOne + numberTwo;
        System.out.println("The sum of those numbers is " + sum);

    }
}
