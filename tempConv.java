// Temperature converter
import java.util.Scanner;

public class tempConv{
	
		public static void main(String[] args) {
			double celsius, fahrenheit;
			Scanner myTemp = new Scanner(System.in);
			System.out.println("What unit are you using ? \n 1-Celsius \n 2-Fahrenheit");
			int unit = myTemp.nextInt();
			
			switch(unit) {
			case 1:
				System.out.println("Enter your temperature in Celsius: ");
				celsius = myTemp.nextDouble();
				fahrenheit = ((9*celsius)/5+32);
				System.out.println("The Fahrenheit temperature is: " + fahrenheit);
				break;
			case 2:
				System.out.println("Enter your temperature in Fahrenheit: ");
				fahrenheit = myTemp.nextDouble();
				celsius = (fahrenheit-32)*5/9;
				System.out.println("The Celsius temperature is: "+ celsius);
				break;
			default:
				System.out.println("Please select a valid choice");
					
		}	
	}
}