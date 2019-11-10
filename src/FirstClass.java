import java.util.Scanner;

public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = a + 6;
		float aa = (float)4.6;
		Scanner inputVar = new Scanner(System.in);
		System.out.println("Entrer une valeur");
		int userInput = inputVar.nextInt();
		System.out.println(aa + b + userInput);
	}

}
