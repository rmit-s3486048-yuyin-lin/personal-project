package textToHtmlGenerator;

public class PowerLevelCalculator {
	public void Calculation(int str, int spd, int end, int spk){
		int sum;
		if(spk > 10 || spk < 1)
		{
			System.out.println("Please enter a number between 1-10!");
			System.exit(0);
		}
		
		sum = (str + spd + end) * spk;
		System.out.println("Your power level is: " + sum);
		System.out.println("Strength Level: " + str);
		System.out.println("Speed Level: " + spd);
		System.out.println("Endurance Level: " + end);
		
		
		if(sum <= 100)
		{
			System.out.println("You are really weak..");
		}
		if(sum <= 1000 && sum > 100)
		{
			System.out.println("You are not very strong...");
		}
		else if(sum <= 3000 && sum > 1000)
		{
			System.out.println("Not a bad fighter! Well done!");
		}
		else if(sum <= 6000 && sum > 3000)
		{
			System.out.println("You are an elite!");
		}
		else if(sum <= 12000 && sum > 6000)
		{
			System.out.println("You know no bounds...");
		}
		else if(sum > 12000 || (sum <= 100000 && sum > 100000)  )
		{
			System.out.println("Ji..Jiren?? is that you??");
		}
		
	}
}
