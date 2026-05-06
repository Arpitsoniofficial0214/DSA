package String;

import java.util.Scanner;

public class String_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
 String s = sc.next();
	}
public static boolean Palindrome(String s) {
	int i = 0;
	int j = s.length() - 1;
	
	while(i < j) {
	if(s.charAt(i) != s.charAt(j)) {
		return false;
	}
	i++;
	j--;
	}
	return true;
}
}
