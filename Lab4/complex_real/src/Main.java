class Main {
    public static void main(String[] args) {
        ComplexNumber<Integer> complex1 = new ComplexNumber<>(2, 3);
        ComplexNumber<Integer> complex2 = new ComplexNumber<>(1, 2);

        System.out.println("Complex 1: " + complex1);
        System.out.println("Complex 2: " + complex2);

        ComplexNumber<Integer> sum = complex1.add(complex2);
        System.out.println("Sum: " + sum);

        ComplexNumber<Integer> difference = complex1.subtract(complex2);
        System.out.println("Difference: " + difference);

        ComplexNumber<Integer> MultiplicationResult = complex1.multiply(complex2);
        System.out.println("Product: " + MultiplicationResult);
    }
}