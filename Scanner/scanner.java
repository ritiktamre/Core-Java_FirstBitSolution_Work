package Scanner;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number");
		int a=sc.nextInt();
		System.out.println("Enter the Second number");
		int b = sc.nextInt();
		
		int c=a+b;
		System.out.println("Add :"+c);
		
		
		System.out.println("Enter the First Number:");
		float e = sc.nextFloat();
		
		System.out.println("Enter the Second Number:");
		float d = sc.nextFloat();
		
		float f =e+d;
		System.out.println("Add:"+f);
		
		float g=sc.nextFloat();
		float h =sc.nextFloat();
		float i=g-h;
		System.out.println("Sub:"+i);
	}

}
