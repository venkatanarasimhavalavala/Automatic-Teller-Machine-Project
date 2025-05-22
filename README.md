# Automatic-Teller-Machine-Project
An Simple bank management system java Project using swing and awt packages along with MySQL server.

Project Overview
This ATM Banking System is a Java-based graphical user interface (GUI) application that simulates the core functionalities of an Automated Teller Machine (ATM). The project is built using Java Swing for the front-end and a MySQL database for backend storage of user data and transactions.

Features
User Authentication (via PIN - assumed to be handled elsewhere in your full project)
Withdraw Money
Fast Cash Withdrawal with predefined amounts
Mini Statement displaying recent transaction history
PIN Change functionality allowing users to update their PIN securely
Balance Enquiry to view the current account balance
Navigation between transactions

Technologies Used
Java SE (Swing for GUI)
JDBC (Java Database Connectivity)
MySQL (for managing user and transaction data)
Image handling for UI design using ImageIcon

Project Structure
Withdrawl.java - Allows the user to withdraw a custom amount from their account.
FastCash.java - Allows quick withdrawal with fixed amounts.
MiniStatement.java - Shows the recent transactions of the user.
PinChange.java - Enables changing the user's PIN.
BalanceEnquiry.java - Displays the current balance for the user.
Transaction.java (assumed from references) - Manages navigation and transaction choices.
Conn.java - Handles the database connection and SQL execution.

How to Run
Set up the MySQL database and create required tables:
bank table (to store transaction records)
login and signupthree tables (for user credentials and info)
Update the database connection parameters in Conn.java (not shown here).
Compile all .java files.
Run the Transaction class (or entry point in your project).
Use the GUI to interact with ATM functionalities.

