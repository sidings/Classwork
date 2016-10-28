package arrays;

public class ArrayMethodsHW {

    public static void main(String[] args) {
    
     /**
      * IMPORTANT NOTE: 
      * This homework assignment will be weighted 4x.
      * DO NOT ASSUME my tests are perfect! If you have code that you think should work, 
      * but you keep failing the tests PLEASE bring it to my attention so that I can fix the tests
      * DO NOT spend hours and hours trying to fix perfect code just because my test
      * says that it isn't perfect!
      * */
      long start = System.currentTimeMillis();
      int[] seqarr1 = {1000, 998, 993, 988, 984, 980,282,281, 280, 977, 972, 969, 966, 964, 958, 956, 952, 951, 945, 941, 938, 937, 936, 935, 932, 931, 926, 925, 922, 919, 917, 911, 907, 905, 900, 894, 893, 889, 887, 885, 879, 878, 876, 871, 866, 863, 858, 854, 850, 846, 842, 837, 835, 834, 832, 828, 827, 821, 816, 814, 812, 809, 806, 805, 804, 799, 795, 789, 787, 781, 778, 772, 768, 765, 764, 760, 758, 754, 752, 750, 749, 743, 741, 739, 738, 737, 735, 734, 730, 726, 725, 724, 718, 716, 711, 706, 704, 700, 696, 692, 690, 684, 680, 678, 676, 672, 667, 661, 656, 651, 645, 643, 638, 637, 636, 635, 634, 631, 630, 624, 621, 617, 616, 615, 614, 609, 603, 597, 596, 594, 589, 584, 582, 576, 570, 568, 565, 560, 557, 551, 548, 544, 542, 541, 535, 530, 526, 520, 515, 512, 506, 503, 502, 499, 498, 494, 490, 487, 483, 481, 475, 473, 468, 463, 460, 458, 453, 448, 444, 439, 437, 435, 432, 430, 427, 421, 418, 417, 414, 408, 405, 400, 398, 396, 393, 391, 388, 383, 377, 373, 372, 371, 367, 361, 357, 355, 350, 344, 341, 337, 335, 330, 328, 327, 326, 321, 317, 312, 310, 304, 303, 298, 296, 291, 290, 285, 280, 275, 273, 269, 266, 264, 262, 260, 255, 251, 249, 246, 245, 241, 238, 235, 233, 228, 227, 225, 219, 213, 208, 203, 201, 196, 195, 189, 183, 178, 176, 171, 166, 160, 155, 149, 147, 145, 142, 140, 135, 134, 128, 126, 124, 122, 116, 112, 109, 107, 103, 100, 96, 90, 88, 83, 79, 76, 74, 73, 72, 71, 68, 67, 64, 63, 57, 52, 47, 44, 41, 40, 37, 32, 27, 26, 22, 18, 13, 7, 5, 2, -2, -7, -8, -10, -12};
		int[] seqarr2 = {300, 299, 293, 289, 288, 282,281, 280, 277, 272, 266, 264, 260, 258, 253, 249, 245, 239, 237, 234, 232, 226, 220, 218, 216, 213, 209, 203, 198, 194, 193, 187, 186, 181, 180, 179, 177, 171, 168, 167, 165, 159, 155, 150, 146, 140, 136, 135, 130, 127, 124, 119, 118, 113, 111, 107, 101, 96, 92, 91, 88, 87, 86, 81, 80, 78, 73, 70, 69, 66, 63, 60, 54, 53, 47, 43, 40, 36, 30, 27, 25, 22, 17, 16, 15, 11, 7, 4, 2, 0, -1, -6, -11, -17, -21, -26, -28, -33, -37, -39, -41, -43, -48, -49, -51, -53, -59, -62, -65, -67, -70, -73, -75, -79, -80, -86, -91, -97, -100, -106, -112, -115, -117, -122, -127, -128, -133, -136, -138, -141, -142, -146, -147, -150, -151, -157, -163, -169, -172, -176, -181, -187, -190, -194, -195, -197, -198, -201, -204, -209, -215, -219, -221, -224, -229, -234, -239, -241, -242, -247, -253, -259, -260, -264, -267, -268, -270, -275, -281, -282, -287, -293, -297, -299, -301, -305, -307, -310, -314, -316, -320, -325, -328, -333, -338, -340, -342, -343, -348, -354, -355, -361, -363, -369, -372, -375, -376, -377, -378, -384, -387, -392, -396, -398, -399, -402, -405, -406, -411, -415, -420, -426, -428, -431, -437, -442, -448, -452, -456, -460, 301, -468, -471, -472, -478, -484, -486, -492, -498, -500, -502, -506, -507, -511, -515, -516, -517, -518, -520, -526, -529, -535, -540, -545, -550, -556, -557, -558, -562, -564, -569, -573, -576, -580, -584, -588, -589, -592, -595, -599, -603, -607, -611, -617, -618, -622, -625, -629, -631, -632, -638, -642, -645, -650, -651, -657, -658, -664, -669, -670, -674, -675, -678, -680, -681, -682, -686, -691, -695, -699, -700, -703, -705, -708, -712, -714, -720, -721, -727, -729, -733};

		
		System.out.println(longestSharedSequence(seqarr1, seqarr2));
        // System.out.println(longestSharedSequence(arr, arr1));
        long end  =  System.currentTimeMillis();
        System.out.println(end-start);
    }
    
