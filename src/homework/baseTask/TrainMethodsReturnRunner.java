package baseTask;

public class TrainMethodsReturnRunner {

    public static void main(String[] args) {
        TrainMethodsReturn demo = new TrainMethodsReturn();
        int x = demo.returnNewInt(101);
        System.out.println("метод returnNewInt вернул " + x);
        long y = demo.returnNewLong(1000001);
        System.out.println("метод returnNewLong вернул " + y);
        char z = demo.returnNewChar('A');
        System.out.println("метод returnNewChar вернул " + z);
        float fl = demo.returnNewFloat(0.8888f);
        System.out.println("метод returnNewFloat вернул " + fl);
        double db = demo.returnNewDouble(0.04);
        System.out.println("метод returnNewDouble вернул " + db);
        short sh = demo.returnNewShort((short) 78);
        System.out.println("метод returnNewShort вернул " + sh);
        short bt = demo.returnNewByte((byte) 50);
        System.out.println("метод returnNewShort вернул " + bt);
        boolean bl = demo.returnNewBoolean(true);
        System.out.println("метод returnNewShort вернул " + bl);


    }
}

