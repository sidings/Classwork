package arrays;

public class ArraysPractice {

	static boolean[] boos3;
	
	public static void main(String[] args) {
		//how do you time a process?
		long currentTime =  System.currentTimeMillis();
		
		String[] someStrings = new String[1000];
		standardPopulate(someStrings);
		String s = someStrings[999];
		makeSpecial(s);
		print(someStrings);
		
		initializingArraysExample();
		long endTime = System.currentTimeMillis();
		System.out.println("The process took " + (endTime-currentTime) + " milliseconds.");
		
	}
	
	private static void makeSpecial(String str) {
		str = "THIS STRING IS SPECIAL";
	}

	private static void print(String[] arr) {
		for (int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}

	private static void standardPopulate(String[] arr) {
		/**for (int i = 0; i< arr.length; i++){
			arr[i] = "String #" + (i+1);
		}*/
		int i = 0; 
		for (String x: arr){
			i++;
			x = "String #" + i;
		}
	}

	public static void initializingArraysExample(){
		//2 different ways 
		boolean[] boos1 = new boolean[3];
		// this can ONLY be done at the declaration because it sets size and content:
		boolean[] boos2 = {false, false, false};
		//this does NOT work:
		//boos3 = {false, true, true}; 
		//this is all that will work:
		boos3 = new boolean[3];
		
		
		/*2 ways of iterating through an array:
			STANDARD 'FOR' LOOP:
				- the index is important to keep track of
				- you need to customize the order
		 */
		
		/*
		 	if "boolean[] boos1 = new boolean[3]" then returns false, false, false
		 	if "double [] boos1 = new double[3]" then returns 0.0, 0.0, 0.0
		 	if "char[] boos1 = new char[3]" then returns  ,  ,  
		 	
		 */
		for (int i = 0; i < boos1.length; i++){
			System.out.println(boos1[i]);
		}
		
		/*
		 	'FOR-EACH' LOOP:
		 		- the index is not important
		 		- you don't need to customize
		 		- automatically assigns a "handle"
		 		- faster
		 */
		for(boolean b: boos1){
			System.out.println(b);
		}
		
		//OBJECT ARRAYS
		String[] someStrings1 = new String[3];
		String[] someStrings2 = {"a", "b", "c"};
		for (int i = 0; i < someStrings1.length; i++){
			someStrings1[i] = "a new string";
		}
		//a loop to print it:
		for(String s: someStrings1){
			System.out.println(s);
		}
		
	}
}
