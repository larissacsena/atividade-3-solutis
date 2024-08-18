package a30.entities;

import a30.application.Atividade30;

public class Rectangle {
    Point[] points;

    public Rectangle(Point[] points) {
        if (points.length != 4) {
            throw new IllegalArgumentException("Um retângulo deve ter exatamente 4 pontos.");
        }
        this.points = points;
    }

    public boolean intersects(Rectangle other) {
        for (int i = 0; i < 4; i++) {
            if (pointInRectangle(other.points[i])) {
                return true;
            }
        }
        for (int i = 0; i < 4; i++) {
            if (other.pointInRectangle(this.points[i])) {
                return true;
            }
        }
        return false;
    }

    private boolean pointInRectangle(Point point) {
        double minX = Math.min(points[0].x, points[2].x);
        double maxX = Math.max(points[0].x, points[2].x);
        double minY = Math.min(points[0].y, points[2].y);
        double maxY = Math.max(points[0].y, points[2].y);

        return (point.x >= minX && point.x <= maxX && point.y >= minY && point.y <= maxY);
    }
}
