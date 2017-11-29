package JavaPrograms;

public class RemoveJunk_String {

	public static void main(String[] args) {
		String s="#$$%^ vidya $%^ sujan";
		//it will replace with space
		System.out.println(s.replaceAll("[a-zA-Z0-9]", ""));
		//it will remove the special characters when we use ^
		System.out.println(s.replaceAll("[^a-zA-Z0-9]", ""));
		System.out.println(s.replaceAll("[^a-zA-Z0-9]", " "));
	}

}
