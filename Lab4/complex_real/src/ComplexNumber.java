class ComplexNumber<T extends Number> {
    private T real;
    private T imaginary;

    public ComplexNumber(T real, T imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }


    public T getReal() {
        return real;
    }

    public T getImaginary() {
        return imaginary;
    }

    private T add(T a, T b) {
        return (T) (Number) (a.doubleValue() + b.doubleValue());
    }

    private T subtract(T a, T b) {
        return (T) (Number) (a.doubleValue() - b.doubleValue());
    }

    private T multiply(T a, T b) {
        return (T) (Number) (a.doubleValue() * b.doubleValue());
    }


    public ComplexNumber<T> add(ComplexNumber<T> other) {
        T newReal = add(this.real, other.getReal());
        T newImaginary = add(this.imaginary, other.getImaginary());
        return new ComplexNumber<>(newReal, newImaginary);
    }

    public ComplexNumber<T> subtract(ComplexNumber<T> other) {
        T newReal = subtract(real, other.getReal());
        T newImaginary = subtract(imaginary, other.getImaginary());
        return new ComplexNumber<>(newReal, newImaginary);
    }

    public ComplexNumber<T> multiply(ComplexNumber<T> other) {
        T newReal = subtract(multiply(real, other.getReal()), multiply(imaginary, other.getImaginary()));
        T newImaginary = add(multiply(real, other.getImaginary()), multiply(imaginary, other.getReal()));
        return new ComplexNumber<>(newReal, newImaginary);
    }



    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }

}
