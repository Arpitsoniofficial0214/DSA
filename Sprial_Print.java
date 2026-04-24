package Monu_Bhaiya_DSA;

public class Sprial_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
		Sprial(arr);
	}
	
 public static void Sprial(int [][] arr) {
	 int minRow =0;
	 int maxRow = arr.length - 1;
	 int maxCol = arr[0].length - 1;
	 int minCol = 0;
	 
	 int total_element = arr.length * arr[0].length;
	 int count = 0;
	 
	 while(count < total_element) {
		 for(int i = minCol; i<= maxCol && count < total_element; i++) {
			 System.out.print(arr[minRow][i] + " ");
			 count ++;
		 }
		 minRow++;
		 
		 for(int i = minRow; i<= maxRow && count < total_element; i++) {
			 System.out.print(arr[i][maxCol] + " ");
			 count ++;
		 }
		 maxCol--;
		 
		 for(int i = maxCol; i >= minCol && count < total_element; i--) {
			 System.out.print(arr[maxRow][i] + " ");
			 count ++;
		 }
		 maxRow--;
		 
		 
		 for(int i = maxRow; i >= minRow && count < total_element; i--) {
			 System.out.print(arr[i][minCol] + " ");
			 count ++;
		 }
		 minCol++;
	 }
   }
 }
}
