package project;

import java.util.Scanner;

public class ATM {
    private int balance;
    private int pin;

    public ATM(int balance, int pin) { 
        this.balance = balance;
        this.pin = pin;
    }

    public void displayMenu() {
        System.out.println("1: Check Balance");
        System.out.println("2: Deposit");
        System.out.println("3: Withdraw");
        System.out.println("4: Change PIN");
        System.out.println("5: Exit");
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount; // Add to current balance
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
            return;
        }
        if (balance < amount) {
            System.out.println("Insufficient Funds");
        } else {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        }
    }

    public int getBalance() {
        return balance;
    }

    public boolean validatePin(int pin) {
        return this.pin == pin;
    }

    public void changePin(int newPin) {
        pin = newPin;
        System.out.println("PIN Changed!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM(1000, 1234);
        atm.displayMenu();
        
        System.out.print("Enter the PIN: ");
        int pin = scanner.nextInt();
        
        if (atm.validatePin(pin)) {
            int option = 0;
            while (option != 5) {
                atm.displayMenu();
                System.out.print("Select an option: ");
                option = scanner.nextInt();
                
                switch (option) {
                    case 1:
                        System.out.println("Balance: " + atm.getBalance());
                        break;
                    case 2:
                        System.out.print("Enter Amount: ");
                        int depositAmount = scanner.nextInt();
                        atm.deposit(depositAmount);
                        break;
                    case 3:
                        System.out.print("Enter Amount: ");
                        int withdrawAmount = scanner.nextInt();
                        atm.withdraw(withdrawAmount);
                        break;
                    case 4:
                        System.out.print("Enter New PIN: ");
                        int newPin = scanner.nextInt();
                        atm.changePin(newPin);
                        break;
                    case 5:
                        System.out.println("Thank you for using the ATM.");
                        break;
                    default:
                        System.out.println("Invalid option! Please try again.");
                        break;
                }
            }
        } else {
            System.out.println("You have entered an invalid PIN!");
        }
        
        scanner.close();
    }
}