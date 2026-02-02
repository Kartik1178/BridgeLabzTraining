/*
 * Bank Account System
 * This class represents a bank account.
 * It demonstrates the use of static variables and methods,
 * a final variable for account number,
 * the this keyword for constructor initialization,
 * and the instanceof operator for runtime type checking
 * before displaying account details.
 */
public class BankAccount{
static private String bankName;
final private int accountNumber;
private String accountHolderName;
private static int accountsNumber;
BankAccount(int accountNumber,String accountHolderName){
this.accountNumber=accountNumber;
this.accountHolderName=accountHolderName;
accountsNumber+=1;
}
    // Method to display account details after instanceof check
public void getDetails(Object b){
    if(b instanceof BankAccount){
        System.out.println(
                "Bank Name: " + bankName +
                        ", Account Number: " + this.accountNumber +
                        ", Account Holder: " + this.accountHolderName +
                        ", Total Accounts: " + accountsNumber
        );

    }
    else{
        System.out.println("Not a valid bank account");
    }
}
static int getTotalAccounts(){
return accountsNumber;
}
//This is the main entry point for this program
public static void main(String[] args){
    //BankAccount object creation
    BankAccount b=new BankAccount(33,"ee");
    String a="ee";
    //Calling method to get bank account details
    b.getDetails(a);

}
}

