import java.util.ArrayList;
import java.util.Arrays;

public class BasicJavaTester {
	public static void main(String[] args){
		BasicJava basicJava = new BasicJava();
		basicJava.print1To255();
		System.out.println("=======================");

		basicJava.printOdd255();
		System.out.println("=======================");

		basicJava.printSum255();
		System.out.println("=======================");

		int[] InputArray = {1,3,5,7,9,13};
		basicJava.iterateArray(InputArray);
		System.out.println("=======================");

		int[] inputK = { 1,-3,5,7,9,-13};
		int max = basicJava.findMax(inputK);
		System.out.println("The Max value is: " + Integer.toString(max));
		System.out.println("=======================");
		
		int[] inputAvg = { 2,10,3};
		double avg = basicJava.getAverage(inputAvg);
		System.out.println("The average value is: "+ Double.toString(avg));
		System.out.println("=======================");

		basicJava.arrayOddUpTo255();
		System.out.println("=======================");

		int[] X ={1,3,5,7,8,3,4,5};
		int Counter = basicJava.greaterThan(X, 3);
		System.out.println(Counter);
		//expect return value 5 numbers greater than 3
		System.out.println("=======================");

		int[] numbers = {1,3,5,7,8,3,4,5};
		int[] k = basicJava.square(numbers);
		System.out.println(Arrays.toString(k));
		// Arrays.toString(k) required import java.util.Arrays
		//Arrays.toString is required to print out array contents or elements.
		

		

	}
}