class ArrayExercise {

public static void main (String [] args){
	
	int size = 1000;
	int [] array = new int[size];

	long startTime = System.currentTimeMillis();

	for (int i =0 ; i<size ; i++){
		int temp = (int)(Math.random()*100);
		array [i]=temp;
	}	
	
	int maxMember = findMax(array,size);
	int minMember = findMin(array,size);
	System.out.println("Max value is " + maxMember);
	System.out.println("Min value is " + minMember);

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




}