package decision_structure;

import java.util.Scanner;

public class SalaryCalculator {//========================= If statement ===========================

    public static void main(String[] args) {
/* All sales people get a payment of $1000 for the week.
        Sales people who exceed 10 sales get an additional bonus of $250 */

        double salary = 1000;
        double bonus = 250;
        int quota = 10;

        System.out.println("How many sales did the employee get this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();

        if(sales > quota) {
            salary = salary + bonus;
        }

        System.out.println("Salary: " + salary);


    }
}
