import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempConversionWindow{
    
    private Container pane;
    private JLabel C;
    private JLabel F;
    private TextField t1;
    private TextField t2;

    public static double CtoF(double t){
	return ((t * (9/5)) + 32);
    }

    public static double FtoC(double t){
	return ((t - 32) * (5 / 9));
    }

    public TempConversionWindow(){
	this.setTitle("Farenheit and Celsius");
	this.setSize(500, 500);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

	JButton CF = new JButton("Celsius to Farenheit");
	CF.addActionListener(this);
	CF.setActionCommand("CtoF");
	JButton FC = new JButton("Farenheit to Celsius");
	FC.addActionListener(this);
	FC.setActionCommand("FtoC");
    

	t1 = new JTextField(1);
	t2 = new JTextField(1);
    

	pane.add(t1);
	pane.add(CF);
	pane.add(FC);
	pane.add(t2);
    }

    public void actionPerformed(ActionEvent e){
	String s = t1.getText();
	int i = Integer.parseInt(s);
	if (event.equals("CtoF")){
	    t2.setText(CtoF(i));
	}
	if (event.equals("FtoC")){
	    t2.setText(FtoC(i));
	}
    }
}
