import javax.swing.JOptionPane;
/**
 * Programming-  First year first semester coursework
 * Islington College
 * @author (Kritagya Ghimire)
 * @version (1.0)
 */
public class DebitCard extends BankCard//extends connect the parent class with its subclass
{
    private int PINnumber;
    private int WithdrawalAmount;
    private String DateofWithdrawal;
    private boolean HasWithdrawn;
    public DebitCard(double balanceamount, int cardid, String bankaccount, String issuerbank, String clientname, int pinnumber)
    {//Constructors is created to initilized the objects
        super(balanceamount, cardid, bankaccount, issuerbank);
        super.setClientName(clientname);//super is used to call the value from another class
        this.PINnumber=pinnumber;
        this.HasWithdrawn=false;
    }
    
    public int getPINnumber()
    {
        return this.PINnumber;
    }
    
    public int getWithdrawalAmount()
    {
        return this.WithdrawalAmount;
    }
    
    public String getDateofWithdrawal()
    {
        return this.DateofWithdrawal;
    }
    
    public boolean getHasWithdrawn()
    {
        return this.HasWithdrawn;
    }
    
    public void setWithdrawalAmount(int withdrawalamount)
    {
        this.WithdrawalAmount=withdrawalamount;
    }
    
    public void Withdraw(int withdrawalamount, String dateofwithdrawal, int pinnumber)
    {
        if(this.PINnumber == pinnumber)// Logical error solved by giving double equal too
        
        {
            if(withdrawalamount <= super.getBalanceAmount())
            {
                this.HasWithdrawn=true;
                this.WithdrawalAmount = withdrawalamount;
                this.DateofWithdrawal=dateofwithdrawal;
                super.setBalanceAmount(super.getBalanceAmount()-withdrawalamount);//display the balance amount again after money is withdrawn
            }
            else 
            {
                System.out.println("Insuffcient balance"); 
            }
        }
        else
        {
             System.out.println("Incorrect Pin Number!"); 
        }
    }
    
    public void display()
    {
        super.display(); // calls the display method from the class BankCard
        if(this.HasWithdrawn==true)
        {
            System.out.println("The Pin Number is "+ this.PINnumber);
            System.out.println("The withdrawal amount is "+ this.WithdrawalAmount);
            System.out.println("The money is withdrawan on "+ this.DateofWithdrawal);
        }
        else
        {
            System.out.println("There is no recent transaction made. The balance amount of account is "+ super.getBalanceAmount());
        }
    }
}

