import java.util.Scanner;
public class Division {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		double number1;
		double number2;
		double Div;
		System.out.print("Enter first integer: \n");
		number1=input.nextDouble();
		System.out.print("Enter second integer: \n");
		number2=input.nextDouble();
		Div=number1/number2;
		System.out.print(Div);

	}

}
