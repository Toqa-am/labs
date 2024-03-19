package packs;
public abstract interface complexInterface<T>{

    T getReal();
    T getImaginary();
    complexInterface<T> add(complexInterface<T> z);
    complexInterface<T> subtract(complexInterface<T> z);
    complexInterface<T> product(complexInterface<T> z);
    complexInterface<T> div(complexInterface<T> z);
}






