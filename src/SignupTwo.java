import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
    Long random;
    JTextField pan, aadhar;
    JComboBox<String> religion, category, income, education, occupation;
    JRadioButton syes, sno, eyes, eno;
    JButton next;
    String formno;
    SignupTwo(String formno){
        this.formno= formno;
        setLayout(null);

        setTitle("NEW APPLICATION FORM PAGE - 2");

        Random ran = new Random();
        random = Math.abs(ran.nextLong()%9000L + 1000L);

        JLabel additionalDetails = new JLabel("Page 2 : Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD, 18));
        additionalDetails.setBounds(290, 70, 400, 30);
        additionalDetails.setForeground(Color.YELLOW);
        add(additionalDetails);

        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raleway",Font.BOLD, 18));
        name.setBounds(150, 120, 100, 30);
        name.setForeground(Color.YELLOW);
        add(name);

        String valreligion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        religion  = new JComboBox(valreligion);
        religion.setBounds(400, 120, 300, 30);
        religion.setBackground(Color.WHITE);
        religion.setFont(new Font("Raleway", Font.BOLD, 14));
        add(religion);


        JLabel fname = new JLabel("Category:");
        fname.setFont(new Font("Raleway",Font.BOLD, 18));
        fname.setBounds(150, 170, 200, 30);
        fname.setForeground(Color.YELLOW);
        add(fname);

        String valcategory[] = {"General","OBC","SC","ST","Other"};
        category = new JComboBox(valcategory);
        category.setBounds(400,170,300,30);
        category.setBackground(Color.WHITE);
        category.setFont(new Font("Raleway", Font.BOLD, 14));
        add(category);


        JLabel dob = new JLabel("Income:");
        dob.setFont(new Font("Raleway",Font.BOLD, 18));
        dob.setBounds(150, 220, 200, 30);
        dob.setForeground(Color.YELLOW);
        add(dob);

        String incomecategory[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        income = new JComboBox(incomecategory);
        income.setBackground(Color.WHITE);
        income.setFont(new Font("Raleway", Font.BOLD, 14));
        income.setBounds(400, 220, 300, 30);
        add(income);

        JLabel gender = new JLabel("Educational");
        gender.setFont(new Font("Raleway",Font.BOLD, 18));
        gender.setBounds(150, 270, 200, 30);
        gender.setForeground(Color.YELLOW);
        add(gender);

        String educationValues[] = {"Non-Graduate","Graduate","Post-Graduation","Doctorate","Others"};
        education = new JComboBox(educationValues);
        education.setBackground(Color.WHITE);
        education.setFont(new Font("Raleway", Font.BOLD, 14));
        education.setBounds(400, 290, 300, 30);
        add(education);
        
        JLabel email = new JLabel("Qualification:");
        email.setFont(new Font("Raleway",Font.BOLD, 18));
        email.setBounds(150, 300, 200, 30);
        email.setForeground(Color.YELLOW);
        add(email);

        JLabel address = new JLabel("Occupation:");
        address.setFont(new Font("Raleway",Font.BOLD, 18));
        address.setBounds(150, 370, 200, 30);
        address.setForeground(Color.YELLOW);
        add(address);

        String occupationcategory[] = {"Salaried","Self-Employmed","Business","Student","Retired","Others"};
        occupation = new JComboBox(occupationcategory);
        occupation.setBackground(Color.WHITE);
        occupation.setFont(new Font("Raleway", Font.BOLD, 14));
        occupation.setBounds(400, 370, 300, 30);
        add(occupation);

        JLabel city = new JLabel("PAN Number:");
        city.setFont(new Font("Raleway",Font.BOLD, 18));
        city.setBounds(150, 420, 200, 30);
        city.setForeground(Color.YELLOW);
        add(city);

        pan = new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD, 14));
        pan.setBounds(400, 420, 300, 30);
        pan.setBackground(new Color(50,50,50));
        pan.setForeground(Color.YELLOW);
        pan.setBorder(BorderFactory.createLineBorder(Color.yellow));
        pan.setCaretColor(Color.yellow);
        add(pan);

        JLabel state = new JLabel("Aadhar Number:");
        state.setFont(new Font("Raleway",Font.BOLD, 18));
        state.setBounds(150, 470, 200, 30);
        state.setForeground(Color.YELLOW);
        add(state);

        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway",Font.BOLD, 14));
        aadhar.setBounds(400, 470, 300, 30);
        aadhar.setBackground(new Color(50,50,50));
        aadhar.setForeground(Color.YELLOW);
        aadhar.setBorder(BorderFactory.createLineBorder(Color.yellow));
        aadhar.setCaretColor(Color.yellow);
        add(aadhar);

        JLabel pincode = new JLabel("Senior Citizen:");
        pincode.setFont(new Font("Raleway",Font.BOLD, 18));
        pincode.setBounds(150, 520, 200, 30);
        pincode.setForeground(Color.YELLOW);
        add(pincode);

        syes = new JRadioButton("Yes");
        syes.setBounds(400, 520,70, 30);
        syes.setBackground(new Color(50,50,50));
        syes.setForeground(Color.YELLOW);
        add(syes);
        sno = new JRadioButton("No");
        sno.setBounds(500, 520, 70, 30);
        sno.setBackground(new Color(50,50,50));
        sno.setForeground(Color.YELLOW);
        add(sno);
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);
        

        JLabel marital = new JLabel("Existing Account:");
        marital.setFont(new Font("Raleway",Font.BOLD, 18));
        marital.setBounds(150, 570, 200, 30);
        marital.setForeground(Color.YELLOW);
        add(marital);

        eyes = new JRadioButton("Yes");
        eyes.setBounds(400, 570, 70, 30);
        eyes.setBackground(new Color(50,50,50));
        eyes.setForeground(Color.YELLOW);
        add(eyes);
        eno = new JRadioButton("No");
        eno.setBounds(500, 570, 70, 30);
        eno.setBackground(new Color(50,50,50));
        eno.setForeground(Color.YELLOW);
        add(eno);
        ButtonGroup emaritalgroup = new ButtonGroup();
        emaritalgroup.add(eyes);
        emaritalgroup.add(eno);

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
        String sreligion = (String)religion.getSelectedItem();
        String scategory = (String)category.getSelectedItem();
        String sincome = (String)income.getSelectedItem();
        String seducation = (String)education.getSelectedItem();
        String soccupation = (String)occupation.getSelectedItem();
        String seniorcitizen = null;
        if(syes.isSelected()){
            seniorcitizen="Yes";
        } else if(sno.isSelected()){
            seniorcitizen="No";
        }
        String existingaccount = null;
        if(eyes.isSelected()){
            existingaccount="Yes";
        } else if(eno.isSelected()){
            existingaccount="No";
        }
        String span = pan.getText();
        String saadhar = aadhar.getText();
        try{
                Conn c = new Conn();
                String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
                c.s.executeUpdate(query);

                setVisible(false);
                new SignupThree(formno).setVisible(true);
        }catch(Exception e){                //to avoid errors due to sql database
            System.out.println(e);
        }
        
    }
    public static void main(String[] args) {
        new SignupTwo("").setVisible(true);
    }
    
}

