import java.util.Scanner;

public class Showroom{
	public static void main(String[] args){
		int Go_check, Mill_cloth, Handloom, totalcost; 
		double Disc_mill, Disc_handloom, NetAmount;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\t******* Alok Shop *********");
		System.out.println("Tell price of Millcloth you purchased");
		Mill_cloth = sc.nextInt();

		
		System.out.println("Tell price of Handloom items you purchased");					
		Handloom = sc.nextInt();
		
		totalcost = (Mill_cloth + Handloom);
		System.out.println("You have purchased for " + totalcost +" amount ");

		if(totalcost >=0 && totalcost <= 100){
			Go_check = 1;
		}	

		else if(totalcost >=101 && totalcost <= 200){
			Go_check = 2;
		}

		else if(totalcost >=201 && totalcost <= 300){
			Go_check = 3;
		}
		else{
			Go_check = 4;	
		}

		switch(Go_check){
			case 1:
				Disc_handloom =(Handloom* 5.0/100.0);
				NetAmount = Mill_cloth + (Handloom - Disc_handloom);
				System.out.println("You get 0% discount on Millcloth and 5.0% on Handloom");
				break;
			case 2:
				Disc_mill = Mill_cloth * 5.0/100.0;
				Disc_handloom = Handloom * 7.5/100.0;
				NetAmount = (Mill_cloth - Disc_mill) + (Handloom - Disc_handloom);
				System.out.println("You get 5.0% discount on Millcloth and 7.5% on Handloom");
				break;
			case 3:
				Disc_mill = Mill_cloth * 7.5/100.0;
				Disc_handloom = Handloom * 10.0/100.0;
				NetAmount = (Mill_cloth - Disc_mill) + (Handloom - Disc_mill);
				System.out.println("You get 7.5% discount on Millcloth and 10.0% on Handloom");
				break;
			case 4:
				Disc_mill = Mill_cloth * 10.0/100.0;
				Disc_handloom = Handloom * 15.0/100.0;
				NetAmount = (Mill_cloth - Disc_mill) + (Handloom - Disc_handloom);
				System.out.println("You get 10.0% discount on Millcloth and 15.0% on Handloom");
				break;
			default:
				NetAmount = Mill_cloth + Handloom;
				System.out.println("You get 0% discount on Millcloth and 0% on Handloom");
				break;	
		}
		System.out.println("Net amount " + NetAmount +" to be paid after discount");
		System.out.println("\t ***** Thanks for visiting our Shop *****");
					
	}

}