package introduction;

public class Senior extends Student {

	public Senior(String name) {
		super(name);//when you make a senior, first make a student
	}
	public void talk(){
		super.talk();
		System.out.println("...and I am a senior");
	}

}
