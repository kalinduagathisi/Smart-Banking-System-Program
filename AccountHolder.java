public class AccountHolder {
    // declaring class attributes as private to achieve encapsulation
    private String firstName;
    private String lastName;
    private String DOB; // date of birth
    private String NIC; // national id number
    private String branchName;
    private String branchCode;
    private String accountNumber;
    private double initialDepositAmount;
    private double currentBalance;

    // generating class constructor

    public AccountHolder(String firstName, String lastName, String DOB, String NIC, String branchName, String branchCode, String accountNumber, double initialDepositAmount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
        this.NIC = NIC;
        this.branchName = branchName;
        this.branchCode = branchCode;
        this.accountNumber = accountNumber;
        this.initialDepositAmount = initialDepositAmount;
    }

    // generating getters

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDOB() {
        return DOB;
    }

    public String getNIC() {
        return NIC;
    }

    public String getBranchName() {
        return branchName;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getInitialDepositAmount() {
        return initialDepositAmount;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    // generating setter for current balance

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }
}
