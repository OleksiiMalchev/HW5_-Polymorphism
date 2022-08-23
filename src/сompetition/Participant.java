package сompetition;

public class Participant {
    protected String name;
    protected final int limitRun;
    protected final int limitJump;

    public Participant(String name) {
        this.name = name;
        int minRun = 500;
        int maxRun = 5000;
        int minJump = 1;
        int maxJump = 3;
        limitRun = (int) (Math.random() * ((maxRun - minRun) + 1)) + minRun;
        limitJump = (int) (Math.random() * ((maxJump - minJump) + 1)) + minJump;
    }

    public void run() {
        System.out.println("I run");
    }

    public void jump() {
        System.out.println("I jump");
    }

    public void overcome(Obstacle obstacle) {
        if (obstacle instanceof Treadmill) {
            if (obstacle.getSizeObstacle() > limitRun) {
                System.out.println("Referee - " + name + " could not pass the obstacle treadmill and is eliminated. His can run only " + limitRun + " metres of " + obstacle.getSizeObstacle());
            } else {
                System.out.println("Referee - " + name + " pass the obstacle treadmill" + "in the distance" + obstacle.getSizeObstacle() + " " + "Passed" + obstacle.getSizeObstacle());
            }
        } else if (obstacle.getSizeObstacle() > limitJump) {
            System.out.println("Referee - " + name + " could not pass the obstacle wall and is eliminated. His can run only " + limitJump + " metres of " + obstacle.getSizeObstacle());
        } else {
            System.out.println("Participant " + name + " pass the obstacle wall " + "in the distance" + obstacle.getSizeObstacle() + " " + "Passed" + obstacle.getSizeObstacle());
        }
    }
}
