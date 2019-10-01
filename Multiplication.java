
import java.util.Scanner;
public class Multiplication {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		double number1;
		double number2;
		double Mul;
		System.out.print("Enter first integer: \n");
		number1=input.nextDouble();
		System.out.print("Enter second integer: \n");
		number2=input.nextDouble();
		Mul=number1*number2;
		System.out.print(Mul);

	}

}