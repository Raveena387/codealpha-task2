import java.util.Scanner;
public class BankingApplication {
private double balance;
public BankingApplication() {
this.balance = 0.0; 
}
public void deposit(double amount) {
if (amount > 0) {
balance += amount;
System.out.println("Deposited: $" + amount);
} else {
System.out.println("Invalid deposit amount!");
}
}
public void withdraw(double amount) {
if (amount > 0 && amount <= balance) {
balance -= amount;
System.out.println("Withdrawn: $" + amount);
} else if (amount > balance) {
System.out.println("Insufficient balance!");
} else {
System.out.println("Invalid withdrawal amount!");
}
}
public void checkBalance() {
System.out.println("Current Balance: $" + balance);
}
public void showMenu() {
Scanner scanner = new Scanner(System.in);
int choice;
do {
System.out.println("\nWelcome to the Simple Banking Application");
System.out.println("1. Deposit");
System.out.println("2. Withdraw");
System.out.println("3. Check Balance");
System.out.println("4. Exit");
System.out.print("Enter your choice: ");
choice = scanner.nextInt();
switch (choice) {
case 1:
System.out.print("Enter deposit amount: ");
double depositAmount = scanner.nextDouble();
deposit(depositAmount);
break;
case 2:
System.out.print("Enter withdrawal amount: ");
double withdrawalAmount = scanner.nextDouble();
withdraw(withdrawalAmount);
break;
case 3:
checkBalance();
break;
case 4:
System.out.println("Thank you for using the banking application. Goodbye!");
break;
default:
System.out.println("Invalid choice! Please try again.");
}
} while (choice != 4);
scanner.close();
}
public static void main(String[] args) {
BankingApplication app = new BankingApplication();
app.showMenu();
}
}
