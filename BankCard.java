
/**
 * Programming-  First year first semester coursework
 * Islington College
 * @author (Kritagya Ghimire)
 * @version (1.0)
 */
public class BankCard
{
    private int cardID;//Instance Variables
    private String BankAccount;
    private String ClientName, IssuerBank;
    private double BalanceAmount;
    public BankCard(double balanceamount, int cardid, String bankaccount, String issuerbank)
    {
       this.ClientName="";
       this.cardID=cardid;// (this) assigns th value of instance variable
       this.BankAccount=bankaccount; //Syntax error is corrected by adding semicolon at the end of the statement
       this.IssuerBank=issuerbank;
       this.BalanceAmount=balanceamount;
    }
    
    public String getClientName()//Getters Method
    {
        return this.ClientName;
    }
    
    public int getcardID()
    {
        return this.cardID;
    }
    
    public String getBankAccount()
    {
        return this.BankAccount;
    }
    
    public String getIssureBank()
    {
        return this.IssuerBank;
    }
     
    public double getBalanceAmount()
    {
        return this.BalanceAmount;
    }
    
    public void setClientName(String clientname)//Setters Method
    {
        this.ClientName=clientname;
    }
    
    public void setBalanceAmount(double balanceamount)
    {
        this.BalanceAmount=balanceamount;
    }
    
    public void display()//Displays the details of this class
    {
        System.out.println("The Card ID is " +cardID);
        System.out.println("The Bank Name is " +IssuerBank);
        System.out.println("The Balance is " +BalanceAmount);//prints the value of BalanceAmount
        System.out.println("The Bank Account is "+BankAccount);
        if(this.ClientName == ""){
        System.out.println("Client name is not mentioned");}
        else
        {
             System.out.println(ClientName);
        }
    }
}
    
