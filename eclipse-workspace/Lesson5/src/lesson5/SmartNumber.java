package lesson5;
import java.util.*;
/*
 * SmartNumber.jave computes property value of number
 */
public class SmartNumber {
    
	//declare an empty constructor
	public SmartNumber() {
		System.out.println("Starting the app");
	}

	//compute whether the number is even. Return true if the number is even, otherwise return false.
	/*public boolean isNumberEven(int number) {
		//declare a variable to store whether the number is even
		boolean isEven = false;
		int remainder =number % 2;

		if (remainder == 0) {
			isEven = true;
		}
		return isEven;
	}*/

	public boolean isNumberEven(int number) {
		//declare a variable to store whether the number is even
				boolean isEven = false;
				int remainder =number % 2;

				if (remainder == 0) {
					isEven = true;
				}
		return isEven;
	}
}
