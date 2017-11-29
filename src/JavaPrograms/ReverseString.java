package JavaPrograms;

import javax.sound.midi.Receiver;

public class ReverseString {
	String rev = "abcde fghi";
	static String reverse2 = "";
 
	public StringBuffer Reverse() {

		// reverse method will work only for string buffer
		StringBuffer sb = new StringBuffer(rev);
		StringBuffer re=sb.reverse();
		//System.out.println(re);
		return re;

	}
	
	
	public static void main(String args[]) {
ReverseString q=new ReverseString();
System.out.println(q.Reverse());
		
		String string = "i am a Hero";
		for (int i = string.length() - 1; i >= 0; i--) {
			reverse2 = reverse2 + string.charAt(i);
		}System.out.println(reverse2);

	}
}
