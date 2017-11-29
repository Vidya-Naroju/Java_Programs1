/*printing 
1234
2341
3412
4123
*/

package JavaPrograms;

public class Numbers_pattern {

	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
		    for (int j = i; j < i + 4; j++) {
		        System.out.print((j % 4) + 1);
		    }
		    System.out.println();
		}

	}

}
