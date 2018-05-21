import java.util.Scanner;

public class main {
	public static final String letters = "abcdefghijklmnopqrstuvwxyz";
	public static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		Boolean quit = false;
		while(quit == false){
			System.out.println("Welcome to IMPERATOR CIPHER MACHINE 1.0");
			System.out.println("Made by Sean Lin - 2018 Copyright");
			
			System.out.println("press 1 to encrypt a message, press 2 to decrypt a message, press 0 to exit");
			int ch = sc.nextInt();
			switch(ch){
				case 1:
					System.out.println("Enter message to be encrypted");
					Message();
					String message = Message();
					//System.out.println("Enter shift number");
					//int num = sc.nextInt();
					encrypt(message.toLowerCase());
					break;
				case 2:
					System.out.println("Enter message to be decrypted");
					Message();
					String deMessage = Message();
					decrypt(deMessage.toLowerCase());
					break;
				case 0: System.out.println("Closing IMPERATOR CIPHER MACHINE 1.0");
				quit = true;
					break;
				default: System.out.println("Invalid input!");
					break;
			}
		}
		
		
	}
	public static String Message(){
		String m = sc.nextLine();
		return m;
	}
	public static void encrypt(String message){
		StringBuilder eMessage = new StringBuilder();
		int len = message.length();
		
		for(int i = 0; i < len; i++){
			char c = message.charAt(i);
			int charPosition = letters.indexOf(c);
			//gets the position of the char in String message in reference to String letters
			if(message.charAt(i) == ' '){
				eMessage.append(' ');
				continue;
			}
			int encryptPosition = (charPosition + 3) % 26;
			//position of the encrypted char, e.g. 3 + 8 % 26 = 11, h is now encrypted as k
			char replaceVal = letters.charAt(encryptPosition);
			//the position of k is 11, and it is now placed into the char replaceVal
			eMessage.append(replaceVal);
		}
		System.out.println("Encrypted message is:");
		System.out.println(eMessage);
	}
	
	
	public static void decrypt(String message){
		StringBuilder deMessage = new StringBuilder();
		int len = message.length();
		
		for(int i = 0; i < len; i++){
			char c = message.charAt(i);
			int charPosition = letters.indexOf(c);
			if(message.charAt(i) == ' '){
				deMessage.append(' ');
			}
			int decryptPosition = (charPosition - 3) % 26;
			char replaceVal = letters.charAt(decryptPosition);
			deMessage.append(replaceVal);
		}
		System.out.println("Decrypted Message is:");
		System.out.println(deMessage);
	}
	
}
