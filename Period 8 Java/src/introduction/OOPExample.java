package introduction;

public class OOPExample {

	public static void main(String[] args) {
		Student jillian = new Senior("Jillian");
		Student jordan = new Junior("Jordan", "beef");
		Student joseph = new Freshman("Joseph");
		
		jillian.talk();
		jordan.talk();
		((Freshman)joseph).cry();
	}

}