    public static int searchUnsorted(int[] arrayToSearch, int key){
    /**
     * this method take an unsorted int array (arrayToSearch) and returns an 
     * int corresponding to the index of a key, if it is in the array
     * if the key is not in the array, this method returns -1
     * */
    	for (int i = 0; i<arrayToSearch.length; i++){
    		if (arrayToSearch[i] == key){
    			return i;
    		}
    	}
     return -1;
    }
    
    public static int searchSorted(int[] sortedArrayToSearch, int key){
	    /**
	     * this method is exactly like the one above, except the parameter sortedArrayToSearch will
	     * always be sorted in DESCENDING order. Again return the index of the key or return -1
	     * if the key is not in the array
	     * 
	     * Note: You should attempt to write a method that is more efficient that searchUnsorted
	     * */
	    	for(int i = sortedArrayToSearch.length - 1; i > -1; i-- ){
	    		if(sortedArrayToSearch[i] == key){
	    			return i;
	    		}
	 			
	 		}
	     return -1;
	    }

    public static boolean isSorted(int[] array){
        /**
         * This method takes an in array as a parameter and returns 'true' if the array is already sorted in DESCENDING order
         * */
    	for (int i = 0; i<array.length-1; i++){
    		if (array[i] < array[i+1] || array[i] == array[i+1]){
    			return false;
    		}
    	}
    	return true;
    }
    
    public static double[] getStats(double[] array){
	        /** 
	         * This method return a double[] contain a WHOLE BUNCH of stats
	         * The double array must keep the following stats about the array parameter:
	         * index 0 = the mean
	         * index 1 = the max
	         * index 2 = the min
	         * index 3 = the median
	         * index 4 = the number of values greater than or equal to the mean
	         * index 5 = the number of values below the mean
	         * */
	    	 
	         double[] stats = new double[6];
	         sortArray(array);
	         
	         stats[0] = getMean(array);
	         stats[1] = array[array.length - 1];
	         stats[2] = array[0];
	         stats[3] = getMedian(array);
	         stats[4] = getValuesGreater(array);
	         stats[5] = getValuesLess(array);
	         return stats;
	    }
	   
		private static void sortArray(double[] array) {
			for(int i = 0; i < array.length; i++){
				for(int j = i + 1; j < array.length; j++){
					if(array[j] < array[i]){
						double placeholder = array[i];
						array[i] = array[j];
						array[j] = placeholder;
					}
				}
			}
		}

		private static double getMean(double[] array){
			double average = 0;
	    	for(int i = 0; i < array.length; i++){
	    		average = average + array[i];
	    	}
	    	
			double mean = average / array.length;
			
			return mean;
	    }
		
		private static double getMedian(double[] array) {
			int middleNum = 0;
			if(array.length % 2 != 0){
				middleNum = (array.length - 1) / 2;
				return array[middleNum];
			}
			else{
				middleNum = (array.length - 1) / 2;
				return(array[middleNum] + array[middleNum + 1]) / 2;
			}
			
		}
		
		private static double getValuesLess(double[] array) {
			double average = 0;
			int totalNumbers = 0;
	    	for(int i = 0; i < array.length; i++){
	    		average = average + array[i];
	    	}
	    	double mean = average / array.length;
			
			for(int j = 0; j < array.length; j++)
				if(array[j] < mean){
					totalNumbers++;
				}
				
			return totalNumbers;
		}

		private static double getValuesGreater(double[] array) {
			double average = 0;
			int totalNumbers = 0;
	    	for(int i = 0; i < array.length; i++){
	    		average = average + array[i];
	    	}
	    	double mean = average / array.length;
			
			for(int j = 0; j < array.length; j++)
				if(array[j] >= mean){
					totalNumbers++;
				}
				
			return totalNumbers;
		}
    
