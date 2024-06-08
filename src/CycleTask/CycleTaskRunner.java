package CycleTask;

public class CycleTaskRunner {
    public static void main(String[] args) {
        WhileTask Demo=new WhileTask();
        Demo.printWhile(0);
        System.out.println();
        ForTask ForTask=new ForTask();
        ForTask.printFor(3);
        System.out.println();
        ArrayTask ArrayTask=new ArrayTask();
        ArrayTask.printArray();
    }

}
