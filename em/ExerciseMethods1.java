// Imports are not allowed in this exercise.

//READ ALL COMMENTS BEFORE BEGINNING

/**
	This exercise involves implementing several methods. Stubs for each method
	with documentation are given here. It is your task to fill out the code in
	each method body so that it runs correctly according to the documentation.

	Example inputs with outputs are provided in the comments before each method.
	At a minimum, your solutions must pass these tests. Mimir will test using
	these inputs, but it will also test with more hidden inputs. Therefore,
	hardcoding the answers will not pass. To get credit for a method, it must
	pass all test cases for that method.

	By Robert Lightfoot and Ariana Morris
	in the style of Bruce Gooch.

	@author <Your Name>
	<Your UIN>
	@version <The Date>
**/

// Imports are not allowed in this exercise.

public class ExerciseMethods1{

	/**
		Integer method returns the maximum range between the 4 numbers given.

		intRange(1,2,3,4) returns 3
		intRange(8,6,4,2) returns 6
		intRange(-1,-9,-7,-5) returns 8
		intRange(7,-10,10,8) returns 20
		intRange(1,1,1,1) returns 0

		@param num1 int,
		@param num2 int,
		@param num3 int,
		@param num4 int,
		@return the distance between the max and min numbers given.
	*/
	public static int intRange(int num1, int num2, int num3, int num4)
	{
		// Your answer here. Edit the return statement as necessary.
		return 0;//only here to compile, you will need to change.
	}// end intRange

	/**
		Integer method returns the integer given reversed. Leading zeros do not
		need to show.

		intReverse(1234) returns 4321
		intReverse(0) returns 0
		intReverse(50) returns 5
		intReverse(-501) returns -105

		@param num1 int,
		@return the integer given in reverse order.
	*/
	public static int intReverse(int num)
	{
		// Your answer here. Edit the return statement as necessary.
    return 0;//only here to compile, you will need to change.
	}// end intReverse


		/**
			Double method returns the sum of the areas of 3 individual triangles.
			The base/height of each triangle are equal and are given.
			(negitives can represent location as well as dimention)
			* The formula for triangle area is (b*h) / 2 and in our case,
			  b = h = num.

			threeTriangles(1.0,2.0,3.0) returns 7.0
			threeTriangles(2.5,1.0,3.2) returns 8.745
			threeTriangles(-1.0,-9.0,-7.0) returns 65.5
			threeTriangles(0,0,8.0) returns 32.0
			threeTriangles(1.0,1.0,1.0) returns 1.5

			@param num1 double
			@param num2 double
			@param num3 double
			@return the sum of the area of all three triangles.
		*/
		public static double threeTriangles(double num1, double num2, double num3)
		{
			// Your answer here. Edit the return statement as necessary.
			return 0.0;//only here to compile, you will need to change.
		}// end threeTriangles

		/**
			Double method returns the fractional part of the number given.

			fractionalPart(3.14159) returns 0.14159
			fractionalPart(2.0) returns 0
			fractionalPart(-1.1) returns -0.1
			fractionalPart(184.9985) returns 0.9985

			@param num double
			@return the sum of the area of each square.
		*/
		public static double fractionalPart(double num)
		{
			// Your answer here. Edit the return statement as necessary.
			return 0.0;//only here to compile, you will need to change.
		}// end fractionalPart


	/**
		boolean method returns true if the given string ends with the same letter it
		begins with, regardless of case (false if otherwise)

		firstLastEqual("Robert") returns false
		firstLastEqual("Ariana") returns true
		firstLastEqual("Taco cat") returns true
		firstLastEqual("42") returns false
		firstLastEqual("") returns false
		firstLastEqual("Goodness, clean up that dog") returns true
		firstLastEqual("HoHOho")) returns false

		@param original String,
		@return true if (ignoring case) the first letter is the same as the last
		letter (Not just last character). False otherwise.
	*/
	public static boolean firstLastEqual(String original)
	{
		// Your answer here. Edit the return statement as necessary.
    return false;//only here to compile, you will need to change.
	}// end firstLastEqual


	/**
		boolean method that returns true if the first string is shorter than the
		second (false if otherwise)

		shorterThan("Robert", "Robert") returns false
		shorterThan("Robert", "Susie") returns false
		shorterThan("", "anything") returns true
		shorterThan("abc", "xyz") returns false

		@param s1 String,
		@param s2 String,
		@return true if string 1 is longer than string 2
	*/
	public static boolean shorterThan(String s1, String s2)
	{
		// Your answer here. Edit the return statement as necessary.
		return (s1.length() < s2.length()); //only here to compile, you will need to change.
	}// end shorterThan


	/**
		String method returns the given string reversed.

		stringReverse("Taco Casa") returns "asaC ocaT"
		stringReverse("what's up") returns "pu s'tahw"
		stringReverse("23.9") returns 9.32
		stringReverse("Platform Nine and Three-Quarters") returns
			"sretrauQ-eerhT dna eniN mroftalP"
		stringReverse("") returns ""
		stringReverse("87") returns 78

		@param s1 String,
		@return the given string in reverse.
	*/
	public static String stringReverse(String s1)
	{
		// Your answer here. Edit the return statement as necessary.
		return "";
	}// end stringReverse

	/**
		String method returns the given age and weight in a certian output.
		Limit age to 0 < age < 150
		Limit weight to 0 < height < 8'4
		* Note: 8'4 = 100 inches

		ageAndHeight(100, 5, 6) returns "Age: 100, Height: 5'6."
		ageAndHeight(4, 3, 2) returns "Age: 4, Height: 3'2."
		ageAndHeight(-10, 0, 0) returns "Age or height is out of range."
		ageAndHeight(25, -4, 11) returns "Age or height is out of range."
		ageAndHeight(75, 6, -8) returns "Age or height is out of range."
		ageAndHeight(155, 6, 1) returns "Age or height is out of range."


		@param age int,
		@param feet int,
		@param inches int,
		@return "Age: age, Height: height." or "Age or height is out of range."
	*/
	public static String ageAndHeight(int age, int feet, int inches)
	{
		// Your answer here. Edit the return statement as necessary.
		return "";
	}// end ageAndHeight


	/**
	 	Character method returns the first repeated character in the given string.
		Or returns the character '0' if no characters are repeated

	 	charRepeat("I love CSCE111") returns 'C'
	 	charRepeat("The bill is $12.97") returns 'i'
	 	charRepeat("Bananas for monkeys.") returns 'a'
		charRepeat("cat") returns '0'
		charRepeat("") returns '0'

	 	@param text String,
	 	@return the first repeated charracter in a string.
	*/
	public static char charRepeat(String text)
	{
		// Your answer here. Edit the assignment and return statement as necessary.
		return '0';
	}// end charRepeat


	/**
		Integer method is given an array of integers(any size). Return the sum of the integers.
		return zero if the array is empty.

		sumArray({}) returns 0
		sumArray({1}) returns 1
		sumArray({1,1,1,1}) returns 4
		sumArray({1,10,100,1000}) returns 1111
		sumArray({10,-10,20,-20}) returns 0
		sumArray({-2,-2,-2}) returns -6

		@param nums integer array,
		@return the sum of all integers in the array.
	*/
	public static int sumArray(int[] nums)
	{
		// Your answer here. Edit the assignment and return statement as necessary.
		int sum = 0;
		return sum;
	}// end sumArray

}// end ExerciseMethods1
