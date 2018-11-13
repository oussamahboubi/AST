package EX2;

import java.util.ArrayList;

public class Ex2 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> tabInt = new ArrayList<Integer>();
		ArrayList<Long> tabLong = new ArrayList<Long>();
		tabInt.add(1);
		tabInt.add(2);
		tabLong.add((long) 1);
		tabLong.add((long) 2);
		
		long startTimeInt = System.nanoTime();
		long outputInt, outputLong;
		for(int i=0; i<Integer.MAX_VALUE; i++) {
			for(int j = 2; j<i; j++)
				if(i%j == 0)
					break;
			tabInt.add(i);	
		}
		long endTimeInt = System.nanoTime();
		outputInt = endTimeInt - startTimeInt;
		
		long startTimeLong = System.nanoTime();
		for(long i=0; i<Long.MAX_VALUE; i++) {
			for(int j = 2; j<i; j++)
				if(i%j == 0)
					break;
			tabLong.add(i);
			
		}
		long endTimeLong = System.nanoTime();
		outputLong = endTimeLong - startTimeLong;
		System.out.println("All Integer prime numbers : "+tabInt);
		System.out.println("Time needed : "+outputInt);
		System.out.println("All Long prime numbers : "+tabLong);
		System.out.println("Time needed : "+outputLong);
		
	}
}
