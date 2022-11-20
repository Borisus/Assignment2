import java.util.Scanner;

public class Duplicate {
		
	public static void findDuplicate(int []arr) {
		boolean control = false;
		for(int i = 0; i < arr.length; i++) {//traveling of an array - 
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {//condition for compare 
					System.out.println("Found duplicate number "+ arr[i] +" from given array");//printing
					control = true;
				}
			}
		}
		if(control == false) {
			System.out.println("There is no duplicated number in given array");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a size of an array");	
		int n = scan.nextInt();//size of array
		int []array = new int[n];//initialize array for given size
		
		for(int i = 0; i < array.length;i++) {//added some valid values to array
			System.out.println("Enter a value for position " + (i + 1));
			array[i] = scan.nextInt();
		}
		findDuplicate(array);//calling method findDuplicate


	}

}
