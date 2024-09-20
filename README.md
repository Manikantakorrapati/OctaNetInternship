# OctaNetInternship

# ATM Machine Simulation

## Overview

This is a simple Java console application that simulates the basic operations of an Automated Teller Machine (ATM). It includes functionalities such as checking account balance, cash deposit, cash withdrawal, PIN change, and transaction exit. This project was developed as a part of a Java internship task (Octanet Task 1).

## Features

The ATM simulation includes the following features:
1. **Account Balance Inquiry**: Check the current balance of the account.
2. **Cash Deposit**: Deposit a specified amount of cash into the account.
3. **Cash Withdrawal**: Withdraw a specified amount of cash from the account (with validation for insufficient balance).
4. **PIN Change**: Change the account’s PIN for enhanced security.
5. **Transaction History**: All transactions and PIN changes are reflected immediately, but a separate history log is not maintained in this basic version.

## Getting Started

### Prerequisites

Ensure you have the following tools installed on your system:
- Java Development Kit (JDK) 8 or higher
- Any Java IDE (like IntelliJ IDEA, Eclipse, or NetBeans) or a text editor
- Basic understanding of Java programming and command-line operations

### How to Run

1. **Clone or Download the Project**:
   - Clone the repository or download the source files and place them in your preferred project directory.

2. **Compile and Run**:
   - Open the project in your IDE or terminal.
   - Compile and run the `ATM.java` file.
   
3. **Follow the Instructions**:
   - After launching the application, enter your 4-digit PIN to access the ATM services.
   - You will be presented with a menu to perform the following operations:
     - Check Balance
     - Deposit Money
     - Withdraw Money
     - Change PIN
     - Exit

4. **Exit**:
   - To exit the application, select option 5.

### Code Structure

- **ATM Class**: Contains all the logic for the ATM functions, such as balance inquiry, deposit, withdrawal, PIN change, and PIN validation.
- **Main Method**: Drives the program by displaying the menu, accepting user inputs, and calling appropriate methods.

### Example

```
1: Check Balance
2: Deposit
3: Withdraw
4: Change PIN
5: Exit

Enter the PIN: 1234
Balance: 1000

Select an option: 2
Enter Amount: 500
Deposited: 500

Select an option: 1
Balance: 1500
```

### Error Handling

- The program handles invalid PIN entries, invalid deposit/withdrawal amounts, and insufficient balance during withdrawals.
- Users are prompted to retry if they enter an invalid option from the menu.

## Improvements

Some potential improvements that can be made to this ATM simulation include:
- **Transaction History**: Adding functionality to track and display the transaction history.
- **Account Management**: Support for multiple accounts with different PINs.
- **Advanced Security Features**: Implementing timeouts and lockouts after multiple failed PIN entries.

## Contributing

This project is a basic version, but contributions are welcome to extend its features. You can fork this repository and submit pull requests for any new features or bug fixes.

## License

This project is for educational purposes as part of an internship task. You are free to modify and use it as needed.

