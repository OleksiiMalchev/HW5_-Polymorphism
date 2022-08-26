package сompetition;

public class Robot implements Participant {
    private int maxRun, maxJump;
    private String name;

    public Robot(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public boolean run(Obstacle obstacle) {
        if (obstacle instanceof Treadmill) {
            if (obstacle.getSizeObstacle() < maxRun) {
                System.out.println("Referee - " + name + " pass the obstacle treadmill");
                return true;
            } else {
                System.out.println("Referee - " + name + " could not pass the obstacle treadmill and is eliminated. His can run only " + maxRun + " metres");
                return false;
            }
        }
        return true;
    }

    public boolean jump(Obstacle obstacle) {
        if (obstacle instanceof Wall) {
            if (obstacle.getSizeObstacle() < maxJump) {
                System.out.println("Referee - " + name + " pass the obstacle wall");
                return true;
            } else {
                System.out.println("Referee - " + name + " could not pass the obstacle wall and is eliminated. His can jump only " + maxJump + " metres");
                return false;
            }
        }
        return true;
    }
}
