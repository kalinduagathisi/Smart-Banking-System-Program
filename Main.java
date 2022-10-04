import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        while (true){
            System.out.println();
            System.out.println();
            System.out.println("<====Bank of Titans====>");
            System.out.println();
            System.out.println("(1)=> Create a new account");
            System.out.println("(2)=> View account details");
            System.out.println("(3)=> Deposit money");
            System.out.println("(4)=> Withdraw money");
            System.out.println("(5)=> Check current balance");
            System.out.println("(6)=> Apply for a loan");
            System.out.println("(7)=> Exit");
            System.out.print("Enter your option: ");
            Scanner scanner=new Scanner(System.in);
            int option= scanner.nextInt();
            System.out.println();

            if (option==1){
                Bank.createNewAccount();
            }
            if (option==2){
                Bank.viewAccountDetails();
            }
            if (option==3){
                Bank.depositMoney();
            }
            if (option==4){
                Bank.withdrawMoney();
            }
            if (option==5){
                Bank.checkCurrentBalance();
            }
            if (option==6){
                Bank.applyForLoan();
            }
            if (option==7){
                System.out.println("Thank you for banking with us!");
               System.exit(1);
            }
        }
    }
}
