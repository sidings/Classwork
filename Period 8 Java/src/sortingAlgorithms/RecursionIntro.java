package sortingAlgorithms;

public class RecursionIntro {

	public static void main(String[] args) {
		//System.out.println("Using a for loop:");
		for (int i = 0; i < 5; i++){
		//	System.out.println("Hello, World! x" + i);
		}
		//System.out.println("Without using a for loop:");
		forLoop(5, new Action(){
			private int value = 0;
			public void act(){
			//	System.out.println("Hello, World! x" + value);
				value++;
			}
		});
		//factorial
		int integer = 5;
		for(int i = integer-1; i > 0; i--){
			integer = integer*i;
		}
		//System.out.print(integer);
		//System.out.print(factorial(5));
		
		hanoiSolution(3, "a", "b", "c");
	}

	private static void forLoop(int i, Action action) {
		if (i <= 0){//base case	
			return;
		}else{
			action.act();//standard action
			forLoop(i-1, action);//recursive call
		}
		
	}
	
	private static int factorial(int i){
		if (i <= 1){
			return i;
		}else{
			return i*factorial(i-1);
		}
	}
	
	public static void hanoiSolution(int numOfDiscs, String startPeg, String midPeg, String endPeg){
		if (numOfDiscs <= 1){
			System.out.println("Move " + startPeg + " to " + endPeg);
		}else{
			hanoiSolution(numOfDiscs-1, startPeg, endPeg, midPeg);
			hanoiSolution(1, startPeg, midPeg, endPeg);
			hanoiSolution(numOfDiscs-1, midPeg, startPeg, endPeg);
		}
	}
}
