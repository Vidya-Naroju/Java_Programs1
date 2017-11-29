package JavaPrograms;

public class ArrayDuplicateInteger {

	public static <String> void main(String[] args) {
		int i[]= {1,2,2,3,4,5};
		for(int j=0;j<i.length;j++) {
		for(int k=j+1; k<i.length; k++) {
			
			if(i[j]==i[k]){
				System.out.println("duplicate is :"+i[j]);
			}
			else {
				System.out.println("try again");
			}
		}
		}
	}

}
