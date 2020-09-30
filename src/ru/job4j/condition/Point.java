package ru.job4j.condition;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int first, int second, int third) {
        this.x = first;
        this.y = second;
        this.z = third;
    }

    public double distance(Point that) {
        return Math.sqrt(
                  Math.pow((this.x - that.x), 2)
                + Math.pow((this.y - that.y), 2)
        );
    }

    public double distance3d(Point that) {
        return Math.sqrt(
                Math.pow((this.x - that.x), 2)
                        + Math.pow((this.y - that.y), 2)
                        + Math.pow((this.z - that.z), 2)
        );
    }

    public static void main(String[] args) {
        Point one = new Point(1, 1);
        Point two = new Point(1, 1);
        System.out.println(one.distance(two));
        one = new Point(0, 0);
        two = new Point(4, 0);
        System.out.println(one.distance(two));
    }
}