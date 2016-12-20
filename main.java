public class main {

	public static void main(String[] args) {
		System.out.println(args[0]);
		for(int i = 1; i <= args[0].length(); i++) {
			System.out.print(args[0].charAt(args[0].length() - i));
		}
		System.out.println("\n" + args[0].length());
		
		int x = Integer.parseInt(args[1]);
		System.out.println(x % 10);
		}
	}



