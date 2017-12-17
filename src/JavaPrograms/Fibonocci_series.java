 /*In case of fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21 etc.
 The first two numbers of fibonacci series are 0 and 1.*/
package JavaPrograms;

import java.util.Scanner;

public class Fibonocci_series {

	public static void main(String[] args) {
		int n;
		int a=0;
		int b=1,c,d;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of num");
		n=s.nextInt();
		System.out.println(a);
		System.out.println(b);
	for(int i=2;i<n;i++) {
	
	c=a+b;
	System.out.println(c);
	a=b;
	b=c;
	
		
		
	}

	}

}
