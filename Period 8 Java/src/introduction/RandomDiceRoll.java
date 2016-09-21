package introduction;

public class RandomDiceRoll {

	public static void main(String[] args) {
		int[] results = new int[6];//fill array with 6 zeroes
		
		int totalRolls = 1000;
		//declare variable, logic test, increment
		for(int index = 0; index < 1000; index ++){
			int result = rollFairDie();
			//if(index%2 == 0) System.out.println("Roll #" + (index + 1)+ ":" + rollFairDie());
			//else System.out.println("Roll #" + (index + 1) + ":" + rollUnfairDie());
			//System.out.println("Roll #" + (index + 1) + ":" + result);
			results[result-1] ++;
		}
		//print the results
		for (int i = 0; i<6; i++){
			double percentage = ((int) (1000*(double)results[i]/totalRolls))/10.0;
			System.out.println((i + 1) + " appeared " + percentage + " %.");
		}
			
	}
	//return 1,2,3,4,5,6 with equal probability
	public static int rollFairDie(){
		double rand = Math.random();//returns a double between 0 and 1
		//int roll = (int) (6*rand);//[0, 5]
		int roll = (int) (6*rand)+1;//[1, 6]
		return roll;
	}
	public static int rollUnfairDie(){
		return 1;
	}
}

