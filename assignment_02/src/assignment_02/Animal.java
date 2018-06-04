package assignment_02;

public class Animal {
	int weight;
	String type;
	String action;

	public Animal(int weight, String type, String action) {
		super();
		this.weight = weight;
		this.type = type;
		this.action = action;
	}

	public void DoSomething(){
		System.out.println("test action - " + action);
	}

	public void giveType(){
		System.out.println("test type -" + type);
	}
	
	public void giveWeight(){
		System.out.println("test weight" + weight);
	}
	
	
}