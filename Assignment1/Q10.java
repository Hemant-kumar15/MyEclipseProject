package Assignment1;
import java.util.Scanner;

	

	public class Q10 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter distance in kilometers: ");
	        double km = sc.nextDouble();

	        double miles = km * 0.621371;

	        System.out.println(km + " km = " + miles + " miles");

	        sc.close();
	    }
	}

