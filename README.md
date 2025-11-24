# Bank Management System

## Overview
This is a simple console-based banking application written in Java. It simulates basic banking operations like creating an account, logging in, and managing money. The project uses Java's Collection framework (specifically HashMaps and ArrayLists) to store user data and transaction logs temporarily while the program is running.

## Features
* **Register & Login:** Users can sign up with a username and password, and log in to access their account.
* **Deposit & Withdraw:** Simple menu options to add or remove money from the balance.
* **Validations:** The system prevents negative inputs (like depositing -500) and checks if you have enough balance before withdrawing.
* **Mini Statement:** Shows a history of all deposits and withdrawals made during the current session.
* **Session Management:** Keeps the user logged in until they choose to logout.

## Technologies/tools used
* **Language:** Java (Core)
* **Key Concepts:** OOPs, Collections (Map, List), Exception Handling logic.
* **IDE:** Works with any Java IDE (IntelliJ, Eclipse) or just the command line.

## Steps to install & run the project
1.  Download the code or clone this repo:
    ```bash
    git clone [https://github.com/your-username/your-repo-name.git](https://github.com/your-username/your-repo-name.git)
    ```
2.  Open the folder in your terminal.
3.  Compile the Java files:
    ```bash
    javac *.java
    ```
4.  Run the main class:
    ```bash
    java Main
    ```

## Instructions for testing
1.  Run the app and choose **Option 1** to register a new user.
2.  Enter a username and a password (needs to be at least 8 chars).
3.  Choose **Option 2** to login with those details.
4.  Try **Option 3** to deposit some money.
5.  Try **Option 4** to withdraw (try withdrawing more than you have to see the error).
6.  Select **Option 5** to see your transaction history.

## Screenshots
*(Place your screenshot here)*
![Console Output](link-to-image.png)
