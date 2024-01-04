class Palindorme {

public static void main (String args[]){

	int size = args[0].length();
	String mystring = args[0];
	mystring = mystring.toLowerCase();
	char[] value = mystring.toCharArray();
	int i;	
	int last = size-1;

	for (i=0 ; i<size/2;){
		if (value[i] == value[last]){
			i++ ;
			last--;
		}	
		else{break;}
	}

	if (value[i] == value[last]){
		System.out.println("Palindrome");
	}
	else 
	System.out.println("Not");
}
}