package homework.generic;

public class GenericMethodsInGenericClassTRunner {
    public static void main(String[] args) {

        GenericMethodsInGenericClassT<String> str=new GenericMethodsInGenericClassT<>();
        str.genericMethodOneGenArg("Hi Tanya");
        System.out.println();
        String result1=str.genericMethodTwoGenArgs("Tanya",21.01);
        System.out.println(result1);
        str.genericMethodHalfGenArgs("Tanya","Tatiana");

        System.out.println();

        GenericMethodsInGenericClassT<Integer> demo=new GenericMethodsInGenericClassT<>();
        demo.genericMethodOneGenArg(21);
        System.out.println();
        String result2=demo.genericMethodTwoGenArgs(101,"hiiiiii");
        System.out.println(result2);
        demo.genericMethodHalfGenArgs(21,"Hello world");

        System.out.println();

        GenericMethodsInGenericClassT<Double> demo2=new GenericMethodsInGenericClassT<>();
        demo2.genericMethodOneGenArg(21.999999);
        System.out.println();
        String result3=demo2.genericMethodTwoGenArgs(101.11111,"hiiiiii");
        System.out.println(result3);
        demo2.genericMethodHalfGenArgs(21.11111,"Hello wooooorld");

        System.out.println();





    }
}
