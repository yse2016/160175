public class Scanner{
	public static void main(String[] args) {
		String mainMsg;
		String subMsg;

		mainMsg = new java.util.Scanner(System.in).nextLine();
		subMsg = new java.util.Scanner(System.in).nextLine();

		System.out.println(mainMsg);
		System.out.println(subMsg);
	}
}