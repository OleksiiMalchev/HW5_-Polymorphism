package сompetition;

public class Cat implements Participant {
    private int maxRun, maxJump;
    private String name;

    public Cat(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public void run() {
        System.out.println("Referee - " + name + " pass the obstacle treadmill");
    }

    public void cantRun() {
        System.out.println("Referee - " + name + " could not pass the obstacle treadmill and is eliminated. His can run only " + maxRun + " metres");

    }

    public void jump() {
        System.out.println("Referee - " + name + " pass the obstacle wall");
    }

    public void cantJupm() {
        System.out.println("Referee - " + name + " could not pass the obstacle wall and is eliminated. His can run jupm " + maxJump + " metres ");
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxJump() {
        return maxJump;
    }
}
