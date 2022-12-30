import java.util.Scanner;

public class buzzfizz{
	public static void main (String args[]){
		float num;
		System.out.println("Informe seu numero: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextFloat();
		
		for (int j = 1; j <= num; j++){
		
			if (j % 3 == 0 && j % 5 == 0){
				System.out.println("FizzBuzz");
			}
			else if (j % 5 == 0){
				System.out.println("Buzz");
			}
			else if (j % 3 == 0){
				System.out.println("Fizz");
			}
			else {
				System.out.println(" " + j);
			}
		}
	}
}
