package сompetition;

public class Treadmill extends Obstacle {
    private final int length; // длинна в метрах

    public Treadmill() {
        int minLength = 500;
        int maxLength = 7000;
        length = (int) (Math.random() * ((maxLength - minLength) + 1)) + minLength;
    }

    @Override
    public int getSizeObstacle() {
        return length;
    }
}
