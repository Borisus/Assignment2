import java.util.Scanner;

public class SubsetProgram {

    public static void main(String args[])
    {//is arr1 is subset of arr2??
    	int []arr1 = {10,20,30,40,50};
    	int []arr2 = {10,20,30,40,50};
    	
    	if(findSubset(arr1, arr2))
    		System.out.println("Arr1 is subset of arr2");
    	else
    		System.out.println("Arr1 is not subset of arr2");
    }

	private static boolean findSubset(int []arr1, int[]arr2) {
		int i;
		int j;
		for(i=0; i < arr1.length; i++) {
			for(j=0; j < arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					break;
				}

			}
			if(j == arr2.length)
				return false;
		}
		return true;
		
	}
	}
		
	



