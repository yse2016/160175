import java.io.*;

public class ShowText{
	public static void main(String[] args) {
	
			FileReader fr = null;
			BufferedReader in = null;	
			String data = null;
		try{
			//ファイルを開く
			fr = new FileReader("data.txt");
			in = new BufferedReader(fr);

			// for(int i=0;i<10;i++){
			// 	data = in.readLine();

			// 	System.out.println(data);
			// }

			while(true){
			//データを一行読む
			data = in.readLine(); 
			if(data == null){
				break;
			}
			//標準出力に表示する
			System.out.println(data);
		}
			in.close();
		}catch(IOException e){
			System.out.println("asdfghj");
			//e.printStackTrace();
		}
	}
}