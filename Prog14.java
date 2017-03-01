import java.util.Scanner;
class Prog15{
	public static void main(String[] args){
		System.out.println("Enter +, -, * or / to perform your operations.");
		Scanner scan = new Scanner(System.in);
		char operation = scan.next().charAt(0);
		int res, num1, num2;
		switch(operation){
		case '+':
			System.out.println("Cool! you wanna go for addition!");
			System.out.println("Enter First Number");
			num1 = scan.nextInt();
			System.out.println("Enter Second Number");
			num2 = scan.nextInt();
			res = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + res);
			break;
		
		case '-':
			System.out.println("Cool! you wanna go for substraction!");
			System.out.println("Enter First Number");
			num1 = scan.nextInt();
			System.out.println("Enter Second Number");
			num2 = scan.nextInt();
			res = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + res);
			break;
		
		case '*':
			System.out.println("Cool! you wanna go for multiplication!");
			System.out.println("Enter First Number");
			num1 = scan.nextInt();
			System.out.println("Enter Second Number");
			num2 = scan.nextInt();
			res = num1 * num2;
			System.out.println(num1 + " * " + num2 + " = " + res);
			break;
		case '/':
			System.out.println("Cool! you wanna go for division!");
			System.out.println("Enter First Number");
			num1 = scan.nextInt();
			System.out.println("Enter Second Number");
			num2 = scan.nextInt();
			res = num1 / num2;
			System.out.println(num1 + " + " + num2 + " = " + res);
			break;
		default:
			System.out.println("Enter vaild operation.");
		}
	}
}

