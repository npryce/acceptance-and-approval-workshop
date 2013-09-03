package exercise;

import java.util.List;

public class Polyline {
    private final List<Point> points;

    public Polyline(List<Point> points) {
        this.points = points;
    }

    public Point start() {
        return points.get(0);
    }

    public Iterable<Point> ends() {
        return points.subList(1, points.size());
    }
}
