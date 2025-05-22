import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener{
    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton submit, cancel;
    String formno;
    SignupThree(String formno){
        this.formno = formno;
        setLayout(null);
        JLabel l1= new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 18));
        l1.setBounds(290, 70, 400, 30);
        l1.setForeground(Color.yellow);
        add(l1);

        JLabel type= new JLabel("Account Type");
        type.setFont(new Font("Raleway", Font.BOLD, 18));
        type.setBounds(150, 120, 200, 30);
        type.setForeground(Color.yellow);
        add(type);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raileway", Font.BOLD, 16));
        r1.setBackground(new Color(50,50,50));
        r1.setForeground(Color.YELLOW);
        r1.setBounds(150, 160, 200, 20);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raileway", Font.BOLD, 16));
        r2.setBackground(new Color(50,50,50));
        r2.setForeground(Color.YELLOW);
        r2.setBounds(450, 160, 200, 20);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raileway", Font.BOLD, 16));
        r3.setBackground(new Color(50,50,50));
        r3.setForeground(Color.YELLOW);
        r3.setBounds(150, 200, 200, 20);
        add(r3);

        r4 = new JRadioButton("Recurring Account");
        r4.setFont(new Font("Raileway", Font.BOLD, 16));
        r4.setBackground(new Color(50,50,50));
        r4.setForeground(Color.YELLOW);
        r4.setBounds(450, 200, 200, 20);
        add(r4);

        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);

        JLabel card= new JLabel("Card Number");
        card.setFont(new Font("Raleway", Font.BOLD, 18));
        card.setBounds(150, 250, 400, 18);
        card.setForeground(Color.yellow);
        add(card);

        JLabel number= new JLabel("XXXX-XXXX-XXXX-4104");
        number.setFont(new Font("Raleway", Font.BOLD, 18));
        number.setBounds(400, 250, 400, 18);
        number.setForeground(Color.WHITE);
        add(number);

        JLabel carddetail= new JLabel("Your 16 Digits Card Number");
        carddetail.setFont(new Font("Raleway", Font.BOLD, 12));
        carddetail.setBounds(150, 270, 400, 18);
        carddetail.setForeground(Color.white);
        add(carddetail);

        JLabel pin= new JLabel("Pin Number");
        pin.setFont(new Font("Raleway", Font.BOLD, 18));
        pin.setBounds(150, 300, 400, 18);
        pin.setForeground(Color.yellow);
        add(pin);

        JLabel pnumber= new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway", Font.BOLD, 18));
        pnumber.setBounds(400, 300, 400, 18);
        pnumber.setForeground(Color.white);
        add(pnumber);

        JLabel pindetail= new JLabel("Your 4 Digits Pin Number");
        pindetail.setFont(new Font("Raleway", Font.BOLD, 12));
        pindetail.setBounds(150, 320, 400, 18);
        pindetail.setForeground(Color.white);
        add(pindetail);

        JLabel services= new JLabel("Services Required");
        services.setFont(new Font("Raleway", Font.BOLD, 18));
        services.setBounds(150, 350, 400, 18);
        services.setForeground(Color.yellow);
        add(services);

        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(new Color(50,50,50));
        c1.setForeground(Color.YELLOW);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBounds(150, 380, 200, 20);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(new Color(50,50,50));
        c2.setForeground(Color.YELLOW);
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBounds(450, 380, 200, 20);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(50,50,50));
        c3.setForeground(Color.YELLOW);
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBounds(150, 420, 200, 20);
        add(c3);

        c4 = new JCheckBox("EMAIL & SMS Alerts");
        c4.setBackground(new Color(50,50,50));
        c4.setForeground(Color.YELLOW);
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBounds(450, 420, 200, 20);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(new Color(50,50,50));
        c5.setForeground(Color.YELLOW);
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBounds(150, 460, 200, 20);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(new Color(50,50,50));
        c6.setForeground(Color.YELLOW);
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBounds(450, 460, 200, 20);
        add(c6);

        c7 = new JCheckBox("I hearby declares tht the above details are correct");
        c7.setBackground(new Color(50,50,50));
        c7.setForeground(Color.YELLOW);
        c7.setFont(new Font("Raleway", Font.BOLD, 16));
        c7.setBounds(150, 500, 500, 20);
        add(c7);

        submit = new JButton("Submit");
        submit.setBackground(new Color(50,50,50));
        submit.setForeground(Color.YELLOW);
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBounds(300, 550, 100, 30);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBackground(new Color(50,50,50));
        cancel.setForeground(Color.YELLOW);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBounds(450, 550, 100, 30);
        cancel.addActionListener(this);
        add(cancel);

        getContentPane().setBackground(Color.BLACK);
        setSize(850, 800);
        setLocation(300, 10);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == submit){
            String accountType = null;
            if(r1.isSelected()){
                accountType = "Saving Account";
            } else if(r2.isSelected()){
                accountType = "Fixed Deposit Account";
            } else if(r3.isSelected()){
                accountType = "Current Account";
            } else if(r4.isSelected()){
                accountType = "Recuring Account";
            }
            Random random = new Random();
            String cardnumber = ""+Math.abs((random.nextLong()% 90000000L)+5040936000000000L);
            String pinnumber=""+Math.abs((random.nextLong()%9000L)+1000L);
            String facility = "";
            if(c1.isSelected()){
                facility = facility+" ATM CARD";
            }else if(c2.isSelected()){
                facility = facility+" Internet Banking";
            }else if(c3.isSelected()){
                facility=facility+" Mobile Banking";
            }else if(c4.isSelected()){
                facility=facility+" EMAIL & SMS Alert";
            }else if(c5.isSelected()){
                facility=facility+" E-Statement";
            }

            try{
                if(accountType.equals("")){
                    JOptionPane.showMessageDialog(null, "Account Type is Required");
                } else{
                    Conn conn = new Conn();
                    String query1 = "insert into signupthree values('"+formno+"', '"+accountType+"', '"+cardnumber+"', '"+pinnumber+"', '"+facility+"')";
                     String query2 = "insert into login values('"+formno+"', '"+cardnumber+"', '"+pinnumber+"')";
                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);
                    JOptionPane.showMessageDialog(null, "Card number: " + cardnumber + "\n Pin: " + pinnumber);
                    setVisible(false);
                    new Deposit(pinnumber).setVisible(false);
                }
            }catch(Exception e){
                System.out.println(e);
            }
        } else if(ae.getSource()==cancel){
            setVisible(false);
            new Login().setVisible(true);
        }
    }
    public static void main(String[] args) {
        new SignupThree("").setVisible(true);;
    }       
}