   /* public static double[] findMedian(double[] array){
    	double[] inOrder = new double [array.length];
    	for (int i = 0; i<array.length-1; i++){
    		if (array[i] > array[i+1] || array[i] == array[i+1]){
    			inOrder[i] = array[i+1];
    			inOrder[i+1] = array[i];
    		}
    		else {
    			inOrder[i] = array[i];
    			inOrder[i+1] = array [i+1];
    			findMedian(inOrder.subString)
    		}
    	}
    	return inOrder;
    }
    public static double[] getStats(double[] array){
        /** 
         * This method return a double[] contain a WHOLE BUNCH of stats
         * The double array must keep the following stats about the array parameter:
         * index 0 = the mean
         * index 1 = the max
         * index 2 = the min
         * index 3 = the median
         * index 4 = the number of values greater than or equal to the mean
         * index 5 = the number of values below the mean
         * 
    	double max = array[0], min = array[0], mean = 0, median, greaterThanMean, lessThanMean;
    	//double[] inOrder = new double [array.length];
    	
    	/*int focus = 0;
    	inOrder[focus] = array[focus];
    	for (int i = focus +1; i<array.length; i++){
    		if (array[i] > inOrder[focus] || array[i] == inOrder[focus]) inOrder[i] = array[i];
    		else {
    			inOrder[i] = inOrder[focus];
    			inOrder[focus] = array[i];
    		}
    		}
    		/*if (array[i] > max || array[i] == max) max = array[i];
    		else min = array[i];
    		if (i == array.length-1) mean = mean/array.length;
    		else mean = mean + array[i];
    
        // double[] stats = new double[] {mean, max, min, median, greaterThanMean, lessThanMean};
         //return stats;
    	return inOrder;
    }*/

    public static void reverseOrder(int[] array){
        /**
         * this method reverses the order of the array passed to it.
         * Not that this method does not have a return type. You do not need to copy the array first
         * Furthermore, note that the array is not necessarily in any *particular* order. It may be 
         * in a random order, though you still need to reverse whatever order it is in
         * 
         * Example:
         * array = {5, 1, 9, 10, 16, -6}
         * after calling this method
         * array = {-6, 16, 10, 9, 1, 5}
         * 
         * */
    	int focus = array.length-1;
    	
    	for (int i = 0; i<array.length/2;i++){
    		int x = array[i];
    		int y = array[focus];
    		array[i] = y;
    		array[focus] = x;
    		focus--;
    	}
    }
    
    public static int countDifferences(int[] array1, int[] array2){
        /**Here, you will write an method that returns the number of values in two arrays 
         * that are NOT the same (either in value OR location).
         * The arrays ALWAYS have the same length
         * Examples:
         * countDifferences({1,2,3},{1,2,3}) returns 0, since these arrays are exactly the same
         * countDifferences({3,2,3,4},{3,2,5,4}) returns 1, since '3','2', and '4' are same value, same location, but the 3 and 5 are different
         * countDifferences({4,4,4,4},{1,2,3,4}) returns 3, since '4' is only at the same index ONE time and three others are not
         * countDifferences({1,2,3},{1,3,2}) returns 2, since '2' and '3' are both present, but different locations
         * 
         * */
    	int ctr = 0;
    	for (int i = 0; i < array1.length; i++){
    		if (!(array1[i] == array2[i])){
    			ctr++;
    		}
    	}
         return ctr;
    }
    

    public static int longestConsecutiveSequence(int[] array1){
        /**This method counts the longest consequtive sequence in an array.
         * It does not matter where the sequence begins
         * If there are no consecutive numbers, the method should return '1'
         * 
         * Examples:
         * longestSequence({1,2,3,4,5,8,9}) returns '5', since the sequence '1,2,3,4,5' is 5 integers long 
         * longestSequence({0,9,10,11,4,3,8,9}) returns '3', since '9,10,11' is 3 integers long
         * longestSequence({0,9,8,11,4,3,7,9}) returns '1', since there are no consecutive integers
         * */
    	/* 
    	 *  int[] arr = {1, 2, 3, 4, 5, 7, 6};
      		int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
      		System.out.println(longestConsecutiveSequence(arr));*/
        int ctr = 1; 
        int greatestLength = 0;
        
        for (int i = 0; i < array1.length-1; i++){
            int first = array1[i] +1;
            int second = array1[i+1];
        	if (first == second){
        		ctr++;
        	}else{
        	    if (ctr > greatestLength){
        	        greatestLength = ctr;
        	    }
        	    ctr = 1;
        		
        	}
        }
        return greatestLength;
    }

