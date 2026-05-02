package String;

public class Print_All_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "nitin";
PrintSubString(s); 
	}
public static void PrintSubString(String str) {
	for(int i=0; i<str.length(); i++) {
		for(int j=i+1; j<= str.length(); j++) {
			System.out.println(str.substring(i,j));
		}
	}
}
}
