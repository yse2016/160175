import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//
					 //extends → 継承・拡張
public class JPanelTest extends JFrame{
	//コンストラクタ(特別メソッド・初期化)
	public JPanelTest(){
		setSize(400,300);
		setTitle("JPaneTest");

		//パネルの新規作成
		MyPanel myjp = new MyPanel();
		ContentPane c = getContentPane();
		c.add(myjp);
	}

	public static void main(String[] args) {
		JFrame w = new JpaneTest();
		w.show(myjp);
	}
}

class MyJPanel extends Jpanel{
	public void paintComponent(Graphics g){
		

	}
}