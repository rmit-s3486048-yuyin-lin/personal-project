package assignment_01;

public class practise1 {
	public static void main(String[] args)
	{
		System.out.println(search(new int[] {2,3,4,5,6,7}, 4));
		System.out.println(search(new int[] {2,3,4,5,6,7}, 5));
	}
	
	public static int search(int[] nums, int target)
	{
		int found = 0;
		for(int i = 0; i < nums.length; i++)
		{
			if(nums[i] == target)
			{
				found = nums[i];
			}
			else
			{
				System.out.println("Not found!");
			}
		}
		return nums[found];
	}
}
