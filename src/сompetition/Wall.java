package сompetition;

public class Wall extends Obstacle {
    private final int height; // высота в метрах

    public Wall() {
        int minheight = 1;
        int maxheight = 3;
        height = (int) (Math.random() * ((maxheight - minheight) + 1)) + minheight;
    }

    @Override
    public int getSizeObstacle() {
        return height;
    }
}
