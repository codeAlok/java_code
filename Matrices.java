import java.util.Scanner;

public class Matrices{
	public static void main(String[] args){
		int[][] number1 = new int[2][2];
		int[][] number2 = new int[2][2];
		int[][] sum = new int[2][2];

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first matrices");

		for(int i=0; i<2; i++){
			for(int j=0; j<2; j++){
				number1[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter second matrices");
		for(int i=0; i<2; i++){
			for(int j=0; j<2; j++){
				number2[i][j] = sc.nextInt();
			}
		}
		
		// calcuting sum of matrice1 and matrices2
		for(int i=0; i<2; i++){
			for(int j=0; j<2; j++){
				sum[i][j] = number1[i][j] + number2[i][j];
			}
		}

		System.out.println("Printing the sum of matrices");
		for(int i=0; i<2; i++){
			System.out.println(" ");
			for(int j=0; j<2; j++){
				System.out.print(sum[i][j] + " ");
				//System.out.println(" ");
			}
		}
	}

}