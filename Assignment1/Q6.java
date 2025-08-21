package Assignment1;
import java.util.Scanner;
public class Q6 {
	    public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	        double P = sc.nextDouble(), R = sc.nextDouble(), T = sc.nextDouble();
	        System.out.println("SI = " + (P*R*T/100));
	        sc.close();
	    }	
}

