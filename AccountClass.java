package AccountClass;

public class AccountClass {
    private String ID;
    private  String firstAndLastName;
    private double balance;
    private double input;

    public AccountClass(String ID, String firstAndLastName, double balance){
        {
            this.ID = ID;
            this.firstAndLastName = firstAndLastName;
            this.balance = balance;

        }
    }

    public String getID() {   return ID;}
    public String getFirstAndLastName() {return firstAndLastName;}
    public double getBalance() {   return balance;}
    public double getInput() {return input;}

    public double creditBalance(double input) {
        if (input > 0) {
            this.balance = (balance + input);
            System.out.println(input + ": has been credited into your account");
        }return balance;
    }
     public double debitBalance(double input)
     {
         if (input<=balance)
         {
             this.balance = (balance-input);
             System.out.println(input + " has been debit from your account and the Avail Balance is: ");

         }else {
             System.out.println("Insufficient Balance");
         }return balance;

     }
}
