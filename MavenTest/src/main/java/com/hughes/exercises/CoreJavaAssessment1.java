package com.hughes.exercises;
import java.util.Random;

class Account {
    String accountId;
    String accountName;
    double balance;
    Loan loan; // Added loan object

    public void initialize(String accountId, String accountName, double initialBalance, Loan loan) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.balance = initialBalance;
        this.loan = loan; // Set the loan object
    }

    public void getDetails() {
        System.out.println("Account ID: " + accountId + ", Account Name: " + accountName + ", Balance: Rs" + String.format("%.2f", balance));
        if (loan != null) {
            loan.getLoan(); // Show loan details if loan exists
        }
    }

    public void depositAmount(double amt) {
        balance += amt;
        System.out.println("Deposited: Rs" + String.format("%.2f", amt));
        System.out.println("Current Balance: Rs" + String.format("%.2f", balance));
    }

    public void withdrawAmount(double amt) {
        // Ensure withdrawal amount doesn't exceed balance
        if (amt > 0 && amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawn: Rs" + String.format("%.2f", amt));
            System.out.println("Current Balance: Rs" + String.format("%.2f", balance));
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }
}

class Loan {
    String loanId;
    String loanType;
    double loanAmount;

    public void initialize(String loanId, String loanType, double loanAmount) {
        this.loanId = loanId;
        this.loanType = loanType;
        this.loanAmount = loanAmount;
    }

    public void getLoan() {
        System.out.println("Loan ID: " + loanId + ", Loan Type: " + loanType + ", Loan Amount: Rs" + String.format("%.2f", loanAmount));
    }
}

public class CoreJavaAssessment1 {

    public static void main(String[] args) {
        // Create an array of 10 accounts
        Account[] accounts = new Account[10];

        // Generate random accounts and loans
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            String accountId = generateAccountId(random);
            String accountName = "Account " + i;
            double initialBalance = random.nextDouble() * 1000; // Initial balance up to $1000
            String loanType = random.nextBoolean() ? "home" : "car";
            double loanAmount = random.nextDouble() * 100000; // Random loan amount up to $100,000

            // Create loan object with random details
            Loan loan = new Loan();
            loan.initialize(generateAccountId(random), loanType, loanAmount);

            // Create account object and initialize with generated details
            Account account = new Account();
            account.initialize(accountId, accountName, initialBalance, loan);

            // Add account to the array
            accounts[i] = account;

            // Show account details
            account.getDetails();

            // Deposit a random amount
            double depositAmt = random.nextDouble() * 1000;
            account.depositAmount(depositAmt);

            // Withdraw a random amount (up to current balance)
            double withdrawalAmt = random.nextDouble() * account.balance;
            account.withdrawAmount(withdrawalAmt);

            // Show account details after transactions
            System.out.println(); // Adding a new line for readability
        }
    }

    public static String generateAccountId(Random random) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String accId = "";
        for (int i = 0; i < 7; i++) {
            accId += random.nextInt(10);
        }
        for (int i = 0; i < 4; i++) {
            accId += chars.charAt(random.nextInt(chars.length()));
        }
        return accId;
    }
}