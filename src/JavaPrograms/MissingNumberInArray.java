package JavaPrograms;

public class MissingNumberInArray {

	public static void main(String[] args) {
	int a[]= {1,3,4,5,6};
	int sum=0;
	int sum1=0;
	for(int i=0;i<a.length;i++) {
		sum=sum+a[i];
			
	}System.out.println(sum);
	
	for(int j=1;j<=6;j++) {
		sum1=sum1+j;
			}
	System.out.println(sum1);
	System.out.println("the missing number is :"+(sum1-sum));
	}

}
