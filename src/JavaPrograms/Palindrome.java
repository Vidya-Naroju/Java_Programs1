package JavaPrograms;

import java.util.Scanner;

import sun.security.util.Length;

public class Palindrome {

	private static int rev=0;

	public static void main(String args[]) {
		System.out.println("enter the number");
		Scanner s=new Scanner(System.in) ;
		int num=s.nextInt();
	int	sum=num;
		
		while(num!=0) {
			int reminder=num%10;
			rev=rev*10+reminder;
			  num=num/10;			
			}
			System.out.println("palindrome  ::"+rev);
			if(rev==sum) {
				System.out.println(" The number you have entered is a palindrome");
			}else {
				System.out.println("the number you have entered is not a palindrome");
			}
			
			
		
		
	}
}
