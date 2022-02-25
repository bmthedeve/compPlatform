package practiceQuestion.string1;

public class EmailOperation {
	public static int emailVerify(Email e){
		if(e.header.from.matches("\\-?[A-Z]?[a-z]*@[a-z]+\\.[a-z]+") && e.header.to.matches("\\-?[A-Z]?[a-z]*@[a-z]+\\.[a-z]+")) return 2;
		else if(e.header.from.matches("\\-?[A-Z]?[a-z]*@[a-z]+\\.[a-z]+") || e.header.to.matches("\\-?[A-Z]?[a-z]*@[a-z]+\\.[a-z]+")) return 1;
		else return 0;
		
		
	}
	// public String bodyEncryption(Email e){
		
	// }

	public static String greetingMessage(Email e){
		String arr[] = e.header.from.split("@");
		String name = arr[0];
		return e.greetings +" "+ name;
	}
}
