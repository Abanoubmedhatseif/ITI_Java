import mypack.* ;
import java.util.List;
import java.util.function.Function;

class myclass implements Equation {
		@Override
		public Double apply(List<Double> numbers){
			Double a = numbers.get(0);
			Double b = numbers.get(1);
			Double c = numbers.get(2);

			Double disc = ((b*b) - ( 4 * a * c ));
			System.out.println("discreminant" + disc);

			if ( disc > 0 ){
				Double result = ( -b + Math.sqrt(disc) ) / ( 2 * a); 
				Double result2 = ( -b - Math.sqrt(disc) ) / ( 2 * a);
				System.out.println("X = " + result + " or " + result2);
				return result;
			}
			else if ( disc == 0 ) {
				Double result = ( -b / ( 2 * a) );
				System.out.println("X = " + result); 
				return result;
			}
			else {
				System.out.println("Number under sqroot is less than zero");
				return 100.0;
			}
		} // end method implementation

}  // end my class


class main {
public static void main (String [] args){

	myclass c1 = new myclass();
	c1.apply(List.of(1.0, 2.0, 3.0));



} // end main
} // end main class 