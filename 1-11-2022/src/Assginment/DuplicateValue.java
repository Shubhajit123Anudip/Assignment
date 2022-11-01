/*Write a java program to find the duplicate values of an array of integer values*/
package Assginment;

public class DuplicateValue {

	public static void main(String[] args) {
		int []arr=new int[] {1,2,3,4,5,5};
		System.out.println("Duplicate value is given array");
 for(int i=0;i<arr.length;i++) {//1st for each loop for read value
	 for(int j=i+1;j<arr.length;j++) {//2nd for each for compare value
if(arr[i]==arr[j])//if condition
	System.out.println(arr[j]);
	 }
	}
	}
}
