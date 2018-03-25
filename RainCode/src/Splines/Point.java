package Splines;

import cparse.GaussDistr;

public class Point {

    double x, y, z;
    String methodName;

    public Point(double x, double y, double z, String methodName) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.methodName = methodName;
    }

    public Point deviate(GaussDistr g, int count) {
        double[] xyz = g.distribute(x, y, z, count);
        return new Point(xyz[0], xyz[1], xyz[2], methodName);
    }
}
