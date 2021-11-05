package commCalc;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Gui extends JFrame implements ActionListener {
	
	Gui() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setTitle("CommCalc");
		
		
		
		JTextField textField1 = new JTextField();
		textField1.setPreferredSize(new Dimension(250, 40));
		
		JButton button = new JButton("Submit");
		
		this.add(button);
		this.add(textField1);
		this.pack();
		this.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
