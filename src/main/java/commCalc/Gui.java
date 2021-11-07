package commCalc;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Gui extends JFrame implements ActionListener {
	
	Gui() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.setTitle("CommCalc");
		this.setPreferredSize(new Dimension(290, 700));
		
		
		
		JTextField textField1 = new JTextField();
		textField1.setPreferredSize(new Dimension(250, 40));
		
		JTextField textField2 = new JTextField();
		textField2.setPreferredSize(new Dimension(250, 40));
		
		JTextField textField3 = new JTextField();
		textField3.setPreferredSize(new Dimension(250, 40));
		
		JTextField textField4 = new JTextField();
		textField4.setPreferredSize(new Dimension(250, 40));
		
		JTextField textField5 = new JTextField();
		textField5.setPreferredSize(new Dimension(250, 40));
		
		JTextField textField6 = new JTextField();
		textField6.setPreferredSize(new Dimension(250, 40));
		
		JTextField textField7 = new JTextField();
		textField7.setPreferredSize(new Dimension(250, 40));
		
		JLabel label1 = new JLabel("First name:");
		
		JLabel label2 = new JLabel("Last name:");
		
		JLabel label3 = new JLabel("Product:");
		
		JLabel label4 = new JLabel("Credit:");
		
		JLabel label5 = new JLabel("Book:");
		
		JLabel label6 = new JLabel("Sold-for:");
		
		JLabel label7 = new JLabel("Comments:");
		
		JLabel label8 = new JLabel("Dropped:");
		
		JLabel label9 = new JLabel("Commission:");
		
		JLabel label15 = new JLabel("I'm another label");
		
		JLabel label10 = new JLabel("Possible comm:");
		
		JLabel label16 = new JLabel("I'm another label");
		
		JLabel label11 = new JLabel("Monthly comm:");
		
		JLabel label17 = new JLabel("I'm another label");
		
		JLabel label12 = new JLabel("Monthly sales:");
		
		JLabel label18 = new JLabel("I'm another label");
		
		JLabel label13 = new JLabel("Bonus-tier:");
		
		JLabel label19 = new JLabel("I'm another label");
		
		JLabel label14 = new JLabel("Close rate:");
		
		JLabel label20 = new JLabel("I'm another label");
		
		JLabel label21 = new JLabel(CommCalc.closerate);
		
		JButton button = new JButton("Submit");
		
		
		
		this.add(label1);
		this.add(textField1);
		this.add(label2);
		this.add(textField2);
		this.add(label3);
		this.add(textField3);
		this.add(label4);
		this.add(textField4);
		this.add(label5);
		this.add(textField5);
		this.add(label6);
		this.add(textField6);
		this.add(label7);
		this.add(textField7);
		this.add(label8);
		this.add(label15);
		this.add(label9);
		this.add(label16);
		this.add(label10);
		this.add(label17);
		this.add(label11);
		this.add(label18);
		this.add(label12);
		this.add(label19);
		this.add(label13);
		this.add(label20);
		this.add(label14);
		this.add(label21);
		this.add(button);
		this.pack();
		this.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		
	}
	
	

}
