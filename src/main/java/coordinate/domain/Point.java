package coordinate.domain;

public class Point {
    private static final int MAX_X = 24;
    private static final int MAX_Y = 24;
    private static final int MIN_X = 0;
    private static final int MIN_Y = 0;

    private final int x;
    private final int y;

    public Point(final int x, final int y) {
        this.x = x;
        this.y = y;
        validate();
    }

    private void validate() {
        if (x > MAX_X || y > MAX_Y) {
            throw new IllegalArgumentException("좌표의 최대값은" + MAX_X + "이하 입니다.");
        }
        if (x < MIN_X || y < MIN_Y) {
            throw new IllegalArgumentException("좌표의 최소값은" + MIN_X + "이하 입니다.");
        }
    }

}