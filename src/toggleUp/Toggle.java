package toggleUp;

public class Toggle {
	public static void main(String[] args) {
		Toggle t = new Toggle();
		System.out.println(t.toggleString("teSTing is a Setament"));
	}
	public String toggleString(String string) {
		return string.toUpperCase();
	}
}
