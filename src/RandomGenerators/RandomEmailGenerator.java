package RandomGenerators;

import java.util.Random;

public class RandomEmailGenerator {

	public static void main(String[] args) {
		 Random rad = new Random();
		 System.out.println("username"+rad.nextInt(20)+"@gmail.com");
		 
		 //or using forloop 
	        for (int j=1; j<=100; j++ )
	        {
	        System.out.print("usename"+rad.nextInt(20)+"@gmail.com");
	        System.out.println();
	        }
	        
	}
	

}
