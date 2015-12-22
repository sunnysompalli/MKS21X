import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempConversionWindow extends JFrame implements ActionListener{
    
    private Container pane;
    private JLabel C;
    private JLabel F;
    private JTextField t1;
    private JTextField t2;

    public  double CtoF(double t){
	return ((t * (9.0/5.0)) + 32);
    }

    public double FtoC(double t){
	return ((t - 32) * (5.0 / 9.0));
    }

    public TempConversionWindow(){
	this.setTitle("Farenheit and Celsius");
	this.setSize(600, 400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

	JButton C = new JButton("Celsius to Farenheit");
	C.addActionListener(this);
	C.setActionCommand("CtoF");
	JButton F = new JButton("Farenheit to Celsius");
	F.addActionListener(this);
	F.setActionCommand("FtoC");
    

	t1 = new JTextField(1);
	t2 = new JTextField(1);
    

	pane.add(t1);
	pane.add(C);
	pane.add(F);
	pane.add(t2);
    }

    public void actionPerformed(ActionEvent e){
	String s = t1.getText();
	int i = Integer.parseInt(s);
	String event = e.getActionCommand();
	if (event.equals("CtoF")){
	    t2.setText(String.valueOf(CtoF(i)));
	}
	if (event.equals("FtoC")){
	    t2.setText(String.valueOf(FtoC(i)));
	}
    }
}
