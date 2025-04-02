import java.util.*;

class BankAccount{
    private int accountnumber;
    private double balance;

    public BankAccount(int accountnumber, double balance) {
        this.accountnumber = accountnumber;
        this.balance = balance;
    }

    public void displayAccountType(){
        System.out.println("Account Number :"+accountnumber);
        System.out.println("Balance : "+balance);
    }
}

class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(int accountnumber, double balance, double interestRate) {
        super(accountnumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountType() {
        super.displayAccountType();
        System.out.println("Savings Account :");
        System.out.println("Interest Rate : "+interestRate);
    }
}

class CheckingAccount extends BankAccount{
    private double withdrawLimit;

    public CheckingAccount(int accountnumber, double balance, double withdrawLimit) {
        super(accountnumber, balance);
        this.withdrawLimit = withdrawLimit;
    }

    @Override
    public void displayAccountType() {
        super.displayAccountType();
        System.out.println("CheckingAccount :");
        System.out.println("Withdrawal Limit : "+withdrawLimit);
    }
}

class FixedDepositAmount extends BankAccount{
    private double deposit;

    public FixedDepositAmount(int accountnumber, double balance, double deposit) {
        super(accountnumber, balance);
        this.deposit = deposit;
    }

    @Override
    public void displayAccountType() {
        super.displayAccountType();
        System.out.println("Fixed Deposit Account :");
        System.out.println("Deposit Amount : "+deposit);
    }
}
public class BankAccountTypes {
    public static void main(String[] args) {
        BankAccount bankAccount1=new BankAccount(12345,50000);
        SavingsAccount savingsAccount1=new SavingsAccount(2345,50000,5);
        CheckingAccount checkingAccount1=new CheckingAccount(4567,2500,1000);
        FixedDepositAmount fixedDepositAmount1=new FixedDepositAmount(5432,70000,40000);

        bankAccount1.displayAccountType();
        System.out.println();
        savingsAccount1.displayAccountType();
        System.out.println();
        checkingAccount1.displayAccountType();
        System.out.println();
        fixedDepositAmount1.displayAccountType();

    }
}
