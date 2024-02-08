import java.util.Scanner;

public class JavaExamples {

    public static void main(String[] args) {
        // Example:1 - Ask for season of the year

		/* System.out.println("Enter the season of the year");
		Scanner scanner = new Scanner(System.in);
		String season = scanner.next();

		// Ask for any number
		System.out.println("Enter any number");
		int number = scanner.nextInt();

		// Ask for an adjective
		System.out.println("Enter any adjective");
		String adj = scanner.next();
		scanner.close();

		System.out.println("On a " + adj + " " + season + " day, I drink a minimum of " + number + " cups of cofee"); */

        // Example:2 - All salespeople get a payment of 1000 for a week. Salespeople who exceed 10 sales
        //             get an additional bonus of 250.  [If statement]

	/* int payment = 1000;
	int bonus = 250;
	int quota = 10;

	System.out.println("How many sales are done by the person?");
	Scanner scanner = new Scanner(System.in);
	int sales = scanner.nextInt();
	scanner.close();

	if (sales > quota) {
		payment = payment + bonus;
	}

	System.out.println("The payment of the person is $" + payment); */

        // Example:3 - All salespeople are expected to make at least 10 sales a week.
        //             For those who do, they receive a congratulatory message.
        //             For those who don't, they are informed of how many sales they are short. [If-Else statement]

	/* int quota = 10;

	System.out.println("How many sales are done by you?");
	Scanner scanner = new Scanner(System.in);
	int sales = scanner.nextInt();
	scanner.close();

	if(sales >= quota)
		System.out.println("Congratulations, you made it this week.");

	else {
		int difference = quota - sales;
		System.out.println("You fall short with " + difference + " sales.");
		}*/

        // Example:4 - To qualify for a loan, a person must make at least $30000 and have been working at their
        //             current job for at least 2 years. [Nested If statements]

	/* int expected_salary = 30000;
	int expected_years = 2;

	System.out.println("What is your current salary?");
	Scanner scanner = new Scanner(System.in);
	double current_salary = scanner.nextDouble();

	System.out.println("For how many years you are working in your current job?");
	double current_years = scanner.nextDouble();
	scanner.close();

	if(current_salary >= expected_salary) {
		if(current_years >= expected_years) {
			System.out.println("Congrats, you qualify for the loan.");
		}
		else {
			System.out.println("You must have worked at least " + expected_years + " years in the current job to qualify for the loan.");
		}
	}
	else {
		System.out.println("Your salary must be at least " + expected_salary + " to qualify for the loan");
	} */

        // Example:5 - Display a letter grade for the student based on their test score. [If-Else-If statement]

	/* System.out.println("Enter your test score:");
	Scanner scanner = new Scanner(System.in);
	double score = scanner.nextDouble();

	char grade;

	if (score <= 60){
		grade = 'F';
	}
	else if (score<= 70) {
		grade = 'D';
	}
	else if (score<=80) {
		grade = 'C';
	}
	else if (score <=90) {
		grade = 'B';
	}
	else {
		grade = 'A';
	}

	System.out.println("Your grade is " + grade); */


        // Example:6 - Have a user enter their grade, print out a message letting them know how they did.
        //             [Switch Case statement]

	/* System.out.println("Enter your grade letter:");
	Scanner scanner = new Scanner(System.in);
	String grade = scanner.next();
	scanner.close();

	String message;

	switch (grade) {
		case "A":
			message = "Excellent job!";
			break;

		case "B":
			message = "Great job!";
			break;

		case "C":
			message = "Good job!";
			break;

		case "D":
			message = "You need to work a bit harder.";
			break;

		case "F":
			message = "Uh Oh.";
			break;

		default:
			message = "Error. Invalid input!";
			break;
	}

	System.out.println(message); */


        // Example:7 - Each store employee makes $15 an hour, write a program that allows the employee to enter the number
        //             of hours worked for the week. Do not allow overtime. [While loop]

	/* int rate = 15;
	int max_hours = 600;

	System.out.println("Enter the number of hours worked this week:");
	Scanner scanner = new Scanner(System.in);
	double hours_worked = scanner.nextDouble();

	while (hours_worked > max_hours || hours_worked < 1) {
	System.out.println("Invalid input ! Enter any value between 1 and 600");
	hours_worked = scanner.nextDouble();

	}
	scanner.close();

	double gross_pay = hours_worked*rate;
	System.out.println("Your gross pay is $" + gross_pay); */


        // Example:8 - Write a program to allow user to enter any 2 numbers, and then sum up the 2 numbers. User should be able
        //             to repeat this action until they indicate they are done. [Do While loop]

	/* Scanner scanner = new Scanner(System.in);
	boolean again;
	do {
		System.out.println("Please enter 1st number");
		double num1 = scanner.nextDouble();

		System.out.println("Please enter 2nd number");
		double num2 = scanner.nextDouble();

		double sum = num1 + num2;
		System.out.println("The sum of the numbers is: " + sum);
		System.out.println("Would you like to start over? Enter true or false.");
		again = scanner.nextBoolean();

	} while (again);
	  scanner.close(); */

        // Example:9 - Search an input string to determine if it contains the letter 'A'. [For loop]

	/* System.out.println("Enter some text");
	Scanner scanner = new Scanner(System.in);
	String text = scanner.next();
	scanner.close();

	boolean letter_found = false;

	for (int i=0; i<text.length(); i++) {
		char current_letter = text.charAt(i);
		if (current_letter == 'A' || current_letter == 'a') {
			letter_found = true;
			break;
	        }
	   }

	if(letter_found) {
		System.out.println("This text contains letter a.");
		}else {
			System.out.println("This text does not contains letter a.");
		   } */

        // Example:10 - Find the average test scores for each student in the class. There are 24 students and 4 tests.
        //              [Nested For loop]

	/* int no_of_students = 24;
	int no_of_tests = 4;
	Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < no_of_students; i++) {
		double total = 0;
		for (int j=0; j<no_of_tests; j++) {
			System.out.println("Enter the score of Test #" + (j+1) + " of Student #" + (i+1));
			double score = scanner.nextDouble();
			total = total+score;
		}

		double avg = total/no_of_tests;
		System.out.println("Average score for Student #" + (i+1) + " is " + avg);
	}
	  scanner.close(); */

    }
}
