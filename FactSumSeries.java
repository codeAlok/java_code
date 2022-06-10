import java.util.Scanner;

// Q. Wap to find out the sum of the following series
// sum = 1!/1 + 2!/2 + 3!/3 + ..... + n!/n

public class FactSumSeries{
	static int factorial(int n){
		int fact =1;
		for(int i=1; i<=n; i++){
			fact = fact * i;
		}
		return fact;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int range, sum=0;

		// taking range input
		System.out.println("Enter the range for factorial ");
		range = sc.nextInt();
		
		for(int i=1; i<=range; i++){
			sum = sum + factorial(i)/i;
		}

		System.out.println("The sum of factorial range " + sum);
	}
}