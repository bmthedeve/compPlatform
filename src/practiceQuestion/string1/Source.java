package practiceQuestion.string1;

public class Source {
	public static void main(String[] args) {
		Email e = new Email(new Header("bm@gmail.com", "mb@gmail.com"),"HOw r u","thank u");
		System.out.println(EmailOperation.emailVerify(e));
		System.out.println(EmailOperation.greetingMessage(e));
		
	}
}
