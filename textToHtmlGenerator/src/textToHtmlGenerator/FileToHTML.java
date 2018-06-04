package textToHtmlGenerator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileToHTML 
{
	private Scanner x;
	public void openFile()
	{
		try
		{
			//C:/Users/Sean Lin/workspace/textToHtmlGenerator/input.txt
			//File input = new File("input.txt");
			//FileReader file = new FileReader(input);
			//BufferedReader rdr = new BufferedReader(file);
			x = new Scanner(new File("input.txt"));
			
		}
		catch(Exception error)
		{
			System.out.println("File not found!");
		}
	}
	public void readWriteFile()
	{
		System.out.println("Beginning to convert file!");
		int i = 0;
		String header = "<head>";
		String headerEnd = "</head>";
		String list = "<li>";
		String listEnd = "</li>";
		String inputArray[] = new String[15];
		while(x.hasNextLine())
		{
			i++;
			String line = x.nextLine();
			inputArray[i] += line;
			
		}
		try
		{
			PrintWriter write = new PrintWriter("output.txt");
			write.println("<html>");
			write.println(header);
			write.println("<title>" + inputArray[1] + "</title>");
			write.println(headerEnd);
			write.println("<body>");
			write.println("<ul>");
			for(int j = 2; j < i+1; j++)
			{
				write.println(list + inputArray[j] + listEnd);
			}
			write.println("</ul>");
			write.println("</body>");
			write.println("</html>");
			write.close();
			System.out.println("conversion complete!");
		}
		catch(Exception e)
		{
			System.out.println("unable to write file!");
		}
		
	}
	
	public void closeFile()
	{
		x.close();
	}
}
