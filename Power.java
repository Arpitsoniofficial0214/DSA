package Monu_Bhaiya_DSA_Recursion;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 5;
int x = 4;
System.out.println(pow(x,n));
	}
	public static int pow (int x, int n) {
		if(n == 0) {
			return  1;
		}
		int ans = pow(x, n-1);
		return  ans* x;
	}
}
