public class Endless{
	public static void main(String[] args) {
		while(true){
			String msg;
			msg = new java.util.Scanner(System.in).nextLine();
			if(msg.equals("exit")){
				break;
			}else{
				System.out.println(msg);
			}
		}
	}
}