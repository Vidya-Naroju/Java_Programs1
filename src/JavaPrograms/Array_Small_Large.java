package JavaPrograms;

import java.util.Arrays;

public class Array_Small_Large {

	public static void main(String[] args) {
				
		int num[]= {-90,2,4,65,7,-8,4,66};
		int large=num[0];
		int small=num[0];
		for(int i=1;i<num.length;i++) {
			
			if(num[i]>large){
				large=num[i];
			}else if(num[i]<small) {
				small=num[i];
			}}
		System.out.println("given array is: "+Arrays.toString(num));
			System.out.println("largest number is :" +large);
			System.out.println("smallest number is :" +small);
		}
		
	}


