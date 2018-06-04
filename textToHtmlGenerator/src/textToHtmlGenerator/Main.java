package textToHtmlGenerator;

import java.io.File;
import java.util.Scanner;

//Text to HTML Generator – Converts text files into web HTML files and stylizes them. 
//Great for making online documentation of standard text documentation.

public class Main {
	
	public static void main(String[] args){
		System.out.println("Welcome to BELLCROSS");
		System.out.println("Made by Sean Lin - 2018 Copyright");
		Boolean exit = false;
		Scanner sc = new Scanner(System.in);
		FileToHTML file = new FileToHTML();
		PowerLevelCalculator newCal = new PowerLevelCalculator();
		AncientCoinLocal coinFile = new AncientCoinLocal();
		while(exit == false)
		{
			
			System.out.println("Please select an option!");
			System.out.println("If you wish to exit, type 0.");
			int ch = sc.nextInt();
			switch(ch){
			case 1: System.out.println("selected file to HTML-LIST");
				System.out.println("Please ensure file line count is lower than 15 lines.");
				file.openFile();
				file.readWriteFile();
				file.closeFile();
				break;
			case 2: System.out.println("selected power level calculator");
			System.out.println("please enter strength level:");
			int str = sc.nextInt();
			System.out.println("please enter speed level:");
			int spd = sc.nextInt();
			System.out.println("please enter endurance level");
			int end = sc.nextInt();
			System.out.println("please enter special power level (1-10):");
			int spk = sc.nextInt();
			newCal.Calculation(str, end, spd, spk);
				break;
			case 3: System.out.println("selected Ancient Coin Database");
			System.out.println("press 1 to input coins, press 2 to view coins.");
			ch = sc.nextInt();
				//secondo switch
				switch (ch){
					case 1: 
						System.out.println("selected input coins!");
						System.out.println("please enter coin diameter");
						double dia = sc.nextDouble();
						System.out.println("please enter coin name");
						String name = sc.next();
						System.out.println("please enter coin description");
						String desc = sc.next();
						coinFile.openFile();
						coinFile.writeCoinFile(name, desc, dia);
						coinFile.closeFile();
						break;
					case 2:
						System.out.println("selected view coins!");
						break;
					case 3:
						System.out.println("exiting..");
						break;
					default:
						System.out.println("Please enter a valid choice!");
						break;
				}
				//secondo switch
					break;
			case 0: System.out.println("Closing BELLCROSS");
				exit = true;
				break;
			default: System.out.println("Invalid input!");
				break;
			}
		}
			
	}
}
