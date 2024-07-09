package homework.thread;

public class Mouse {

    private String pattern = "Mouse %d";
    private String name;

    public Mouse(int number) {
        this.name = String.format(pattern, number);
    }

    public void peep() {
        System.out.println(name + " PEEP!");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
