package week3CodingAssignement;

import java.lang.reflect.Array;

public class Week3CodingAssignement {

	public static void main(String[] args) {
		
		// int array called ages and subtracting first element from last without use of 7
		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93};
		System.out.println(ages[ages.length-1] - ages[0]);
		
		//testing code with additional age
		int[] ages1 = { 3, 9, 23, 64, 2, 8, 28, 93, 101 };
		System.out.println(ages1[ages1.length-1] - ages[0]);
		
		//Calculate average age
		double sum = 0;
		for (int number : ages) {
			sum += number;
		}
		double average = sum/ ages.length;
		System.out.println("Average age: " + average);
		
	    //array string called names
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck","Bob"};
		
		//average number of letters per name
		double sumOfLetters = 0;
		for (String name : names) {
			sumOfLetters += name.length();
		}
		System.out.println("Average of letters per name: " + sumOfLetters/ names.length );
		
		//concatenated string names with spaces
		String allNames = String.join(" ", names);
		System.out.println("Names: " + allNames);
		
		//access last element of an array
		System.out.println("Last name: "+ names[names.length-1]);
		
		//first element of any array
		System.out.println("First name: " + names[0]);
		
		//int array called nameLengths
		
		
		//loop to calculate the sum of all the elements in the array .
		int sumOfElements = 0;
		for (String name: names) {
			sumOfElements += names.length;
		}
		System.out.println("Sum of all elements: "+ sumOfElements);
		
		//Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”).
		
		
		//Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		String firstName = ("Asha");
		String lastName = ("Dube");
		String fullName = name(firstName + " " + lastName);
		System.out.println(fullName);
		
		//Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		System.out.println(number(23));
		
		//Write a method that takes an array of double and returns the average of all the elements in the array.
		double[] numbers = {10, 20, 35,70};
		System.out.println(getAverage(numbers));
		
		//Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		
		
		//Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		
		
		
		
		//Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		//checks if the word reads the same forward or backward - it's an accurate way of checking a palidrome
		System.out.println(isPalindrome("mom"));

	  }
	

	  public static String name(String fullName) {
		  
		  return "FullName: " + fullName;
	  }
	  
	  public static boolean number(int sumOfInt) {
		  return sumOfInt > 100;
	  }
	  
	  public static double getAverage(double [] arrays) {
		  double sum = 0;
		  for (double number : arrays) {
			  sum += number;
		  }
		  return sum / arrays.length;
	  }
	  
	  public static boolean isPalindrome(String string) {
		  for (int i =0; i < string.length(); i++) {
				 if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
					 return false;
				 }
			 }
			return true; 
	  }

		  
 }
	  
	  
