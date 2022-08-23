package сompetition;

public class Human extends Participant {
    public Human(String name) {
        super(name);
    }

    public void run() {
        System.out.println("I am human. I'm running");
    }

    public void jump() {
        System.out.println("I am human. I'm jumping");
    }
}



