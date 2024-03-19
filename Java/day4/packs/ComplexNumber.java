package packs;

public class ComplexNumber implements complexInterface<Integer> {
    private Integer real;
    private Integer imaginary;

    public ComplexNumber(Integer real, Integer imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }


    @Override
    public Integer getReal() {
        return real;
    }

    @Override
    public Integer getImaginary() {
        return imaginary;
    }

    @Override
    public ComplexNumber add(complexInterface<Integer> z) {
        Integer newReal =this.real+z.getReal();
        Integer newImaginary = this.imaginary +z.getImaginary();
        return new ComplexNumber(newReal, newImaginary);
    }

    @Override
    public ComplexNumber subtract(complexInterface<Integer> z) {
        Integer newReal =  this.real - z.getReal();
        Integer newImaginary = this.imaginary- z.getImaginary();
        return new ComplexNumber(newReal, newImaginary);
    }

    @Override
    public ComplexNumber product(complexInterface<Integer> z) {
    
        Integer newReal = (this.real * z.getReal())- (this.imaginary * z.getImaginary());
        Integer newImaginary = (this.real* z.getImaginary())+( this.imaginary * z.getReal());
        return new ComplexNumber(newReal, newImaginary);
    }

    @Override
    public ComplexNumber div(complexInterface<Integer> z) {
        Integer divisor = z.getReal() * z.getReal()+ z.getImaginary()* z.getImaginary();
        Integer newReal = this.real* z.getReal()+ this.imaginary* z.getImaginary() / divisor;
        Integer newImaginary = this.imaginary* z.getReal()- this.real* z.getImaginary() / divisor;
        return new ComplexNumber(newReal, newImaginary);
    }
}
