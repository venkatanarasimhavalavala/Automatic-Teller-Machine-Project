import javax.swing.*; // swing is an java library which is used to create GUI and extension of AWT.
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
//JFrame is a class in swing which creats a Box interface
//ActionLister is used to make the actions of buttons
public class Login extends JFrame implements ActionListener{
    JButton login, clear, signup;//globally defined-it creates a button 
    JTextField cardTextField;
    JPasswordField pinTextField;
    Login() {
        setTitle("AUTOMAT4D TELLER MACHINE"); // sets title on interface
        setLayout(null);//makes the frame layout to null. 

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.jpg")); //used to import image from our system
        Image i2 = i1.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT);//used to set the size of the image on the frame
        ImageIcon i3 = new ImageIcon(i2);//we cannot directly add i2 image in label.
        JLabel label = new JLabel(i3);//we cannot directly add a picture on interface for that we use jlabel class.
        label.setBounds(70, 10, 120, 120);//sets the logo to required position.
        add(label);//This method add the image on the frame
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward",Font.BOLD, 38));
        text.setBounds(270,80,500,  40);
        text.setForeground(Color.YELLOW);
        add(text);
        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Raleway",Font.BOLD, 20));
        cardno.setBounds(200,200,500,  40);
        cardno.setForeground(Color.YELLOW);
        add(cardno);

        cardTextField = new JTextField();//used tio create input form 
        cardTextField.setBounds(350, 200, 250, 30);
        cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
        cardTextField.setBackground(new Color(50,50,50));
        cardTextField.setForeground(Color.yellow);
        cardTextField.setCaretColor(Color.yellow);
        cardTextField.setBorder(BorderFactory.createLineBorder(Color.yellow));
        add(cardTextField);

        JLabel pin = new JLabel("Password:");
        pin.setFont(new Font("Raleway",Font.BOLD, 20));
        pin.setBounds(200,250,500,  40);
        pin.setForeground(Color.YELLOW);
        add(pin);
        getContentPane().setBackground(Color.black);//sets the background colour of the frame.

        pinTextField = new JPasswordField();
        pinTextField.setBounds(350, 250, 250, 30);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
        pinTextField.setBackground(new Color(50,50,50));
        pinTextField.setForeground(Color.yellow);
        pinTextField.setCaretColor(Color.yellow);
        pinTextField.setBorder(BorderFactory.createLineBorder(Color.yellow));
        add(pinTextField);

        login = new JButton("SIGN IN");//it creates a button 
        login.setBounds(350, 300, 100, 30);
        login.setBackground(new Color(50,50,50));
        login.setForeground(Color.YELLOW);
        login.addActionListener(this);//catch the button event
        add(login);

        clear = new JButton("CLEAR");
        clear.setBounds(500, 300, 100, 30);
        clear.setBackground(new Color(50,50,50));
        clear.setForeground(Color.YELLOW);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("SIGN UP");
        signup.setBounds(350, 350, 250, 30);
        signup.setBackground(new Color(50,50,50));
        signup.setForeground(Color.YELLOW);
        signup.addActionListener(this);
        add(signup);
        
        
        setSize(800, 480);//sets width and height of the interface
        setLocation(300, 150);// sets the location of the interface like middle ,top, or bottom and so on
        setVisible(true);//it makes the interface to visible


    }
    // To override the abstract methods in actionlisterner interface
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }
        else if (ae.getSource()==login){
            Conn conn = new Conn();
            String cardnumber = cardTextField.getText();
            String pinnumber = pinTextField.getText();
            String query = "select * from login where cardnumber = '"+cardnumber+"' and pinnumber = '"+pinnumber+"'";                           
            try{
                ResultSet rs = conn.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transaction(pinnumber).setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin");
                }
            
            }catch(Exception e){
                System.out.println(e);
            }
        }
        else if(ae.getSource()==signup){
            setVisible(false);
            new SignupOne().setVisible(true);
        }
    }
    public static void main(String[] args) {
        
            new Login(); 
    }
}
