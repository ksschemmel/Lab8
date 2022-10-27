import java.util.Scanner;
public class Lab82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Month Number: ");
		int Month = scan.nextInt();
		System.out.println("Enter the Year: ");
		int Year = scan.nextInt();
		String Month_name ;
		int Number_of_days;
		
		switch(Month)
		{
		
		case 1:
			Month_name = ("January");
			Number_of_days = 31;
			System.out.println((Month_name)+ " has " + (Number_of_days));
			break;
		case 2:
			Month_name = ("February");
			Number_of_days = 28;
			{
				if((Year%4==0 && Year%100!=0) || (Year %400==0))
					System.out.println("February has 29 Days");
					else
						System.out.println("February has 28 Days");
				}
			break;
		case 3:
			Month_name = ("March");
			Number_of_days = 31;
			System.out.println((Month_name)+ " has " + (Number_of_days));
			break;
		case 4:
			Month_name = ("April");
			Number_of_days = 30;
			System.out.println((Month_name)+ " has " + (Number_of_days));
			break;
		case 5:
			Month_name = ("May");
			Number_of_days = 31;
			System.out.println((Month_name)+ " has " + (Number_of_days));
			break;
		case 6:
			Month_name = ("June");
			Number_of_days = 30;
			System.out.println((Month_name)+ " has " + (Number_of_days));
			break;
		case 7:
			Month_name = ("July");
			Number_of_days = 31;
			System.out.println((Month_name)+ " has " + (Number_of_days));
			break;
		case 8:
			Month_name = ("August");
			Number_of_days = 31;
			System.out.println((Month_name)+ " has " + (Number_of_days));
			break;
		case 9: 
			Month_name = ("September");
			Number_of_days = 30;
			System.out.println((Month_name)+ " has " + (Number_of_days));
			break;
		case 10:
			Month_name = ("October");
			Number_of_days = 31;
			System.out.println((Month_name)+ " has " + (Number_of_days));
			break;
		case 11:
			Month_name = ("November");
			Number_of_days = 30;
			System.out.println((Month_name)+ " has " + (Number_of_days));
			break;
		default:
			Month_name = ("December");
			Number_of_days = 31;
			System.out.println((Month_name) + " has " + (Number_of_days));
			
		}
	}
}

