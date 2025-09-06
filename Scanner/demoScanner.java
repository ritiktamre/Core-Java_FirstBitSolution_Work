package Scanner;

import java.util.Scanner;

public class demoScanner {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Int first Number:");
		int a = sc.nextInt();
		
		System.out.println("Enter the Int Second Number:");
		int b = sc.nextInt();
		
		int c = a+b;
		
		System.out.println("Sum Of Int Number:"+c);
		
		
		System.out.println("Enter the Float first Number:");
		float a1 = sc.nextFloat();
		
		System.out.println("Enter the Float Second Number:");
		float a2 = sc.nextFloat();
		
		float a3 = a1-a2;
		
		System.out.println("Sub Of Float Number:"+a3);
		
		System.out.println("Enter the First Double Number:");
		double b1 = sc.nextDouble();
		
		System.out.println("Enter the Second Double Number:");
		double b2 = sc.nextDouble();
		
		double b3 = b1*b2;
		
		System.out.println("Mul of Double Number:"+b3);
		
		System.out.println("Enter the First Int Number:");
		int c1 = sc.nextInt();
		
		System.out.println("Enter the Second double Number:");
		double c2 = sc.nextDouble();
		
		double c3 = c1/c2;
		
		System.out.println("Div the Int And Double Number:"+c3);
		
		System.out.println("All Number Are Sum Of Int ,double ,float:"+(c+a3+b3+c3));

	}

}
