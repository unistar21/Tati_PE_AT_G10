package cycleTask;

public class CycleTaskRunner {
    public static void main(String[] args) {

        WhileTask demo = new WhileTask();
        demo.printWhile(0);
        System.out.println();

        ForTask forTask = new ForTask();
        forTask.printFor(3);
        System.out.println();

        ArrayTask arrayTask = new ArrayTask();
        arrayTask.printArray();
    }

}
