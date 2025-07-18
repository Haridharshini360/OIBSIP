import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance = 10000;
		int pin = 1234;

		System.out.print("Enter your PIN: ");
		int enteredPin = sc.nextInt();

		if (enteredPin == pin) {
			int choice;
			do {
				System.out.println("\n===== ATM Menu =====");
				System.out.println("1. Check Balance");
				System.out.println("2. Deposit");
				System.out.println("3. Withdraw");
				System.out.println("4. Exit");
				System.out.print("Choose an option: ");
				choice = sc.nextInt();

				switch (choice) {
				case 1:
					System.out.println("Your current balance is: b9" + balance);
					break;
				case 2:
					System.out.print("Enter amount to deposit: ");
					int deposit = sc.nextInt();
					balance += deposit;
					System.out.println("b9" + deposit + " deposited successfully.");
					break;
				case 3:
					System.out.print("Enter amount to withdraw: ");
					int withdraw = sc.nextInt();
					if (withdraw <= balance) {
						balance -= withdraw;
						System.out.println("b9" + withdraw + " withdrawn successfully.");
					} else {
						System.out.println("Insufficient balance!");
					}
					break;
				case 4:
					System.out.println("Thank you for using our ATM. Goodbye!");
					break;
				default:
					System.out.println("Invalid option. Please try again.");
				}

			} while (choice != 4);

		} else {
			System.out.println("Incorrect PIN! Access denied.");
		}

		sc.close();
	}
}