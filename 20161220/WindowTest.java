import java.awt.*;
import javax.swing.*;

public class WindowTest{
	public static void main(String[] args) {
		//System.out.println("Aloha");

		JFrame frame = new JFrame();
		JLabel label = new JLabel("Hello");
		JButton button = new JButton("Click now!");

		//ウィンドウサイズのみ
		//frame.setSize(300,100);
		//場所指定&サイズ
		frame.setBounds(50,50,300,100);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		Container ctnr = frame.getContentPane();
		ctnr.add(label);
		ctnr.add(button);

		frame.setVisible(true);
	}
}