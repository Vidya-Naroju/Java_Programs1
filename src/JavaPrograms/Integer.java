package JavaPrograms;

public class Integer {

	public static void main(String[] args) {
	int a=1234;
	int num,dev;
	 int   rev=0;
	do {
		
		num= a % 10;
       rev = (rev * 10) + num;
         dev= a / 10;
         System.out.println(rev);
	}while(dev!=0);
	//System.out.println(rev);

	}

}
