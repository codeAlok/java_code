// Q. Wap to show the sum of first 10 numbers of fibonacci series :-

public class FibonacciS{
	public static void main(String[] args){
		int first=0, second=1, sum =0;
		int temp;
		
		System.out.print(first + " " + second);
		for(int i=1; i<=10; i++){
			temp = first + second;
			sum = sum + temp;
			first = temp - first;
			second = temp;	
			System.out.print(" " + temp);
		}
		System.out.println("\nSum of fibonacci series is " + sum);
	}
}




























// Finally i havae done it through myself(new logic ) . That's why try to solve the problem
// you are much capable of doing/ solving any question
// Best of Luck..................
// I have done this ............