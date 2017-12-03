package JavaPrograms.JavaPrograms;

import org.testng.annotations.Test;

public class SwapingIntergersTest {
	int x = 2;
	int y = 10;
  @Test(priority=1)
	public void swapping_integer_using_thrid_value_z() {
	int z = x;
	x = y;
	y = z;
	System.out.println("x value :" + x + "y value is : " + y); //now x=1o;y=2
  }
  @Test(priority=2)
public void using_operator1(){
	x = x + y;	 // 2+10=12
	y = x - y;	 // 12-2=10
	x = x - y;	 // 12-10=
	System.out.println("x value :" + x +"        "+ "y value is : " + y);//now x=2;y=10
}
  @Test(priority=3)
	public void using_operators2() {
	x=x*y;	//20
	y=x/y;	//2
	x=x/y;	//10
	System.out.println("x value :" + x +"        "+ "y value is : " + y); // now x=10; y=2
	}
  @Test(priority=4)
	public void using_XOR() {
	x=x^y; //  1000
	y=x^y; //0010
	x=x^y;//1010
	System.out.println("x value :" + x +"        "+ "y value is : " + y);
	
	}
	

}
