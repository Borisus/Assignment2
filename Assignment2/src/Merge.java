
public class Merge {

	public static void main(String[] args) {
		int []arr = {3,7,8,5,4,2,6,1};

		mergeSort(arr);//call method mergeSort - argument arr
		
		for(int e : arr) {//printing the array
			System.out.println(e);
		}

	}

	private static void mergeSort(int[] arr) {
		int len = arr.length;//length of arraz
		
		if(len < 2) return;//recursion
		
		int mid = len/2;//divide an array / 2
		
		int []arrLeft = new int[mid];//declaration of array left
		int []arrRight = new int[len - mid];//right
		
		for(int i = 0; i < mid; i++) {
			arrLeft[i] = arr[i]; //to fill left array
		}
		for(int i = mid; i < len; i++) {
			arrRight[i-mid] = arr[i]; //to fill right array
		}
		
		mergeSort(arrLeft);//recursion
		mergeSort(arrRight);//recursion
		merge(arr, arrLeft, arrRight);//call method 
			
		}
	

	private static void merge(int[] arr, int[] arrLeft, int[] arrRight) {//merge sort
		int leftSize = arrLeft.length;//size of left array
		int rightSize = arrRight.length;//size of right array
		int l = 0;
		int r = 0;
		int k = 0;
		
		while(l < leftSize && r < rightSize) {
			if(arrLeft[l] <= arrRight[r]) {
				arr[k] = arrLeft[l];
				l++;
			}
			else {
				arr[k] = arrRight[r];
				r++;
			}
			k++;
				
		}
		while(l < leftSize) {
			arr[k] = arrLeft[l];
			l++;
			k++;
		}
		while(r < rightSize) {
			arr[k] = arrRight[r];
			r++;
			k++;
		}
		
	}

}
