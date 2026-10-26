# Banking System

A simple Java console application built to practice Object-Oriented Programming (OOP), collections, and exception handling.

## Features

- Create bank accounts with an owner and starting balance.
- Deposit and withdraw money with input validation.
- Use **SavingsAccount** to add 5% interest.
- Use **CheckingAccount** to charge a 100-unit withdrawal fee.
- View account owners and balances.
- Find accounts by ID using a `HashMap`.
- Track unique account IDs using a `HashSet`.
- Handle invalid operations with exceptions, including a custom `InsufficientFundsException`.

## Technologies

- Java
- Java Collections Framework: `ArrayList`, `HashMap`, `HashSet`
- `Scanner` for console input

## OOP Concepts

- **Encapsulation:** private account fields with public methods for controlled access.
- **Inheritance:** `SavingsAccount` and `CheckingAccount` extend `BankAccount`.
- **Polymorphism:** `CheckingAccount` overrides `withdraw()` to include a fee.
- **Constructors:** initialize accounts with an owner and balance.
- **Exception handling:** `throw`, `try`, `catch`, and a custom runtime exception.

## How to Run

Make sure Java is installed, then open a terminal in the folder containing `clasees.java`.

```bash
javac clasees.java
java clasees
```

Enter an account ID when prompted (for example, `101` or `102`).

## Notes

This is a learning project. Account data is stored in memory and resets when the program stops. Transfers between accounts are not implemented yet.
