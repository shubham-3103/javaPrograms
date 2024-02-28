package AbcdBank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
/**
 * @author shubh
 *
 */
public class AbcdBankTask {

    // JDBC URL, username, and password
    static final String JDBC_URL = "jdbc:mysql://localhost:3306/abcdbank";
    static final String USERNAME = "root";
    static final String PASSWORD = "root";

    // JDBC variables
    static Connection connection = null;
    static PreparedStatement preparedStatement = null;
    static ResultSet resultSet = null;

    public static void main(String[] args) {
        try {
            // Connect to the database
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

            // Create the menu
            Scanner scanner = new Scanner(System.in);
            int choice;
            do {
                System.out.println("Bank Account Menu:");
                System.out.println("1. Open New Account");
                System.out.println("2. Modify Personal Details");
                System.out.println("3. Display Account Information");
                System.out.println("4. Close Account");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        openNewAccount();
                        break;
                    case 2:
                        modifyPersonalDetails();
                        break;
                    case 3:
                        displayAccountInformation();
                        break;
                    case 4:
                    	closeAccount();
                    	break;
                    case 5:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number from 1 to 5.");
                }
            } while (choice != 4);

            // Close the database connection
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to open a new account
    static void openNewAccount() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter customer name: ");
            String customerName = scanner.nextLine();
            System.out.print("Enter initial balance: ");
            double initialBalance = scanner.nextDouble();

            // Check if initial balance is less than 1000
            if (initialBalance < 1000) {
                System.out.println("Less balance. Minimum balance should be 1000.");
                return;
            }

            // Insert new account into the database
            String insertQuery = "INSERT INTO account (customer_name, balance, opening_date) VALUES (?, ?, CURDATE())";
            preparedStatement = connection.prepareStatement(insertQuery, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, customerName);
            preparedStatement.setDouble(2, initialBalance);
            preparedStatement.executeUpdate();

            // Retrieve the generated account number
            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            int accountNumber = -1;
            if (generatedKeys.next()) {
                accountNumber = generatedKeys.getInt(1);
            }

            if (accountNumber != -1) {
                // Display account details
                System.out.println("New account opened successfully.");
                System.out.println("Account Number: " + accountNumber);
                System.out.println("Customer Name: " + customerName);
                System.out.println("Initial Balance: Rs." + initialBalance);
            } else {
                System.out.println("Failed to retrieve account number.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to modify personal details
    static void modifyPersonalDetails() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter account number: ");
            int accountNumber = scanner.nextInt();

            // Check if account exists
            String checkAccountQuery = "SELECT * FROM account WHERE account_number = ?";
            preparedStatement = connection.prepareStatement(checkAccountQuery);
            preparedStatement.setInt(1, accountNumber);
            resultSet = preparedStatement.executeQuery();

            if (!resultSet.next()) {
                System.out.println("Account not found.");
                return;
            }

            // Modify personal details
            System.out.print("Enter new customer name: ");
            String newCustomerName = scanner.nextLine();
            scanner.nextLine(); // Consume newline character
            System.out.print("Enter new balance: ");
            double newBalance = scanner.nextDouble();

            // Update account details in the database
            String updateQuery = "UPDATE account SET customer_name = ?, balance = ? WHERE account_number = ?";
            preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setString(1, newCustomerName);
            preparedStatement.setDouble(2, newBalance);
            preparedStatement.setInt(3, accountNumber);
            preparedStatement.executeUpdate();
            System.out.println("Personal details modified successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to display account information
    static void displayAccountInformation() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter account number: ");
            int accountNumber = scanner.nextInt();

            // Retrieve account information from the database
            String selectQuery = "SELECT * FROM account WHERE account_number = ?";
            preparedStatement = connection.prepareStatement(selectQuery);
            preparedStatement.setInt(1, accountNumber);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                System.out.println("Account Number: " + resultSet.getInt("account_number"));
                System.out.println("Customer Name: " + resultSet.getString("customer_name"));
                System.out.println("Balance: Rs." + resultSet.getDouble("balance"));
                System.out.println("Opening Date: " + resultSet.getDate("opening_date"));
            } else {
                System.out.println("Account not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    static void closeAccount() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter account number: ");
            int accountNumber = scanner.nextInt();

            // Check if the account exists
            String checkAccountQuery = "SELECT opening_date FROM account WHERE account_number = ?";
            preparedStatement = connection.prepareStatement(checkAccountQuery);
            preparedStatement.setInt(1, accountNumber);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                java.util.Date openingDate = resultSet.getDate("opening_date");
                java.util.Date currentDate = new java.util.Date();
                long differenceInMilliseconds = currentDate.getTime() - openingDate.getTime();
                long differenceInDays = differenceInMilliseconds / (1000 * 60 * 60 * 24);

                if (differenceInDays < 60) {
                    System.out.println("You are not allowed to close the account. Minimum account age is 60 days.");
                } else {
                    // Logic to close the account (delete from the database, update status, etc.)
                    System.out.println("Account closed successfully.");
                }
            } else {
                System.out.println("Account not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
