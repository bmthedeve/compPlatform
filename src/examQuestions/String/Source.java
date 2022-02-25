package examQuestions.String;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Punctuation{
    // Write your code here..
	public int countPunctuation(String str){
		int count = 0;
//		if(str.matches("\\?")) count++;
//		if(str.matches("\\.")) count++;
//		if(str.matches("\\,")) count++;
//		if(str.matches("!")) count++;
//		if(str.matches(";")) count++;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='.'||str.charAt(i)=='?'||str.charAt(i)=='!'||str.charAt(i)==','||str.charAt(i)==';') count++;
		}
		return count;
	}
}

public class Source {
	public static void main(String args[] ) throws Exception {
		String stri = ".?!";
		Punctuation p = new Punctuation();
		System.out.println(p.countPunctuation(stri));
	}
}