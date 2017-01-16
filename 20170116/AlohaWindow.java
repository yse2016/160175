import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AlohaWindow{
	public static void main(String[] args) {
		AlohaWindowMan am = new AlohaWindowMan();
	}
}

class AlohaWindowMan implements ActionListener{
// class AlohaWindowMan{

	JFrame frame;
	JTextField textField;
	JTextArea textArea;
	JScrollPane scrollPane;
	JButton bOpen;
	JButton bSave;
	JPanel panel;


	public AlohaWindowMan(){

		frame = new JFrame("AlohaWindow");
		frame.setLocation(0,0);
		frame.setSize(600,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		textField = new JTextField(15);
		textArea = new JTextArea(10,30);
		scrollPane = new JScrollPane(textArea);
		panel = new JPanel();

		bOpen = new JButton("Open");
		bOpen.addActionListener(this);
		bOpen.setActionCommand("open");

		bSave = new JButton("Save");
		bSave.addActionListener(this);
		bSave.setActionCommand("save");


		// scrollPane.add(textArea);
		panel.add(textField);
		panel.add(bOpen);
		panel.add(bSave);

		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(0,1));
		con.add(panel);
		con.add(scrollPane);

		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae){
		// textField.setText("HELLO");
		String cmd = ae.getActionCommand();

		// if(cmd.equals("open")){
		// 	String textFile = fileName.getText();
		// 	FileReader fr;
		// 	BufferedReader br;
		// 	try{
		// 		fr = new
		// 	}
		// 	textArea.setText("YSE!");
		// }else if(cmd.equals("save")){
		// 	textArea.setText("NO!");
		// }
	}
}