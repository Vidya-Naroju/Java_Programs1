package JavaPrograms;

public class ReverseInteger {

	public static void main(String[] args) {
		int a=123456,b=23456;
		int rev=0;
	while (a!=0) {
		 rev=(rev*10)+(a%10);
		 a=a/10;
		 	
	}System.out.println(rev);
	
	//second method using string buffer
	StringBuffer s=new StringBuffer(String.valueOf(b)).reverse();
	System.out.println(s);
	//System.out.println(new StringBuffer(String.valueOf(b)).reverse());
	}

}
