package homework3;

public class JavaMath {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;

        double result = Math.abs(a - b) / Math.pow((a + b), 3) - Math.sqrt(c);
        System.out.println("|a-b|/(a+b)^3-√c = " + result);
    }
}
