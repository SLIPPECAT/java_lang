package java_lang.effectivejava.chapter03.item10;

import java.util.Set;

public class Point {

    private final int x;
    private final int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o){
        if (!(o instanceof Point))
            return false;
        Point p = (Point) o;
        return p.x == x && p
                .y == y;
    }

    private static final Set<Point> unitCircle = Set.of(
            new Point( 1, 0), new Point(0, 1),
            new Point(-1, 0), new Point( 0, -1));

    public static boolean onUnitCircle(Point p) {
        return unitCircle.contains(p);
    }

}
