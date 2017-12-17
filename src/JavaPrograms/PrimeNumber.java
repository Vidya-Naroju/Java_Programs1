package JavaPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
	int num;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the value of num");
	num=s.nextInt();
	if((num%2)!=0) {
		System.out.println("the given number is prime");
	}else
	System.out.println("the given number is not prime");

	}

}
