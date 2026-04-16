package Monu_Bhaiya_DSA;

public class Bubble_Sort {

	public static void main(String[] args) {
		int arr[] = {5,4,3,1,2};
		// TODO Auto-generated method stub
Sort(arr);
for(int i=0; i<arr.length; i++) {
	System.out.print(arr[i] + " ");
}
	}
	
	public static void Sort(int [] arr) {
		for(int turn = 1; turn < arr.length; turn++) {
			for(int i = 0; i<arr.length - turn; i++) {
			if(arr[i] > arr[i+1]) {  //decreasing ke liye bass arrow < krna h bass result 5,4,3,2,1 aa jyega
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1]= temp;
			}
		}
	}
}
}
