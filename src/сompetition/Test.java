package сompetition;

public class Test {
    public static void main(String[] args) {


        Participant[] participants = new Participant[10];
        participants[0] = new Human("Piter");
        participants[1] = new Human("Kris");
        participants[2] = new Human("Ivan");
        participants[3] = new Cat("Murzik");
        participants[4] = new Cat("Tom");
        participants[5] = new Human("Bazilio");
        participants[6] = new Human("Rok");
        participants[7] = new Human("Stell");
        participants[8] = new Human("Atos");

        Obstacle[] obstacle = new Obstacle[50];
        obstacle[0] = new Treadmill();
        obstacle[1] = new Treadmill();
        obstacle[2] = new Wall();
        obstacle[3] = new Wall();
        obstacle[4] = new Wall();
        obstacle[5] = new Treadmill();

        сompetition(participants, obstacle);

    }

    public static void сompetition(Participant[] participants, Obstacle[] obstacles) {

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (participant == null || obstacle == null) {
                    break;
                }
                participant.overcome(obstacle);

            }
        }
    }
}

