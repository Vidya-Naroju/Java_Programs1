package JavaPrograms.JavaPrograms;

import org.testng.annotations.Test;

public class Swapping_Strings {

	String x="apple";
	String y="mango";
	
@Test(priority=1)
public void  method1() {
	String z=x;
	x=y;
	y=z;
	System.out.println(x +"  and  "+y);
}//now strg1 is mango and str2 is apple

@Test(priority=2)
public void  method2() {
	//appending two strings
	x = x+y;
//	storing x value in y initially
	y=x.substring(0, x.length()-y.length());
	//storing y value in x
	x=x.substring(y.length());
	System.out.println(x +"  and  "+y);
	
	
}
}