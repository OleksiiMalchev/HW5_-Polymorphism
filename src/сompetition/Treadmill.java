package сompetition;

public class Treadmill implements Obstacle {
    private final int length; // длинна в метрах

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public int getSizeObstacle() {
        return length;
    }
}
