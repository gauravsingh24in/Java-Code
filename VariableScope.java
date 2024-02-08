import java.util.Scanner;

public class VariableScope {

    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Write an instant credit check program that approves anyone who makes more than $25000 and has a credit score of 700 or above.
        // Reject all others.

        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();
        boolean qualified = isUserQualified(creditScore, salary);
        notifyUser(qualified);
    }

    public static double getSalary() {
        System.out.println("Enter your current salary.");
        double salary = scanner.nextDouble();
        return salary;
    }

    public static int getCreditScore() {
        System.out.println("Enter your credit score.");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    public static boolean isUserQualified(int creditScore, double salary) {
        if (creditScore >= requiredCreditScore && salary >= requiredSalary) {
            return true;
        }else {
            return false;
        }

    }

    public static void notifyUser(boolean isQualified) {
        if (isQualified) {
            System.out.println("Congrats! You have been apprpoved.");
        } else {
            System.out.println("Sorry, you have been denied.");
        }

    }
}