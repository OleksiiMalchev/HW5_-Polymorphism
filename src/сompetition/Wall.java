package сompetition;

public class Wall implements Obstacle {
    private final int height; // высота в метрах

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public int getSizeObstacle() {
        return height;
    }
}
