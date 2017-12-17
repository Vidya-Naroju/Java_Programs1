/*Let's try to understand why 153 is an Armstrong number.
example: 153 and 371
153 = (1*1*1)+(5*5*5)+(3*3*3)  
where:  
(1*1*1)=1  
(5*5*5)=125  
(3*3*3)=27  
So:  
1+125+27=153  */

package JavaPrograms;

import java.util.Scanner;

public class Amstrong_Number {

	public static void main(String[] args) {
		int num,n;
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of num");
		num=s.nextInt();
		n=num;
		while(num!=0) {
			int a=num%10;
			num=num/10;
			 sum=(a*a*a)+sum;
		}if(sum==n) {
			System.out.println("The given number is amstrong ");
		}else
			System.out.println("the number you have entered is not amstrong");

	}

}
