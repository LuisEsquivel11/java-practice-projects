package decision_structure;

import java.util.Scanner;

public class GradeMessage_SwitchExpressions {//================= Switch Expressions =======================

    public static void main(String[] args) {
        System.out.println("Enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();


        String message = switch(grade) {
            case "A" -> "Excellent job!";
            case "B", "B+" -> "Great Job!";
            case "C" -> "Good Job!";
            case "D" ->  "You need to do better";
            case "F" -> "Uh oh!";
            default ->  "Error. Invalid grade";
        };

        System.out.println(message);
    }
}
