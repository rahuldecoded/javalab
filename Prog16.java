import java.util.Scanner;
class Prog16{
	public static void main(String[] args){
		System.out.println("Enter your age: ");
		int[] list = {1, 2, 3, 4, 5, 6, 7, 8};
		for(int i=0; i < list.length; i++)
		{
			if(list[i] % 2 == 0){
			continue;
			}
			System.out.println(list[i]);
		}
	}
}