import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MainFrameMan{
	public static void main(String[] args) {
		FrameMan fm = new FrameMan();
	}
}

class FrameMan implements ActionListener{

	JFrame frame;
	JPanel panel;
	JLabel label;
	JButton button;

	public FrameMan(){
		System.out.println("Aloha");

		frame = new JFrame("FrameMan!");
		frame.setBounds(100,100,100,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());

		panel = new JPanel();
		label = new JLabel("橙");
		button = new JButton("Click");

		button.addActionListener(this);

		panel.add(label);
		panel.add(button);
		frame.add(panel);

		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e){
		label.setText("ちぇん");
	}
}