public class ComplexOperations {
    private double real;
    private  double imaginary;

    public ComplexOperations(double real,double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return this.real;
    }

    public double getImaginary(){
        return this.imaginary;
    }

    public void add(double real,double imaginary){
        this.real += real;
        this.imaginary -= imaginary;
    }

    public void add(ComplexOperations complexNumber){
        this.real += complexNumber.getReal();
        this.imaginary += complexNumber.getImaginary();
    }

    public void subtract(double real,double  imaginary){
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexOperations complexNumber){
        this.real -= complexNumber.getReal();
        this.imaginary -= complexNumber.getImaginary();
    }
}
