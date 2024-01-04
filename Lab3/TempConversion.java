import java.util.function.Function;

class ConverterClass implements Function<Double, Double> {
    public Double apply(Double c) {
        return (c * 9 / 5) + 32;
    }
} // end converter class


class TempConversion {
    public static void main(String[] args) {
        ConverterClass converter = new ConverterClass();
        Double celsius = 150.0;
        Double fahrenheit = converter.apply(celsius);
        System.out.println("Fahrenheit temperature: " + fahrenheit);
    } // end main
} // end TempConversion class


