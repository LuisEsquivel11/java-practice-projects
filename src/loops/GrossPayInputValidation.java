package loops;

import java.util.Scanner;

public class GrossPayInputValidation {

    public static void main(String[] args) {//================= While loop ================

        /* Each store employee makes $15 an hour. Write a program
        that allows the employee to enter the number
        of hours worked for the week. Do not allow overtime. */

        double rate = 15;
        double maxHours = 40;

        System.out.println("How many hours did you work");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        while(hoursWorked > maxHours || hoursWorked < 0) {
            System.out.println("Invalid entry. Your hours must be between 1 and 40.Try again.");
            hoursWorked = scanner.nextDouble();
        }

        scanner.close();

        double grossPay = hoursWorked * rate;
        System.out.println("Gross pay: " + grossPay);
    }
}
