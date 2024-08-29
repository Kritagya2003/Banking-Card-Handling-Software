
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.Font;

public class BankGUI implements ActionListener
{
    private JFrame BankFrame;
    private JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, sub, sub1, heading;
    private JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9,tf10,tf11, tf12, tf13, tf14, tf15, tf16;
    private JComboBox<String> cb1, cb2, cb3, cb4, cb5, cb6;
    private JButton b1, b2, b3, b4, b5, b6, b7, b8;
    private ArrayList<BankCard> BankList = new ArrayList<BankCard>();
    public BankGUI() 
    {
        BankFrame = new JFrame("Card Details");
        
        //Heading and Sub heading
        heading = new JLabel("BankGUI");
        sub = new JLabel("Debit Card");
        sub1 = new JLabel("Credit Card");
        
        l1 = new JLabel("Card id:");
        l2 = new JLabel("Client name:");
        l3 = new JLabel("Issuer bank");
        l4 = new JLabel("Bank account");
        l5 = new JLabel("Balance amount");
        l6 = new JLabel("Pin number");
        l7 = new JLabel("Withdrawal amount");  //Syntax error corrected
        l8 = new JLabel("CVC number");
        l9 = new JLabel("Credit limit");
        l10 = new JLabel("Interest rate");
        l11 = new JLabel("Grace period");
        l12 = new JLabel("Withdrawal date");
        l13 = new JLabel("Expiration date");
        l14 = new JLabel("Card id:");
        l15 = new JLabel("Client name:");
        l16 = new JLabel("Issuer bank");
        l17 = new JLabel("Bank account");
        l18 = new JLabel("Balance amount");
        
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        tf4 = new JTextField();
        tf5 = new JTextField();
        tf6 = new JTextField();
        tf7 = new JTextField();
        tf8 = new JTextField();
        tf9 = new JTextField();
        tf10 = new JTextField();
        tf11 = new JTextField();
        tf12 = new JTextField();
        tf13= new JTextField();
        tf14 = new JTextField();
        tf15 = new JTextField();
        tf16 = new JTextField();
        
        b1 = new JButton("Add a Debit Card");
        b2 = new JButton("Add a credit Card");
        b3 = new JButton("Withdraw from Debit Card");
        b4 = new JButton("Set the credit limit");
        b5 = new JButton("Cancel credit card");
        b6 = new JButton("DisplayC");
        b7 = new JButton("Clear");
        b8 = new JButton("DisplayD");
        
        String day[] = {"day", "1", "2", "3","4","5" };
        cb1 = new JComboBox<>(day);
        String month[] = {"month", "Jan", "Feb", "Mar", "Apr", "May"};
        cb2 = new JComboBox<>(month);
        String year[] = {"year","1990", "1991", "1992", "1993","1994"};
        cb3 = new JComboBox<>(year);
        cb4 = new JComboBox<>(day);
        cb5 = new JComboBox<>(month);
        cb6 = new JComboBox<>(year);
        
        BankFrame.add(l1);
        BankFrame.add(l2);
        BankFrame.add(l3);
        BankFrame.add(l4);
        BankFrame.add(l5);
        BankFrame.add(l6);
        BankFrame.add(l7);
        BankFrame.add(l8);
        BankFrame.add(l9);
        BankFrame.add(l10);
        BankFrame.add(l11);
        BankFrame.add(l12);
        BankFrame.add(l13);
        BankFrame.add(l14);
        BankFrame.add(l15);
        BankFrame.add(l16);
        BankFrame.add(l17);
        BankFrame.add(l18);
        BankFrame.add(heading);
        BankFrame.add(sub);
        BankFrame.add(sub1);
        
        BankFrame.add(tf1);
        BankFrame.add(tf2);
        BankFrame.add(tf3);
        BankFrame.add(tf4);
        BankFrame.add(tf5);
        BankFrame.add(tf6);
        BankFrame.add(tf7);
        BankFrame.add(tf8);
        BankFrame.add(tf9);
        BankFrame.add(tf10);
        BankFrame.add(tf11);
        BankFrame.add(tf12);
        BankFrame.add(tf13);
        BankFrame.add(tf14);
        BankFrame.add(tf15);
        BankFrame.add(tf16);
    
        BankFrame.add(cb1);
        BankFrame.add(cb2);
        BankFrame.add(cb3);
        BankFrame.add(cb4);
        BankFrame.add(cb5);
        BankFrame.add(cb6);
        
        BankFrame.add(b1);
        BankFrame.add(b2);
        BankFrame.add(b3);
        BankFrame.add(b4);
        BankFrame.add(b5);
        BankFrame.add(b6);
        BankFrame.add(b7);
        BankFrame.add(b8);
        
        heading.setFont(new Font("Helvetica",Font.BOLD,20));
        
        //For a add to debit card
        l1.setBounds(30, 60, 55, 32);
        l2.setBounds(30, 110, 80, 32);
        l3.setBounds(30, 160, 80, 32);
        l4.setBounds(30, 210, 80, 32);
        l5.setBounds(30, 260, 105,32);
        l6.setBounds(30, 310, 85, 32);
        
        //For add to credit card
        l14.setBounds(800, 60, 55, 32);
        l15.setBounds(800, 110, 80, 32);
        l16.setBounds(800, 160, 80, 32);
        l17.setBounds(800, 210, 80, 32);
        l18.setBounds(800, 260, 105,32);
        l8.setBounds(800, 310, 85, 32);
        l10.setBounds(800, 360, 90, 32);
        l13.setBounds(800, 410, 100, 32);
        
        //Withdraw
        l7.setBounds(30, 500, 125, 32);
        l12.setBounds(30, 550, 100, 32);
        
        l9.setBounds(868, 550, 92, 32);
        l11.setBounds(868, 600, 92, 32);
        heading.setBounds(550, 10, 180, 32);
        sub.setBounds(30, 30, 80, 32);
        sub1.setBounds(800, 30, 80, 32);
        
        
        //for add a debit card
        tf1.setBounds(130, 60, 85, 32);
        tf2.setBounds(130, 110 , 180, 32);
        tf3.setBounds(130, 160, 180, 32);
        tf4.setBounds(130, 210, 180, 32);
        tf5.setBounds(130, 260, 180, 32);
        tf6.setBounds(130, 310, 180, 32);
        
        //for add a credit card
        tf12.setBounds(900, 60, 85, 32);
        tf13.setBounds(900, 110 , 180, 32);
        tf14.setBounds(900, 160, 180, 32);
        tf15.setBounds(900, 210, 180, 32);
        tf16.setBounds(900, 260, 180, 32);
        tf8.setBounds(900, 310, 180, 32);
        tf10.setBounds(900, 360, 180, 32);
        
        //Withdraw
        tf7.setBounds(150, 500, 180, 32);
        
        tf9.setBounds(976, 550, 180, 32);
        tf11.setBounds(976, 600, 180, 32);
        
        //exp
        cb1.setBounds(900, 410, 80, 32);
        cb2.setBounds(1000, 410, 80, 32);
        cb3.setBounds(1100, 410, 80, 32);
        
        //withdraw
        cb4.setBounds(150, 550, 80, 32);
        cb5.setBounds(240, 550, 80, 32);
        cb6.setBounds(330, 550, 80, 32);
        
        b1.setBounds(30, 360, 240, 32);
        b2.setBounds(800, 460, 240, 32);
        b3.setBounds(30, 600, 240, 32);
        b4.setBounds(540, 650, 179, 32);
        b5.setBounds(540, 700, 177, 32);
        b6.setBounds(990, 650, 120, 32);
        b7.setBounds(990, 700, 120, 32);
        b8.setBounds(30, 650, 120, 32);
        
        //Adding buttons to the actionlistener class
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        
        BankFrame.setLayout(null);
        BankFrame.setVisible(true);
        BankFrame.setSize(1200, 800);
        BankFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BankFrame.setResizable(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent a)
    {
        if (a.getSource() == b1)
        {
            if (tf2.getText().isEmpty() || tf3.getText().isEmpty() || tf4.getText().isEmpty() || tf1.getText().isEmpty() || tf5.getText().isEmpty() || tf6.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(BankFrame, "Please fill up all the boxes", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try{
                    String Client = tf2.getText();
                    String Bank = tf3.getText();
                    String Account = tf4.getText();
                    int id = Integer.parseInt(tf1.getText()); 
                    double Balance = Double.parseDouble(tf5.getText());
                    int Pin = Integer.parseInt(tf6.getText());
            
                    boolean N_List = true;
                    
                    for(BankCard n : BankList)
                    {
                        if(n instanceof DebitCard) 
                        {
                            DebitCard obj = (DebitCard) n; // Logical Error Solved
                            if(id == obj.getcardID())
                            {
                                N_List = false;
                            }
                            
                        }
                    }
                    if(N_List == true)
                    {
                        DebitCard obj_pass = new DebitCard(Balance, id, Account, Bank, Client, Pin);
                        BankList.add(obj_pass);
                        tf1.setText("");
                        tf2.setText("");
                        tf3.setText("");
                        tf4.setText("");
                        tf5.setText("");
                        tf6.setText("");
                        JOptionPane.showMessageDialog(BankFrame, "Succesfully Added\n" + Client +"\n" + Bank + "\n" + Account + "\n"+ id + "\n" + Balance + "\n" + Pin , "Information", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(BankFrame, "This card id already exist", "Information", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch(NumberFormatException Er)
                {
                    JOptionPane.showMessageDialog(BankFrame, "Invalid Input", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        else if(a.getSource() == b2)
        {
            if (tf13.getText().isEmpty() || tf14.getText().isEmpty() || tf15.getText().isEmpty() || tf12.getText().isEmpty() || tf16.getText().isEmpty() || tf8.getText().isEmpty() || tf10.getText().isEmpty() || cb1.getSelectedItem() == "day" || cb2.getSelectedItem() == "month" || cb3.getSelectedItem() == "year" )
            {
                JOptionPane.showMessageDialog(BankFrame, "Please fill up all the boxes", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try{
                    String Client = tf13.getText();
                    String Bank = tf14.getText();
                    String Account = tf15.getText();
                    String Day = (String) cb1.getSelectedItem();
                    String Month = (String) cb2.getSelectedItem();
                    String Year = (String) cb3.getSelectedItem();
                    String combinedValue = Day + " " + Month + " " + Year;
                    int id = Integer.parseInt(tf12.getText());
                    double Balance = Double.parseDouble(tf16.getText());
                    int CVC = Integer.parseInt(tf8.getText());
                    double Rate = Integer.parseInt(tf10.getText());
                        
                    boolean N_List = true;
            
                    for(BankCard n : BankList)
                    {
                        if(n instanceof CreditCard) 
                        {
                            CreditCard obj = (CreditCard) n;
                            if(id == obj.getcardID())
                            {
                                N_List = false;
                            }
                       
                        }
                     }
                     if(N_List == true)
                    {
                        CreditCard obj_pass = new CreditCard(id, Client, Bank, Balance, Account, CVC, Rate, combinedValue);
                        BankList.add(obj_pass);
                        tf8.setText("");
                        tf10.setText("");
                        tf11.setText("");
                        tf12.setText("");
                        tf13.setText("");
                        tf14.setText("");
                        tf15.setText("");
                        tf16.setText("");
                        cb1.setSelectedIndex(0);
                        cb2.setSelectedIndex(0);
                        cb3.setSelectedIndex(0);

                        JOptionPane.showMessageDialog(BankFrame, "Succesfully Added\n" + Client +"\n" + Bank + "\n" + Account + "\n"+ id + "\n" + Balance + "\n" + CVC + "\n" + combinedValue + "\n" + Rate , "Information", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(N_List == false)
                    {
                        JOptionPane.showMessageDialog(BankFrame, "This card id already exist", "Information", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                catch(NumberFormatException Er)
                {
                    JOptionPane.showMessageDialog(BankFrame, "Invalid Input", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        else if(a.getSource() == b3)
        {
            if (tf7.getText().isEmpty() || tf1.getText().isEmpty() ||  tf6.getText().isEmpty() || cb4.getSelectedItem() == "day" || cb5.getSelectedItem() == "month" || cb6.getSelectedItem() == "year")
            {
                JOptionPane.showMessageDialog(BankFrame, "Please fill up all the boxes", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try{
                    int id = Integer.parseInt(tf1.getText());
                    int Pin = Integer.parseInt(tf6.getText());
                    int withdraw = Integer.parseInt(tf7.getText());
                    String Day1 = (String) cb4.getSelectedItem();
                    String Month1 = (String) cb5.getSelectedItem();
                    String Year1 = (String) cb6.getSelectedItem();
                    String combinedValue = Day1 + " " + Month1 + " " + Year1;
                    
                    boolean N_List = false;
                    
                    for(BankCard n : BankList)
                    {
                        if(n instanceof DebitCard) 
                        {
                            DebitCard obj = (DebitCard) n;
                            if(id == obj.getcardID())
                            {
                                N_List = true;
                                if(Pin == obj.getPINnumber())
                                {
                                    if(withdraw <= obj.getBalanceAmount())
                                    {
                                        obj.Withdraw(withdraw, combinedValue, Pin);
                                        tf1.setText("");
                                        tf6.setText("");
                                        tf7.setText("");
                                        cb4.setSelectedIndex(0);
                                        cb5.setSelectedIndex(0);
                                        cb6.setSelectedIndex(0);
                                        
                                        JOptionPane.showMessageDialog(BankFrame, "Succesfully Withdrawn\n Card Id: "+ id + "\n Withdrawal Amount " + withdraw + "\n Time "+ combinedValue,"Information Message", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                    else
                                    {
                                        JOptionPane.showMessageDialog(BankFrame, "Insufficant Balance Amount!", "Error", JOptionPane.ERROR_MESSAGE);
                                    }
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(BankFrame, "Incorrect Pin Number!", "Error", JOptionPane.ERROR_MESSAGE);
                                }
                                break;
                            }
                            else
                            {
                                N_List = false;
                            }
                        }
                    }
                    if (N_List == false)
                    {
                        JOptionPane.showMessageDialog(BankFrame, "The entered card id is not on your list", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } 
                catch(NumberFormatException Er)
                {
                    JOptionPane.showMessageDialog(BankFrame, "Invalid Input", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        else if(a.getSource() == b4)
        {
            if (tf9.getText().isEmpty() || tf12.getText().isEmpty() ||  tf11.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(BankFrame, "Please fill up all the boxes", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try{
                    int id = Integer.parseInt(tf12.getText());
                    int Grace = Integer.parseInt(tf11.getText());
                    double Limit = Double.parseDouble(tf9.getText());
                    boolean N_List = false;
                    for(BankCard n : BankList)
                    {
                        if(n instanceof CreditCard) 
                        {
                            CreditCard obj = (CreditCard) n;
                            if(id == obj.getcardID())
                            {
                                N_List = true;
                                if(Limit <= 2.5*obj.getBalanceAmount())
                                {
                                obj.setCreditlimit(Limit, Grace);
                                tf9.setText("");
                                tf11.setText("");
                                tf12.setText("");
                                JOptionPane.showMessageDialog(BankFrame, "Succesfully Added\n Card id: "+ id + "\n Grace Period " + Grace + "\n Credit Limit "+ Limit,"Information Message", JOptionPane.INFORMATION_MESSAGE);
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(BankFrame, "Credit limit too high!", "Error", JOptionPane.ERROR_MESSAGE);
                                }
                                break;
                            }
                            else
                            {
                                N_List = false;
                            }
                           
                        }
                    }
                    if (N_List == false)
                    {
                        JOptionPane.showMessageDialog(BankFrame, "Card Not Added!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } 
                catch(NumberFormatException Er)
                {
                    JOptionPane.showMessageDialog(BankFrame, "Invalid Input", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        else if(a.getSource() == b5)
        {
            if ( tf12.getText().isEmpty() )
            {
                JOptionPane.showMessageDialog(BankFrame, "Please fill up all the boxes", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try{
                    int id = Integer.valueOf(tf12.getText());
                    boolean N_List = false;
                    for(BankCard n : BankList)
                    {
                        if(n instanceof CreditCard) 
                        {
                            CreditCard obj = (CreditCard) n;
                            if(id == obj.getcardID())
                            {
                                N_List = true;
                                obj.cancleCreditCard();
                                JOptionPane.showMessageDialog(BankFrame, "Card ID: "+id + " Succesfully Cancelled!","Information Message", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            }
                            else
                            {
                                N_List = false;
                            }
                        }
                    }
                    if(N_List == false)
                    {
                        JOptionPane.showMessageDialog(BankFrame, "Card Not found!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } 
                catch(NumberFormatException Er)
                {
                    JOptionPane.showMessageDialog(BankFrame, "Invalid Input", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        else if(a.getSource() == b6)//display credit
        {
            for(BankCard n : BankList)
                    {
                        if(n instanceof CreditCard) 
                        {
                            CreditCard obj = (CreditCard) n;
                            obj.display();
                        }
                    }
        }
        
        else if(a.getSource() == b8)//display debit
        {
            for(BankCard n : BankList)
                    {
                        if(n instanceof DebitCard) 
                        {
                            DebitCard obj = (DebitCard) n;
                            obj.display();
                        }
                    }
        }
        
        else if(a.getSource() == b7)
        {
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            tf4.setText("");
            tf5.setText("");
            tf6.setText("");
            tf7.setText("");
            tf8.setText("");
            tf9.setText("");
            tf10.setText("");
            tf11.setText("");
            tf12.setText("");
            tf13.setText("");
            tf14.setText("");
            tf15.setText("");
            tf16.setText("");
            cb1.setSelectedIndex(0);
            cb2.setSelectedIndex(0);
            cb3.setSelectedIndex(0);
            cb4.setSelectedIndex(0);
            cb5.setSelectedIndex(0);
            cb6.setSelectedIndex(0);
        }
    }
    
    public static void main(String[]args)
    {
        new BankGUI();
    }
}
