package сompetition;

public class Cat extends Participant {
    public Cat(String name) {
        super(name);
    }

    public void run() {
        System.out.println("I am cat. I'm running");
    }

    public void jump() {
        System.out.println("I am cat. I'm jumping");
    }
}
