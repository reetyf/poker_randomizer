package randomizer;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.JFrame;

public class app implements ActionListener, WindowListener{
	TextField text = new TextField(20);
	Button b; 
	private String randomNum;
	Frame frame;
	public app() {
		frame = new JFrame("RANDOMIZER -- Don't Bluff Stations!!!!");
	    frame.setSize(300,150);
	    frame.setLayout(new FlowLayout());
	    
	    b= new Button("Randomize");
	    b.addActionListener(this);
	    
	    frame.add(b);
	    frame.add(text);
	    frame.setVisible(true);
	}

	public static void main(String[] args) {
			app app = new app();
	}

	public void actionPerformed(ActionEvent e) {
		Random random = new Random(System.currentTimeMillis());
		randomNum = Integer.toString(random.nextInt(0,100));
		text.setText(randomNum);
	}

	public void windowClosing(WindowEvent e) {
		frame.dispose();
		System.exit(0);
	}
	public void windowOpened(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowActivated(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}
}