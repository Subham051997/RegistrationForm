import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Myframe extends JFrame implements ActionListener
	{
		JLabel label1,label2,label3,label4;
		JTextField t1,t2,t3,t4;
		JCheckBox terms;
		JButton button1,button2;
		
		Myframe()
			{
				setTitle("Registration Form");
				setSize(700, 500);
				setLocationRelativeTo(null);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				Container c = getContentPane();
				c.setLayout(null);
				
				label1 = new JLabel("First Name");
				label1.setBounds(20,50,100,20);
				c.add(label1);
				
				t1 = new JTextField();
				t1.setBounds(130,50,100,20);
				c.add(t1);
				
				label2 = new JLabel("Last Name");
				label2.setBounds(20,100,100,20);
				c.add(label2);
				
				t2 = new JTextField();
				t2.setBounds(130,100,200,20);
				c.add(t2);
				
				label3 = new JLabel("Phone Number");
				label3.setBounds(20,150,100,20);
				c.add(label3);
				
				t3 = new JTextField();
				t3.setBounds(130,150,150,20);
				c.add(t3);
				
				label4 = new JLabel("E-mail Address");
				label4.setBounds(20,200,100,20);
				c.add(label4);
				
				t4 = new JTextField();
				t4.setBounds(130,200,250,20);
				c.add(t4);
				
				terms = new JCheckBox("By Continuing, I agree to Terms and Policy and receive communication via SMS, E-mail, Call and Whatsapp.");
				terms.setBounds(50,250,700,20);
				c.add(terms);
				
				button1 = new JButton("Go Back");
				button1.setBounds(150,300,100,20);
				c.add(button1);
				
				button2 = new JButton("Send OTP");
				button2.setBounds(300,300,100,20);
				c.add(button2);
				
				setVisible(true);
			}
		public void actionPerformed(ActionEvent e)
		{
			if(terms.isSelected())
			{
				String firstname = t1.getText();
				String lastname = t2.getText();
				String phonenumber = t3.getText();
				String emailaddress = t4.getText();
			}
		}
	}



class RegistrationForm
	{
		public static void main(String[] args)
			{
				Myframe frame = new Myframe();
			}
	}