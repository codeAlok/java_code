// Q. Wap to enter any number and find out whether the number is palindrome or not

import java.util.Scanner;

public class Palindrome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		
		int num = sc.nextInt();
		int sum=0,rem,x;
		x = num;
		
		while(num > 0){
			rem = num % 10;
			sum = sum * 10 + rem;
			num = num/10;
		}
		
		if(x == sum)
			System.out.println("The number is palindrome");
		else
			System.out.println("The number is not palindrome");
		
	}
}