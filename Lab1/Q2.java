class Q2 {
    public static void main(String[] args) {
       int number = Integer.parseInt(args[0]);
	if (number > 0 ){
		System.out.println("Positive");
	}
	else if ( number < 0 ) {
		System.out.println("Negative");
	}
	else {
		System.out.println("Zero");
	}
    }
}