    public static int longestSharedSequence(int[] array1, int[] array2){
        /**This method counts the longest unbroken, shared sequence in TWO arrays.
         * The sequence does NOT have to be a consecutive sequence
         * It does NOT matter where the sequence begins, the arrays might not be the same length
         * 
         * Examples:
         * longestSequence({9,6,3,4,3,8,9}, {9,6,3,4,3,6,7}) returns '5', since the sequence '9,6,3,4,3' is in both arrays and is 5 integers long 
         * longestSequence({0,9,6,3,4,3,8,9}, {1,2,9,6,3,4,3,6,7}) returns '5', 
         *          since the sequence '9,6,3,4,3' is in both arrays and is 5 integers long, it doesn't matter that the sequence begins at different indices 
         * longestSequence({9,6,1,4,3,6,7,9}, {9,6,5,8,3,6,7,0}) returns '3', since the sequence '3,6,7' is in both arrays and is 3 integers long
         * */
        int longest = 1;
        boolean isSequence = false;
        int sequenceLength = 0;
        int[] arrA;
        int[] arrB;
        if(array1.length > array2.length){
        	arrA = array1;
        	arrB= array2;
        }else{
        	arrA = array2;
        	arrB = array1;
        }
        for(int i = 0; i < arrA.length; i++){
        	for(int j = 0; j < arrB.length; j++){
        		if(arrA[i] == arrB[j]){
        			isSequence = true;
	            }else{
	                isSequence = false;  
	            }
	            if(isSequence){
	               	sequenceLength ++;
	                i++;
	            }else if(sequenceLength > longest){
	                longest = sequenceLength;
	                sequenceLength = 0;
	            }else{
	               	sequenceLength = 0;
	            }
	       }
        }
        if(sequenceLength > longest){
            return sequenceLength;
        }else{
            return longest;
        }
        
    }

    public static int[] generateDistinctItemsList(int n){
        /**
         * This method needs to generate an int[] of length n that contains distinct, random integers
         * between 1 and 2n 
         * The method will be tested by verifying that the array you return is n items long,
         * contains only entries between 1 and 2n (inclusive) and has no duplicates
         * 
         * */
    	
    	   int[] arr = new int[n];
    	   int nextInt;
	        for(int i = 0; i < arr.length; i++){
	            boolean onlyOne = false;
	            do{
	                nextInt = (int)(Math.random()*(2*n))+1;
	                onlyOne = true;
	                for(int j = 0; j < i; j++){
	                    if(nextInt == arr[j]){
	                        onlyOne = false;
	                    }
	                }
	            }while(!onlyOne);
	            arr[i] = nextInt;
	        }
	        return arr; 
	    }

	public static void cycleThrough(int[] array, int n){
        /** This problem represents people moving through a line.
         * Once they get to the front of the line, they get what they've been waiting for, then they 
         * immediately go to the end of the line and "cycle through" again.
         * 
         * This method reorders the array so that it represents what the array would look like
         * after it had been cycled through an n number of times.
         * For example, cycleThrough({2,1,5,6}}, 1) after executing, array == {1,5,6,2} 
         * because '2' (the person at the front of the line) cycled through and is now at the end of the line
         * 
         * cycleThrough({3,7,4,2,8,6,2,9}}, 2) after executing, array == {4,2,8,6,2,9,3,7} 
         * because '3' and '7' (the TWO people at the front of the line) cycled through and are now at the end of the line
         * 
         * Likewise,
         * cycleThrough({3,7,4,2,8,6,2,9}}, 0) after executing, array == {3,7,4,2,8,6,2,9}  (no movement)
         * and the most interesting case, 
         * cycleThrough({3,7,4,2,8,6,2,9}}, 49) after executing, array == {7,4,2,8,6,2,9,3}  
         * Because after cycling through 49 times, everyone had a chance to go through 6 times, but '3'
         * was able to go through one more time than anyone else
         * 
         * CHALLENGE
         * For extra credit, make your method handle NEGATIVE n
         * */
		 int temp;
         for(int i = 0; i < n; i++){
             temp = array[0];
             for(int j = 1; j < array.length; j++){
                 array[j-1] = array[j];
             }
             array[array.length-1] = temp;
         }
    }
}
   
