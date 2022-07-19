package week3CodingAssignement;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Week3CodingAssignement {

	public static void main(String[] args) {
		
		//1) int array called ages and subtracting first element from last without use of 7
		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93};
		System.out.println(ages[ages.length-1] - ages[0]);
		
		//1a.) testing code with additional age
		int[] ages1 = { 3, 9, 23, 64, 2, 8, 28, 93, 101 };
		System.out.println(ages1[ages1.length-1] - ages[0]);
		
		//1b.) Calculate average age
		double sum = 0;
		for (int number : ages) {
			sum += number;
		}
		double average = sum/ ages.length;
		System.out.println("Average age: " + average);
		
	    //1c.) array string called names
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck","Bob"};
		
		//2a.)
		//average number of letters per name
		double sumOfLetters = 0;
		for (String name : names) {
			sumOfLetters += name.length();
		}
		System.out.println("Average of letters per name: " + sumOfLetters/ names.length );
		
		//2b.)
		//concatenated string names with spaces
		String allNames = String.join(" ", names);
		System.out.println("Names: " + allNames);
		
		//3.)
		//access last element of an array
		System.out.println("Last name: "+ names[names.length-1]);
		
		//4.)
		//first element of any array
		System.out.println("First name: " + names[0]);
		
		//5.)
		//int array called nameLengths
		int [] nameLengths =new int[6];
		
		for (int i=0; i<names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		System.out.println("Namelengths for each element: " + Arrays.toString(nameLengths));
		
		//6.)
		//loop to calculate the sum of all the elements in the array .
		int sumOfElements = 0;
		for (String name: names) {
			sumOfElements += names.length;
		}
		System.out.println("Sum of all elements: "+ sumOfElements);
		
		//7.)
		//Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”).
		System.out.println(wordMultiplier ("Hello"+ " ",3));
		
		//8.)
		//Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		
		String firstName = ("Asha");
		String lastName = ("Dube");
		String fullName = name(firstName + " " + lastName);
		System.out.println(fullName);
		
		//9.)
		//Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		
		System.out.println(number(23));
		
		//10.)
		//Write a method that takes an array of double and returns the average of all the elements in the array.
		double[] numbers = {10, 20, 35,70};
		System.out.println(getAverage(numbers));
		
		//11.)
		//Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		double[] numbersA = {2, 4, 6};
		double[] numbersB = {6, 8, 10};
		System.out.println(averageOfMyArrays(numbersA, numbersB));
		
		
		//12.)
		//Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		  boolean isHotOutside = true; 
		  double moneyInPocket = 5.0; 
		  System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		
		
		//13.)
		//Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		//checks if the word reads the same forward or backward - it's an accurate way of checking a palindrome
		System.out.println(isPalindrome("mom"));

	  }
	
	  //All methods for associated number
	  
	  //7.)
	  public static String wordMultiplier(String word, int number) {
		  String name = "";
		  for (int i= 0; i < number; i++) {
			  name += word;
		  }
		  return "Name with spaces: "+ name;
	  }
	
	
      //8.)
	  public static String name(String fullName) {
		  
		  return "FullName: " + fullName;
	  }
	  
	  //9.)
	  public static boolean number(int sumOfInt) {
		  return sumOfInt > 100;
	  }
	  
	  //10.)
	  public static double getAverage(double [] arrays) {
		  double sum = 0;
		  for (double number : arrays) {
			  sum += number;
		  }
		  return sum / arrays.length;
	  }
	  //11.)
	 
	  public static boolean averageOfMyArrays (double[] numbersA, double[] numbersB) {
		 double sumA = 0; 
		 double sumB = 0;
		 for (double set1 : numbersA) {
			 sumA += set1;
		 }
		 for (double set2 : numbersB) {
			 sumB += set2;
		 }
		 if ((sumA/ numbersA.length) > (sumB/numbersB.length)) {
			 System.out.println();
			 return true;
		 }
		 return false;
	  }
	 
	  
	  //12.)
	  public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		  if(isHotOutside && moneyInPocket > 10.50) {
		  }
		return true;
	  }
	  
	  
	  //13.)
	  public static boolean isPalindrome(String string) {
		  for (int i =0; i < string.length(); i++) {
				 if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
					 return false;
				 }
			 }
			return true; 
	  }

		  
 }
	  
	  
