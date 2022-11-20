public class QuickSort {

	public static void main(String[] args) {
		int []data = {3,1,2,4};
		
		quickSort(data,0,data.length - 1);//calling method quickSort with array, 0 index and end index

		for(int e : data) {//printing sorted array
			System.out.print(e + " ");
		}
	}

	private static void quickSort(int[] arr, int start, int end) {
		
		if(end <= start)//recursion
			return;//if condition is satisfy - recursion
		int pivot = partition(arr, start, end);// to int pivot is stored i(return i), calling method
		quickSort(arr, start, pivot - 1);//call method quickSort - first half
		quickSort(arr, pivot + 1, end);//call method quickSort - second half
	}
	private static int partition(int[] arr, int start, int end) {//pivot
		int pivot = arr[end];//initi. pivot with value of the end of array
		int i = start - 1;//for i
		
		for(int j = start; j < end;j++) {//travelling of array
			if(arr[j] <= pivot) {//condition
				i++;//shift the index i
				int temp = arr[i];//swapping
				arr[i] = arr[j];
				arr[j] = temp;	
			}
		}
		i++;//shift index i
		int temp = arr[i];//swapping
		arr[i] = arr[end];
		arr[end] = temp;
 		System.out.println(i);
		return i;//return a new pilot
	}

}
