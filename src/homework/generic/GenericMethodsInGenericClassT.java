package homework.generic;

public class GenericMethodsInGenericClassT<T> {

    public void genericMethodOneGenArg(T arg) {
        System.out.printf("I am an object of %s class", arg.getClass().getSimpleName());
    }

    public <U> String genericMethodTwoGenArgs(T x, U y ) {

       return  String.format("We are objects of %s class and %s class", x.getClass().getSimpleName(), y.getClass().getSimpleName());
    }

    public void genericMethodHalfGenArgs(T arg, String str){
        System.out.printf("I got an object of %s class and string with %d characters", arg.getClass().getSimpleName(), str.length());
    }

}