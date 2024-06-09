package homework.baseTask;


public class TrainMethodsObjects {

    public void processMouse(Mouse mouse) {
        System.out.println(mouse.getName() +"  "+ mouse.getAge());
        mouse.printMouseDetails();
    }

    public static void main(String[] args) {
        Mouse myMouse = new Mouse("Kiss", 145);
        TrainMethodsObjects demo = new TrainMethodsObjects();
        demo.processMouse(myMouse);


    }
}
