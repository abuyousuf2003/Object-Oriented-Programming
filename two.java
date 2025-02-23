
class BankAccount{
    String AccountNumber;
   
    double balance;
    public BankAccount(String AccountNumber,double balance)
    {
this.AccountNumber=AccountNumber;
this.balance=balance;

    }
    public BankAccount()
    {
this.AccountNumber="000000";
this.balance=0.0;

    }
    public BankAccount(String AccountNumber)
    {
this.AccountNumber=AccountNumber;
this.balance=0.0;

    }
    void printIt()
    {
        System.out.println(AccountNumber);
        System.out.println(balance);
       

    }

}




public class two{

    public static void main(String[]args)
    {
BankAccount s1= new BankAccount();
BankAccount s2= new BankAccount("273");
BankAccount s3= new BankAccount("275",50.00);
System.out.println(s1.AccountNumber+ " "+ s1.balance+ " ");
System.out.println(s2.AccountNumber+ " "+ s2.balance+ " ");

    }




}