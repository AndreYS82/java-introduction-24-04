package homework3;

public class Snowman {
    public static void main(String[] args) {

        double r1 = 0.2;
        double r2 = 0.5;
        double r3 = 1.0;
        double p = 0.7;

        double v1 = (double) 4 / 3 * Math.PI * Math.pow(r1,3);
        double v2 = (double) 4 / 3 * Math.PI * Math.pow(r2,3);
        double v3 = (double) 4 / 3 * Math.PI * Math.pow(r3,3);

        double m = (v1 + v2 + v3) * p;
        System.out.println("snowman mass = " + m);


    }
}
