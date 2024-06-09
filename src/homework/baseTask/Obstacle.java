package homework.baseTask;

public class Obstacle {

    private String description;
    private String severity;

    public Obstacle(String description, String severity) {
        this.description = description;
        this.severity = severity;
    }

    public String getDescription() {
        return description;
    }

    public String getSeverity() {
        return severity;
    }

    public void printObstacleDetails() {
        System.out.println("Возникло " + severity + " препятствие " + description);
    }

    public static void main(String[] args) {
        Obstacle demo = new Obstacle("asdfghj", "major");
        demo.printObstacleDetails();

    }
}
