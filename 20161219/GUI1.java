import java .awt.FlowLayout;
import javax.swing.*;

public class GUI1{
	public static void main(String[] args) {
		JFrame frame = new JFrame("Farst GUI");
		JLabel label = new JLabel("Hello World");
		JLabel label2 = new JLabel("Hello Hayahide");		
		JButton button = new JButton("push");
		JButton button2 = new JButton("push now");
		frame.getContentPane().setLayout(new FlowLayout());
		frame.getContentPane().add(button);
		frame.getContentPane().add(label);
		frame.getContentPane().add(button2);
		frame.getContentPane().add(label2);

		for (int i=0; i<10; i++){
			if(i%5==0){
				JLabel label3 = new JLabel("Hello wataru");
				frame.getContentPane().add(label3);
			}else if(i%3==0){
				JButton button3 = new JButton("Don't push");
				frame.getContentPane().add(button3); 
			}else{
				JButton button3 = new JButton("Can't push");
				frame.getContentPane().add(button3);
			}
		}

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(450,450);
		frame.setVisible(true);
	}
}