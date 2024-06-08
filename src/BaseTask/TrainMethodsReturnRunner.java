package BaseTask;

public class TrainMethodsReturnRunner {
    public static void main(String[] args) {
        TrainMethodsReturn Demo = new TrainMethodsReturn();
        int x = Demo.returnNewInt(101);
        System.out.println("метод returnNewInt вернул " + x);
        long y = Demo.returnNewLong(1000001);
        System.out.println("метод returnNewLong вернул " + y);
        char z = Demo.returnNewChar('A');
        System.out.println("метод returnNewChar вернул " + z);
        float fl = Demo.returnNewFloat(0.8888f);
        System.out.println("метод returnNewFloat вернул " + fl);
        double db = Demo.returnNewDouble(0.04);
        System.out.println("метод returnNewDouble вернул " + db);
        short sh = Demo.returnNewShort((short) 78);
        System.out.println("метод returnNewShort вернул " + sh);
        short bt = Demo.returnNewByte((byte) 50);
        System.out.println("метод returnNewShort вернул " + bt);
        boolean bl = Demo.returnNewBoolean(true);
        System.out.println("метод returnNewShort вернул " + bl);


    }
}

