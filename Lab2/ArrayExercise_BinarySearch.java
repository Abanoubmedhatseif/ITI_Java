import java.util.Arrays;

class ArrayExercise_BinarySearch{

public static void main (String [] args){
	
	int size = 1000;
	int [] array = new int[size];

	long startTime = System.currentTimeMillis();

	for (int i =0 ; i<size ; i++){
		int temp = (int)(Math.random()*100);
		array [i]=temp;
	}	
	
	Arrays.sort(array);

	int result = binarySearch(array,size,150);	
	if (result != -1){
		System.out.println("Search result found :" + result);
	}
	else {
		System.out.println("Not found in the array");
	}
	
	long exitTime = System.currentTimeMillis();
	long timeInterval = exitTime-startTime ;
	System.out.println("timeInterval : " + timeInterval + "mSecs");
}




public static int findMax (int [] arr,int size){
	int max=0;
	for (int i=0 ; i<size ; i++){
		if (arr[i] > max){
			max = arr[i];
		}
	}
	return max;
}

public static int findMin (int [] arr , int size){
	int min=Integer.MAX_VALUE;
	for (int i=0 ; i<size ; i++){
		if (arr[i] < min){
			min = arr[i];
		}
	}
	return min;
}

public static int binarySearch(int[] arr, int size, int target) {
        int left = 0;
        int right = size - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else{
                right = mid - 1;
            }
        }
return -1;
}



}