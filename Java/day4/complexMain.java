import packs.ComplexNumber;

public class complexMain {
        public static void main(String[] args) {
            ComplexNumber complex1 = new ComplexNumber(3, 4);
            ComplexNumber complex2 = new ComplexNumber(1, 2);
    
            ComplexNumber sum = complex1.add(complex2);
            System.out.println("Sum: " + sum.getReal() + " + " + sum.getImaginary() + "i");
    
            ComplexNumber difference = complex1.subtract(complex2);
            System.out.println("Difference: " + difference.getReal() + " + " + difference.getImaginary() + "i");
    
            ComplexNumber product = complex1.product(complex2);
            System.out.println("Product: " + product.getReal() + " + " + product.getImaginary() + "i");
    
            ComplexNumber quotient = complex1.div(complex2);
            System.out.println("Quotient: " + quotient.getReal() + " + " + quotient.getImaginary() + "i");
        }
    }

