package String;

public class CompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1 ="Kamal";
String s2 = "Komal";
System.out.println(compareTo(s1, s2));
	}
public static int compareTo(String s1, String s2) {
	if(s1 == s2) {
		return 0;
	}
	for(int i = 0; i<Math.min(s1.length(), s2.length()); i++) {
		return s1.charAt(i) - s2.charAt(i);
	}

return s1.length() - s2.length();
}
}
