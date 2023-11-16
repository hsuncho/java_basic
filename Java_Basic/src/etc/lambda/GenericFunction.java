package etc.lambda;

@FunctionalInterface
public  interface GenericFunction<X,Y> {

    // extract Y from X
    Y apply(X x);

    // don't need to write how to extract
    // you only need to write 'action' that you will extract Y from X
}
