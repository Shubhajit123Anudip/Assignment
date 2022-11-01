/*write a java program to test 
 if an array contains a specific value*/
package Assginment;

public class Test {
	public static boolean contains(int[]arr,int item) {
		for (int n:arr) {//for loop
			if(item==n) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[]my_array= {134,345,343,212};//initialize the array
		System.out.println(contains(my_array,345));//call the specific value
		System.out.println(contains(my_array,321));
				

	}

}
