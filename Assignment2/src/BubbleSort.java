
public class BubbleSort {

	public static void main(String[] args) {
		int []arr = {9,1,8,2,7,3,6,4,5};//unsorted array
		
		bubbleSort(arr);//method for sorted array

	}

	private static void bubbleSort(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr.length- i - 1; j++) {
				if(arr[j] > arr[j+1]) {//compare value on index (j) with (j+1)
					int temp = arr[j];//swaping process - 3 lines
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int e : arr) {//printing arrays 
			System.out.print(e + " ");
		}
		
	}

}
