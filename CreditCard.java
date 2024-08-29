
/**
 * Programming-  First year first semester coursework
 * Islington College
 * @author (Kritagya Ghimire)
 * @version (1.0)
 */
public class CreditCard extends BankCard
{
   private int CVCnumber;
   private double CreditLimit;
   private double IntrestRate;
   private String ExpirationDate;
   private int GracePeriod;
   private boolean isGranted;
   public CreditCard(int cardid, String clientname, String issuerbank, double balanceamount, String bankaccount, int cvcnumber, double intrestrate, String expirationdate)
   {
       super(balanceamount, cardid, bankaccount, issuerbank);
       super.setClientName(clientname);
       this.CVCnumber=cvcnumber;
       this.IntrestRate=intrestrate;
       this.ExpirationDate=expirationdate;
       this.isGranted=false;
   }
   
   public int getCVCnumber()// Semantic error corrected
    {
        return this.CVCnumber;
    }
    
   public int getGracePeriod()
    {
        return this.GracePeriod;
    }
    
   public double getCreditLimit()
    {
        return this.CreditLimit;
    }
     
   public double getIntrestRate()
    {
        return this.IntrestRate;
    }
    
   public String getExpirationDate()
    {
        return this.ExpirationDate;
    }
    
   public boolean getisGranted()
    {
        return this.isGranted;
    }
    
   public void setCreditlimit(double NewCreditlimit, int NewGracePeriod)
    {
        if(this.CreditLimit<=2.5*super.getBalanceAmount())//condition for newcreditlimit
        {
            this.CreditLimit=NewCreditlimit;
            this.GracePeriod=NewGracePeriod;
            this.isGranted=true;
        }
        if(this.isGranted==false)
        {
            if(this.CreditLimit>=2.5*super.getBalanceAmount())
                System.out.println("Sorry, the new credit limit cannot be Granted");
        }
    }
    
   public void cancleCreditCard()
    {
       this.CVCnumber=0;
       this.CreditLimit=0;
       this.GracePeriod=0;
       this.isGranted=false;
    }
    
   public void display()
    {
        super.display(); // calls the display method from the class BankCard
        if(this.isGranted==true)
        {
            System.out.println("The Credit Limit is "+this.CreditLimit);
            System.out.println("The Grace Period is "+this.GracePeriod);
        }
        else
        {
            System.out.println("Sorry, the Credit limit and Grace Period cannot be displayed.");
            System.out.println("The CVC number is "+this.CVCnumber);
            System.out.println("The intrest rate is "+this.IntrestRate);
            System.out.println("The expiration date is "+this.ExpirationDate);
        }
    }   
}