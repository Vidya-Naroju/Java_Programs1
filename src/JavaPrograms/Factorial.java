package JavaPrograms;

import java.util.Scanner;

public class Factorial {
static int num,n;
private static int  fact=1,f=1;
	public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
/*	System.out.println("enter the num value");
	num=s.nextInt();
	
	while(num!=0) {
		fact=fact*num;
int sub=(num-1);
num=sub;
	}
	System.out.println(fact);*/
	
	// another method
	
	System.out.println("enter the vale of n");
	n=s.nextInt();
	for (int i=1;i<=n;i++) {
		f=f*i;
	}System.out.println("factorial of n is ::"+f);

	}

}
