package introduction;

public class Freshman extends Student {

	public Freshman(String name) {
		super(name);
	}
	
	public void talk(){
		super.talk();
		//System.out.println();
	}
	public void cry(){
		System.out.println("ok");
	}

}
