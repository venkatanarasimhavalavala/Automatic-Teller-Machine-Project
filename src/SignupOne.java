import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener{
    Long random;
    JTextField nameTextField, fnameTextField, dobTextField, emailTextField, addressTextField, stateTextField, cityTextField, pincodeTextField;
    JRadioButton male, female, married, unmarried, other;
    JComboBox<String> dayBox, monthBox, yearBox;
    JButton next;
    SignupOne(){
        setLayout(null);
        Random ran = new Random();
        random = Math.abs(ran.nextLong()%9000L + 1000L);

        JLabel formno = new JLabel("APPLICATION FORM NO. " + random);
        formno.setFont(new Font("Raleway",Font.BOLD, 28));
        formno.setBounds(200, 20, 600, 40);
        formno.setForeground(Color.YELLOW);
        add(formno);

        JLabel personalDetails = new JLabel("Page 1 : Personal Details");
        personalDetails.setFont(new Font("Raleway",Font.BOLD, 18));
        personalDetails.setBounds(290, 70, 400, 30);
        personalDetails.setForeground(Color.YELLOW);
        add(personalDetails);

        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway",Font.BOLD, 18));
        name.setBounds(150, 120, 100, 30);
        name.setForeground(Color.YELLOW);
        add(name);

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD, 14));
        nameTextField.setBounds(400, 120, 300, 30);
        nameTextField.setBackground(new Color(50,50,50));
        nameTextField.setForeground(Color.YELLOW);
        nameTextField.setBorder(BorderFactory.createLineBorder(Color.yellow));
        nameTextField.setCaretColor(Color.yellow);
        add(nameTextField);

        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway",Font.BOLD, 18));
        fname.setBounds(150, 170, 200, 30);
        fname.setForeground(Color.YELLOW);
        add(fname);

        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD, 14));
        fnameTextField.setBounds(400, 170, 300, 30);
        fnameTextField.setBackground(new Color(50,50,50));
        fnameTextField.setForeground(Color.YELLOW);
        fnameTextField.setBorder(BorderFactory.createLineBorder(Color.yellow));
        fnameTextField.setCaretColor(Color.yellow);
        add(fnameTextField);

        JLabel dob = new JLabel("Date Of Birth:");
        dob.setFont(new Font("Raleway",Font.BOLD, 18));
        dob.setBounds(150, 220, 200, 30);
        dob.setForeground(Color.YELLOW);
        add(dob);

        String[] days = new String[31];
        for (int i = 1; i <= 31; i++) {
            days[i - 1] = String.valueOf(i);
        }
        dayBox = new JComboBox<>(days);
        dayBox.setBounds(400, 220, 60, 30);
        dayBox.setBackground(Color.white);
        dayBox.setForeground(Color.BLACK);
        add(dayBox);

        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        monthBox = new JComboBox<>(months);
        monthBox.setBounds(470, 220, 80, 30);
        monthBox.setBackground(Color.white);
        monthBox.setForeground(Color.BLACK);
        add(monthBox);

        // Year Dropdown (1950 - Current Year)
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        String[] years = new String[currentYear - 1949];
        for (int i = 1950; i <= currentYear; i++) {
            years[i - 1950] = String.valueOf(i);
        }

        yearBox = new JComboBox<>(years);
        yearBox.setBounds(560, 220, 80, 30);
        yearBox.setBackground(Color.white);
        yearBox.setForeground(Color.BLACK);
        add(yearBox);

        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway",Font.BOLD, 18));
        gender.setBounds(150, 270, 200, 30);
        gender.setForeground(Color.YELLOW);
        add(gender);
        //radio buttons
        male = new JRadioButton("Male");
        male.setBounds(400, 270, 100, 30);
        male.setBackground(new Color(50,50,50));
        male.setForeground(Color.YELLOW);
        add(male);
        female = new JRadioButton("Female");
        female.setBounds(550, 270, 100, 30);
        female.setBackground(new Color(50,50,50));
        female.setForeground(Color.YELLOW);
        add(female);
        //to select only one option
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);


        JLabel email = new JLabel("Email:");
        email.setFont(new Font("Raleway",Font.BOLD, 18));
        email.setBounds(150, 320, 200, 30);
        email.setForeground(Color.YELLOW);
        add(email);

        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD, 14));
        emailTextField.setBounds(400, 320, 300, 30);
        emailTextField.setBackground(new Color(50,50,50));
        emailTextField.setForeground(Color.YELLOW);
        emailTextField.setBorder(BorderFactory.createLineBorder(Color.yellow));
        emailTextField.setCaretColor(Color.yellow);
        add(emailTextField);

        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway",Font.BOLD, 18));
        marital.setBounds(150, 370, 200, 30);
        marital.setForeground(Color.YELLOW);
        add(marital);

        married = new JRadioButton("Married");
        married.setBounds(400, 370, 70, 30);
        married.setBackground(new Color(50,50,50));
        married.setForeground(Color.YELLOW);
        add(married);
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(500, 370, 90, 30);
        unmarried.setBackground(new Color(50,50,50));
        unmarried.setForeground(Color.YELLOW);
        add(unmarried);
        other = new JRadioButton("Other");
        other.setBounds(620, 370, 70, 30);
        other.setBackground(new Color(50,50,50));
        other.setForeground(Color.YELLOW);
        add(other);
        //to select only one option
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);


        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway",Font.BOLD, 18));
        address.setBounds(150, 420, 200, 30);
        address.setForeground(Color.YELLOW);
        add(address);

        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.BOLD, 14));
        addressTextField.setBounds(400, 420, 300, 30);
        addressTextField.setBackground(new Color(50,50,50));
        addressTextField.setForeground(Color.YELLOW);
        addressTextField.setBorder(BorderFactory.createLineBorder(Color.yellow));
        addressTextField.setCaretColor(Color.yellow);
        add(addressTextField);

        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway",Font.BOLD, 18));
        city.setBounds(150, 470, 200, 30);
        city.setForeground(Color.YELLOW);
        add(city);

        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD, 14));
        cityTextField.setBounds(400, 470, 300, 30);
        cityTextField.setBackground(new Color(50,50,50));
        cityTextField.setForeground(Color.YELLOW);
        cityTextField.setBorder(BorderFactory.createLineBorder(Color.yellow));
        cityTextField.setCaretColor(Color.yellow);
        add(cityTextField);

        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway",Font.BOLD, 18));
        state.setBounds(150, 520, 200, 30);
        state.setForeground(Color.YELLOW);
        add(state);

        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.BOLD, 14));
        stateTextField.setBounds(400, 520, 300, 30);
        stateTextField.setBackground(new Color(50,50,50));
        stateTextField.setForeground(Color.YELLOW);
        stateTextField.setBorder(BorderFactory.createLineBorder(Color.yellow));
        stateTextField.setCaretColor(Color.yellow);
        add(stateTextField);

        JLabel pincode = new JLabel("Pincode:");
        pincode.setFont(new Font("Raleway",Font.BOLD, 18));
        pincode.setBounds(150, 570, 200, 30);
        pincode.setForeground(Color.YELLOW);
        add(pincode);

        pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Raleway",Font.BOLD, 14));
        pincodeTextField.setBounds(400, 570, 300, 30);
        pincodeTextField.setBackground(new Color(50,50,50));
        pincodeTextField.setForeground(Color.YELLOW);
        pincodeTextField.setBorder(BorderFactory.createLineBorder(Color.yellow));
        pincodeTextField.setCaretColor(Color.yellow);
        add(pincodeTextField);

        next = new JButton("Next");
        next.setBackground(new Color(50,50,50));
        next.setForeground(Color.YELLOW);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(600,620,100,30);
        next.addActionListener(this);
        add(next);




        getContentPane().setBackground(Color.BLACK);
        setSize(850, 800);
        setLocation(300, 10);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        String formno ="" + random;//by adding "" infront of long it will convert into string
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = dayBox.getSelectedItem() + " " + monthBox.getSelectedItem() + " " + yearBox.getSelectedItem();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        }
        else if(female.isSelected()){
            gender = "Female";
        }
        String email = emailTextField.getText();
        String marital = null;
        if(married.isSelected()){
            marital = "Married";
        }else if(unmarried.isSelected()){
            marital="Unmarried";
        } else if(other.isSelected()){
            marital="other";
        }
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pincode = pincodeTextField.getText();

        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null,"Name is required");
            }else{
                Conn c = new Conn();
                String query = "insert into signup values('"+formno+"','"+name+"',+'"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pincode+"')";
                c.s.executeUpdate(query);

                setVisible(false);
                new SignupTwo(formno).setVisible(true);
                
            }
        }catch(Exception e){                //to avoid errors due to sql database
            System.out.println(e);
        }
        
    }
    public static void main(String[] args) {
        new SignupOne();
    }
    
}

