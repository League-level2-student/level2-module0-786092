package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[]teams = {"Lakers","Celtics","Knicks","Sixers","Warriors"};
		//2. print the third element in the array
		System.out.println(teams[2]);
		//3. set the third element to a different value
		teams[2] = "Bulls";
		//4. print the third element again
		System.out.println(teams[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i=0; i<teams.length;i++) {
			System.out.println(teams[i]);
		}
		
		//6. make an array of 50 integers
		int[]numbers = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random rand = new Random();
		for(int i=0; i<numbers.length;i++) {
			numbers[i]=rand.nextInt(100);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int n = numbers[0];
		for(int i=0; i<numbers.length;i++) {
			if(numbers[i]<n) {
				n=numbers[i];
			}
		}
		System.out.println(n);
		System.out.println();
		//9 print the entire array to see if step 8 was correct
		for(int i=0; i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		//10. print the largest number in the array.
		int num = numbers[0];
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]>num) {
				num = numbers[i];
			}
		}
		System.out.println();
		System.out.println(num);
		System.out.println();
	}
}
