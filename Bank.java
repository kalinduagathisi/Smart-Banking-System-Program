import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {

    // declaring a list to store bank accounts
    //  to make the list gobal, i'll add static in front of it
    static List<AccountHolder> accountHolderList = new ArrayList<>(); // here list type is AccountHolder

    // creating a Scanner object to take user input
    static Scanner scanner = new Scanner(System.in);
    static int accountCount=1;

    // create new account
    public static void createNewAccount(){
        System.out.println("Welcome..To create a new account, please fill the following fields correctly.");
        System.out.println();
        System.out.print("First name: ");
        String firstName= scanner.next();
        System.out.print("Last name: ");
        String lastName= scanner.next();
        System.out.print("Date of birth: ");
        String DOB= scanner.next();
        System.out.print("NIC number: ");
        String NIC= scanner.next();
        System.out.print("Branch name: ");
        String branchName= scanner.next();
        System.out.print("Branch code: ");
        String branchCode= scanner.next();

        // account number is set to be auto generated.
        // account num= account count+ NIC + branch code
        String accountNumber = String.valueOf(accountCount)+NIC+branchCode;
        System.out.println("Your account number is: "+ accountNumber);


        System.out.print("Initial deposit amount: ");
        double initialDepositAmount= scanner.nextDouble();

        // creating a AccountHolder object
        AccountHolder accountHolder = new AccountHolder(firstName, lastName, DOB, NIC, branchName, branchCode, accountNumber,initialDepositAmount);

        // adding the accountHolder object to the list
        accountHolderList.add(accountHolder);
        System.out.println();
        System.out.println("Account successfully created!");
    }

    // view account details
    public static void viewAccountDetails(){
        System.out.println("<===Account details===>");
        // to view acc details, 1st it should ask for account number
        System.out.print("Enter account number: ");
        String enteredAccNum= scanner.next();

        // now I'm looping through the accountHolderList to find a match
        for (AccountHolder x: accountHolderList){ // this is a enhanced for loop
            if (enteredAccNum.equals(x.getAccountNumber())){
                System.out.println("Account found!.. Account details are as follows.");
                System.out.println();
                System.out.println("Account number: " + x.getAccountNumber());
                System.out.println("First name: " + x.getFirstName());
                System.out.println("Last name: " + x.getLastName());
                System.out.println("Date of birth: " + x.getDOB());
                System.out.println("NIC: " + x.getNIC());
                System.out.println("Branch name: " + x.getBranchName());
                System.out.println("Branch code: " + x.getBranchCode());
                System.out.println("Initial deposit amount: " + x.getInitialDepositAmount());
            }
            else {
                System.out.println("Sorry.. Account not found!");
            }
        }
    }

    // deposit money
    public static void depositMoney(){
        System.out.println("<===Deposit money===>");
        // to view deposit money, 1st it should ask for account number
        System.out.print("Enter account number: ");
        String enteredAccNum= scanner.next();

        // now I'm looping through the accountHolderList to find a match
        for (AccountHolder x: accountHolderList){ // this is a enhanced for loop
            if (enteredAccNum.equals(x.getAccountNumber())){
                System.out.print("Enter deposit amount: ");
                double depositAmount= scanner.nextDouble();

                x.setCurrentBalance(depositAmount+ (x.getInitialDepositAmount()));
                System.out.println("Amount "+ depositAmount+ " successfully deposited to acc "+ x.getAccountNumber());
            }
            else {
                System.out.println("Sorry.. Account not found!");
            }
        }
    }

    // withdraw money
    public static void withdrawMoney(){
        System.out.println("<===Withdraw money===>");
        // to view withdraw money, 1st it should ask for account number
        System.out.print("Enter account number: ");
        String enteredAccNum= scanner.next();

        // now I'm looping through the accountHolderList to find a match
        for (AccountHolder x: accountHolderList){ // this is a enhanced for loop
            if (enteredAccNum.equals(x.getAccountNumber())){
                System.out.print("Enter withdraw amount: ");
                double withdrawAmount= scanner.nextDouble();

                x.setCurrentBalance(x.getCurrentBalance()-withdrawAmount);
                System.out.println("Amount "+ withdrawAmount+ " successfully withdrew from acc "+ x.getAccountNumber());
                System.out.println("Balance remaining = "+ x.getCurrentBalance());
            }
            else {
                System.out.println("Sorry.. Account not found!");
            }
        }
    }

    // check current balance
    public static void checkCurrentBalance(){
        System.out.println("<===Check current balance===>");
        // to view check balance, 1st it should ask for account number
        System.out.print("Enter account number: ");
        String enteredAccNum= scanner.next();

        // now I'm looping through the accountHolderList to find a match
        for (AccountHolder x: accountHolderList){ // this is a enhanced for loop
            if (enteredAccNum.equals(x.getAccountNumber())){
                System.out.println("Current balance = "+ x.getCurrentBalance());
            }
            else {
                System.out.println("Sorry.. Account not found!");
            }
        }
    }

    // apply for a loan
    public static void applyForLoan(){
        System.out.println("<===Apply for a loan===>");
        System.out.println();

        System.out.print("Enter account number: ");
        String enteredAccNum= scanner.next();

        // now I'm looping through the accountHolderList to find a match
        for (AccountHolder x: accountHolderList){ // this is a enhanced for loop
            if (enteredAccNum.equals(x.getAccountNumber())){
                if (x.getCurrentBalance()>10000){
                    System.out.println("Congrats! You can apply for a loan..");
                    System.out.println("Go and see the loan department quickly...");
                }
                else {
                    System.out.println("Sorry.. You can't apply for this facility..");
                    System.out.println("Your account balance is less than $10 000.");
                }
            }
            else {
                System.out.println("Sorry.. Account not found!");
            }
        }
    }
}
