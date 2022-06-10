// Q. Wap to show the sum of following series :-

import java.util.Scanner;

public class SumSeries{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		int sum =0;
		
		for(int i=1; i<=10; i++){
			sum = sum + i*n;
		}
		System.out.println("The sum of Series is " + sum);
	}
}