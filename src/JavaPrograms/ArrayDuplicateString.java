package JavaPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

import Javarpograms.Integer;

import java.util.Random;
import java.util.Set;


public class ArrayDuplicateString {

	//with Time Complexity = O(nxn)
public void Normal_logic1() {
	String name[]= {"java","phython","java","c#","phython",".net"};
	for(int i=0;i<name.length;i++) {
		for(int j=i+1;j<name.length;j++) {
			if(name[i].equals(name[j])) {
				System.out.println("Duplicate value is ::"+name[i]+"::its index number is::"+j);
						}
		}
	}
}
// with Time Complexity = O(n)
//Hashset stores only unique value not duplicate
//it will add only unique value if value is not added then it gives false it means its a duplicate
public void Hashset_logic2() {
	String names[]= {"java","phython","java","c#","phython",".net"};
	Set<String> store=new HashSet<String>();
	for(String name : names) {
		if (store.add(name)==false) {
			System.out.println( "duplicate is"+name);
			
		}
	}
	
}
//with Time Complexity = O(2n)
//if the count is more than 1 then is having duplicate
public void Hashmap_logic3() {
	String names[]= {"java","phython","java","c#","phython",".net"};
	
	Map<String, Integer> storemap=new HashMap<String, Integer>();
	for(String name : names) {
		Integer count=storemap.get(name);
		if(count==null) {
			storemap.put(name, 1);
		}else {
			storemap.put(name,++count);
		}
		//get the value from this hashmap
		Set<Entry<String, Integer>> entryset= storemap.entrySet();
		for(Entry<String, Integer> entry : entryset) {
			
			if (entry.getValue()>1) {
				String value=entry.getKey();
								
			System.out.println("Duplicate value is :"+ value);
	}}
	}
}
	public static void main(String[] args) {
	ArrayDuplicateString a=new ArrayDuplicateString();
	a.Normal_logic1();
	System.out.println("************************************");
	a.Hashset_logic2();
	System.out.println("************************************");
	a.Hashmap_logic3();
	}

}
