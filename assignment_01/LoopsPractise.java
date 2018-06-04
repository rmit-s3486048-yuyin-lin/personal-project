package assignment_01;

public class LoopsPractise {
	public static void main(String args[])
	{
		String str = "We have a large inventory of things in our warehouse falling in " 
				+ "the category:apperal and the slightly "
				+ "more in demand category:makeup along with the category:furniture and ...";
		printCategories(str);
	}
	
	public static void printCategories(String string)
	{
		
		int i = 0;
		while(true)//perpetual loop as its always true
		{
			int indexOf1 = string.indexOf("category:", i);//returns index of category, starting from i aka 0
			//returns -1 if its not found
			//increments i if category is found
			if(indexOf1 == -1)break;//if indexOf1 does not contain 'category:' break loop.
			int beginIndex = indexOf1 + 9;//start of the category
			int endIndex = string.indexOf(" ", beginIndex);//stops at space, then the next beginIndex of category
			System.out.println(string.substring(beginIndex, endIndex));//prints the categories
			i = endIndex + 1;//goes to the second index
		}
		
	}
}
