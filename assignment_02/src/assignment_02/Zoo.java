package assignment_02;

import java.util.Scanner;

public class Zoo {
	static int choice;
	public static void main(String[] args) {
		System.out.println("Please enter animal parameters.");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter type");
		String type = sc.nextLine();
		System.out.println("Enter action");
		String action = sc.nextLine();
		System.out.println("Enter weight");
		int weight = sc.nextInt();
		
		Animal firstAnimal = new Animal(weight, type, action);
		
		System.out.println("choose your option - 1: view weight, 2: view type, 3: view action");
		choice = sc.nextInt();
		
		switch(choice){
			case 1: firstAnimal.giveWeight();
				break;
			case 2: firstAnimal.giveType();
				break;
			case 3: firstAnimal.DoSomething();
				break;
		}
		Animal[] mightyList = new Animal[2];
		Snake solidSnake = new Snake(weight, type, action);
		Panetta alexPanetta = new Panetta(weight, type, action);
		solidSnake.hiss();
		mightyList[0] = solidSnake;
		mightyList[1] = alexPanetta;
		//loops for i < mightyList.length
		for(Animal i: mightyList){ 
			i.DoSomething();
		}
		
	}
	
	
}
