package others;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DemoDraft {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * int a = 10; int b = 20; int c = 30;
		 * 
		 * if(a>b) { if(a>c) { System.out.println("a is greater"); } else {
		 * System.out.println("c is greater"); } } else {
		 * System.out.println("b is greater"); }
		 */
		/*
		 * try { try { System.out.println("Nested Try Block"); int b = 25/0; } catch
		 * (ArithmeticException e) { System.out.println(e); } try { int myArray[] = new
		 * int[4]; myArray[4]=30; } catch (ArrayIndexOutOfBoundsException e) {
		 * System.out.println(e); } System.out.println("In Main try block"); } catch
		 * (Exception e) { System.out.println("Main Try Exc handled"); }
		 * System.out.println("Executed");
		 */
		/*
		 * HashSet<String> set = new HashSet<String>(); set.add(null); set.add("One");
		 * for(String s:set) System.out.println(s);
		 */
		String i = "";
		Map myMap = new TreeMap();
		for(int x = 0; x<3; x++) {
			i+=x;
			String j="K";
			myMap.put(i, j);
		}
		System.out.println(myMap.size());
	}
}
