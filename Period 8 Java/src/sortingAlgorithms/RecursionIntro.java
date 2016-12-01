package sortingAlgorithms;

public class RecursionIntro {

	public static void main(String[] args) {
		/*System.out.println("Using a for loop:");
		for (int i = 0; i < 5; i++){
			System.out.println("Hello, World! x" + i);
		}
		System.out.println("Without using a for loop:");
		forLoop(5, new Action(){
			private int value = 0;
			public void act(){
				System.out.println("Hello, World! x" + value);
				value++;
			}
		});
		factorial(9);
		int integer = 5;
		for(int i = integer-1; i > 0; i--){
			integer = integer*i;
		}
		System.out.print(integer);
		System.out.print(factorial(5));
		
		hanoiSolution(3, "a", "b", "c");*/
		int n = 10; 
		System.out.println("The " + n + "th Fibonacci is " + fibonacci(n));
	}

	private static int fibonacci(int n) {
		if(n <= 1) return 1;
		else{
			int previous = fibonacci(n-1);
			System.out.println("Before we find Fibonacci " + n + ", we need to find Fibonacci " + (n-1) + ", which is " + previous);
			int beforePrev = fibonacci(n-2);
			return previous  + beforePrev;
		}
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
	private static int count = 1;
	
	public static void print(String s){
		System.out.println("Move #" +count + ":" + s);
		count++;
	}
	
	public static void hanoiSolution(int numOfDiscs, String startPeg, String midPeg, String endPeg){
		if (numOfDiscs <= 1){
			print("Move " + startPeg + " to " + endPeg);
		}else{
			System.out.println("In order to move " + numOfDiscs + " over to peg " + endPeg + ", we must move " + (numOfDiscs 
					-1) + " over to peg " + midPeg + " first.");
			hanoiSolution(numOfDiscs-1, startPeg, endPeg, midPeg);
			hanoiSolution(1, startPeg, midPeg, endPeg);
			hanoiSolution(numOfDiscs-1, midPeg, startPeg, endPeg);
		}
	}
}
