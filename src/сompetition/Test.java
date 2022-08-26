package сompetition;

public class Test {
    public static void main(String[] args) {

        Participant[] participants = new Participant[10];
        participants[0] = new Human("Piter", 3000, 5);
        participants[1] = new Human("Kris", 6000, 2);
        participants[2] = new Human("Ivan", 5000, 2);
        participants[3] = new Cat("Murzik", 150, 250);
        participants[4] = new Cat("Tom", 250, 350);
        participants[5] = new Cat("Bazilio", 2000, 2);
        participants[6] = new Robot("Rok", 5000, 3);
        participants[7] = new Human("Stell", 2000, 5);
        participants[8] = new Human("Atos", 1500, 6);

        Obstacle[] obstacle = new Obstacle[50];
        obstacle[0] = new Treadmill(1000);
        obstacle[1] = new Treadmill(1);
        obstacle[2] = new Wall(1);
        obstacle[3] = new Wall(2);
        obstacle[4] = new Wall(3);
        obstacle[5] = new Treadmill(30);
        obstacle[6] = new Treadmill(30);

        сompetition(participants, obstacle);

    }

    private static void сompetition(Participant[] participants, Obstacle[] obstacle) {
        for (Participant participant : participants) {
            for (Obstacle obstacles : obstacle) {
                if (participant == null || obstacles == null) {
                    break;
                }
                if (!participant.run(obstacles)) {
                    break;
                } else if (!participant.jump(obstacles)) {
                    break;
                }
            }
        }
    }
}



