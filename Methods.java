import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        // Example:11 - Write a method thats asks user their name and then greet them by their name. [Creating Method]

        System.out.println("Enter your name :");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        scanner.close();
        greetUser(name);
    }

    public static void greetUser(String name) {
        System.out.println("Hi There " + name + " !!");

    }


}