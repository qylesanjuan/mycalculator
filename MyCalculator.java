
/**
 * Author: Kristine Elaine P. Bautista
 * Program Description: Calculator of Simple Mathematical Functions
 *
**/

/**
 * This was further edited by Qyle John DLA. San Juan
 * REVISIONS APPLIED: 
 * 		Changed the contents of  int nfactorial()
 * 		Changed the contents of  int binarySearch(int[] a, int x)
 * 
 * DATE ACCOMPLISHED: 2/15/15 6:38 pm
**/
import java.util.Arrays;
import java.util.regex.*;
public class MyCalculator {
	// add two numbers
	public float add(float a,float b){
		return a+b;
	}
	
	// subtract two numbers
	public float subtract(float a,float b){
		return a-b;
	}
	
	// multiply two numbers
	public float multiply(float a,float b){
		return a*b;
	}
	
	// divide two numbers
	public float divide(float a,float b){
		return a/b;
	}
	
	// x^2 of two numbers
	public float square(int x){
		return x*x;
	}
	
	// x^3 of three numbers
	public float cube(int x){
		return x*x*x;
	}
	
	// n! of an integer
	public int nfactorial(int n){
		int factorial = 1;
		int first = 1, second = 1;
		if(n < 0){      //if n is negative, there is no factorial
			return -1;
		}
		
		if(n%1 != 0){ //if n is not an integer, this is unlikely to happen but still ...
			return -1;
		}
		if(n == 0 || n == 1){ //if n is 0 or 1, the factorial is 1
			return factorial;
		}
		for(int i=1;i<n;i++){
			factorial = first + second;
			first = second;
			second = factorial;
			
		}
		return factorial;
	}
	
	// binary search in an array
	int binarySearch(int[] a,int x){
		int n = a.length; // get number of elements in the array
		int lower, upper, middle; // variables for positions in the array
		lower = 0; upper = n-1; // initialize values of lower and upper points
		
		if(n == 0){      //if the length of an array is 0
			return -1;
		}
		if(x%1 != 0){  //if the passed number is not an integer, this is unlikely to happen
			return -1;
		}
		
		Arrays.sort(a); //in order to use binary search, we need to sort the array first
	   
		while(lower<=upper){
			middle = (lower+upper)/2;
			if(x>a[middle]) lower = middle + 1;
			else if(x<a[middle]) upper = middle - 1;
			else return middle;  //if the item is found, then return the index
		}
		return -1; //if the item x was not found, return -1
	}
	
}
