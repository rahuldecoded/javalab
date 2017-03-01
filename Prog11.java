import java.util.Scanner;
class Prog11{
	public static void main(String[] args){
		System.out.println("Enter your age: ");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		if(age >= 18){
			System.out.println("Wow! You can vote.");
			}
		else{
			System.out.println("Sorry! You are not elligible for voting");
		}
	}
}