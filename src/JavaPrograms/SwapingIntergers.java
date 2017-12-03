package JavaPrograms;

//using multi thread print even and odd numbers 

public class SwapingIntergers {

	public static void main(String[] args) {
		int x = 2;
		int y = 10;

		// swapping integer using thrid value z
		int z = x;
		x = y;
		y = z;
		System.out.println("x value :" + x + "y value is : " + y); //now x=1o;y=2

		// using '+' and '-' operator
		x = x + y;	 // 2+10=12
		y = x - y;	 // 12-2=10
		x = x - y;	 // 12-10=
		System.out.println("x value :" + x +"        "+ "y value is : " + y);//now x=2;y=10

		//using '*'  and ' /'  operators
		x=x*y;	//20
		y=x/y;	//2
		x=x/y;	//10
		System.out.println("x value :" + x +"        "+ "y value is : " + y); // now x=10; y=2
		
		//using  ^
		x=x^y; //  1000
		y=x^y; //0010
		x=x^y;//1010
		
		System.out.println("x value :" + x +"        "+ "y value is : " + y);
		
		
		
	}

}
