import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Calc {
public static void main(String[]args) {
	AddSub obj=new AddSub();
}
}

class AddSub extends JFrame
{
private int num1, num2,value;

JTextField t1, t2;
JButton b1, b2, b3, b4;
JLabel l;
JLabel error=new JLabel();

	public AddSub()
	{
		t1=new JTextField(15);
		t2=new JTextField(15);
		b1=new JButton("Add");
		b2=new JButton("Sub");
		b3=new JButton("Multiply");
		b4=new JButton("Divide");
		l=new JLabel("Result");
		
		
		add(t1);
		add(t2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(l);
	 
		
		b1.addActionListener(al -> {
			int num1=Integer.parseInt(t1.getText());
			int num2=Integer.parseInt(t2.getText());
		    int value=num1+num2;
		    l.setText(value+"");
		});
		
		b2.addActionListener(al ->{
			 num1=Integer.parseInt(t1.getText());
		     num2=Integer.parseInt(t2.getText());
			
			//if((num1>num2)?value=num1-num2:value=num2-num1);
			if(num1>num2) {
				value=num1-num2;
			}else {
				value=num2-num1;
			}
		   
		    l.setText(value+"");
		});
		b3.addActionListener(al->{
			 num1=Integer.parseInt(t1.getText());
			 num2=Integer.parseInt(t2.getText());
			 value=(num1*num2);
			 l.setText(value+"");
		});
		b4.addActionListener(al->{
			 num1=Integer.parseInt(t1.getText());
			 num2=Integer.parseInt(t2.getText());
			 value=num1/num2;
			 l.setText(value+"");
		});
		
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}