import java.util.function.Function;

class TempConversionLambda {
public static void main ( String args [] ){

Function< Double , Double > converter = c -> (c * 9/5 + 32) ;

Double result = converter.apply(120.0);
System.out.println(result);


} // end main 
} // end class