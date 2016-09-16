package introduction;

public class Junior extends Student {

	String food;
	
	public Junior(String name, String faveFood) {
		super(name);
		this.food = faveFood;
	}
	
	public void talk(){
		System.out.println("I like " + food);
	}

}
