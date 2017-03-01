import java.util.Scanner;
class Prog14{
	public static void main(String[] args){
		System.out.println("Enter the month you born I'll tell in which season you born");
		Scanner scan = new Scanner(System.in);
		String month = scan.next();
		month = month.toLowerCase();
		switch(month){
		case "january":
		case "february":
		case "march":
			System.out.println("Autumn");
			break;
		case "april":
		case "may":
		case "june":
			System.out.println("Summer");
			break;
		case "july":
		case "august":
		case "september":
			System.out.println("Spring");
			break;
		case "october":
		case "november":
		case "december":
			System.out.println("Winter");
			break;
		default:
			System.out.println("Enter vaild month name.");
		}
	}
}