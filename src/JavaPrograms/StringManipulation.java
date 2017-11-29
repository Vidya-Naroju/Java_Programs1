package JavaPrograms;

public class StringManipulation {

	public static void main(String[] args) {
		String s = "I would like to talk to you please i request you";
		String t = "I would Like to Talk to You Please I request you";

		System.out.println("string length:" + s.length());
		System.out.println("*********************************************");
		System.out.println("character at the index : " + s.charAt(2));
		System.out.println("*********************************************");
		System.out.println(s.concat(", I am vidya"));// adds the value
		System.out.println("*********************************************");
		System.out.println("first occurance of k : " + s.indexOf("k"));
		System.out.println("*********************************************");
		System.out.println("second occurance of charecter  : " + s.indexOf("u", s.indexOf('u') + 1));
		System.out.println("*********************************************");
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'u') {
				System.out
						.println(" occurance of charecter  : " + "'" + (s.charAt(i) + "'" + " at index number ::" + i));
			}
		}
		System.out.println("**************************************");
		System.out.println("index number of string 'like' is :" + s.indexOf("like"));
		System.out.println("**************************************");
		System.out.println("is String 's' and 't' are equal :" + s.equals(t));
		System.out.println("**************************************");
		System.out.println("is String 's' and 't' are equal without bothering case-sensitive :" + s.equalsIgnoreCase(t));
		System.out.println("**************************************");
		
		String name="   health is wealth  ";
		String name1="   health_is_wealth  ";
		String date="29/06/1989";
		System.out.println(name.trim());
		System.out.println(name1.replace("_",  ""));//it replaces space with no space
		System.out.println(date.replace("/", "-"));
		
		//split
		String split[]=name1.split("_");
	
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		
		int a=100,b=200;
		System.out.println("concat : "+a+b);
		System.out.println(a+b);
		
		
		
		
	}
}
