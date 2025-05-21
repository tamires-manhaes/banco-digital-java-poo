# Bank Account Management System
A Java-based banking system that simulates basic banking operations such as deposits, transfers, and account statement generation. The system supports different types of accounts (Checking and Savings accounts) and provides basic banking functionality.

## Features

- 🏦 Account Management
  - Create checking and savings accounts
  - Link accounts to customers
- 💰 Financial Operations
  - Deposit funds
  - Transfer money between accounts
- 📊 Account Information
  - Generate account statements
  - View account details

## Technologies

- Java 24
- Object-Oriented Programming principles
  - Inheritance
  - Encapsulation
  - Abstraction

## Project Structure

The project consists of several key classes:
- `Banco` - Represents the bank entity
- `Cliente` - Manages customer information
- `Conta` - Abstract base class for different account types
- `ContaCorrente` - Implementation of checking account
- `ContaPoupanca` - Implementation of savings account

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 24 or higher
- Any Java IDE (IntelliJ IDEA, Eclipse, etc.)

### Installation

1. Clone the repository
   ```bash
    git clone [https://github.com/tamires-manhaes/banco-digital-java-poo.git](https://github.com/tamires-manhaes/banco-digital-java-poo.git)
2. Navigate to the project directory
    ```bash
    cd banco-digital-java-poo
3. Compile the project
    ```bash
    javac *.java

4. Run the application
   ```bash
   java Main

## Contributing
Contributions are welcome! Please feel free to submit a Pull Request. For major changes, please open an issue first to discuss what you would like to change.
    1. Fork the project
    2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
    3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
    4. Push to the branch (`git push origin feature/AmazingFeature`)
    5. Open a Pull Request

## Author
    Tamires Pimenta - [GitHub Profile](https://github.com/tamires-manhaes)

## Acknowledgments
- Inspired by DIO Challenge
- Built as a practical implementation of OOP concepts in Java
