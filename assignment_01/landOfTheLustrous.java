package assignment_01;

public class landOfTheLustrous {
	
	public static void main(String[] args) {
		System.out.println(printDollars("hello"));
	}
	
	public static String printDollars(String str){
		String[] strArray = new String[str.length()];
		int e = 1;
		for(int i = 0; i < str.length(); i++)
		{
			strArray [i] = str;
			for(int j = 0; j < str.length(); j++)
			{
				strArray[j]+= e = '$';
			}
			
		}
		return str;
		
		
	}
}
