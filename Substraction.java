import java.util.Scanner;
public class Substraction {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int number1;
		int number2;
		int Sub;
		System.out.print("Enter first integer: \n");
		number1=input.nextInt();
		System.out.print("Enter second integer: \n");
		number2=input.nextInt();
		Sub=number1-number2;
		System.out.print(Sub);

	}

}