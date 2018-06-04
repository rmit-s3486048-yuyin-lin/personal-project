package textToHtmlGenerator;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class AncientCoinLocal {
	private Scanner x;
	public void openFile(){
		try{
			x = new Scanner("coinData.txt");
		}
		catch(Exception e){
			System.out.println("File not found!");
		}
	}
	
	public void writeCoinFile(String coinName, String coinDesc, double coinDia){
		
		try{
			PrintWriter wr = new PrintWriter("coinData.txt");
			
			wr.println("name: " + coinName);
			wr.println("description: " + coinDesc);
			wr.println("diameter: " + coinDia);
		}
		catch(Exception e){
			System.out.println("unable to write file!");
		}
	}
	
	public void closeFile(){
		x.close();
	}
}
