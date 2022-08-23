package сompetition;

public class Robot extends Participant {
    public Robot(String name) {
        super(name);
    }

    public void run() {
        System.out.println("I am robot. I'm running");
    }

    public void jump() {
        System.out.println("I am robot. I'm jumping");
    }
}
