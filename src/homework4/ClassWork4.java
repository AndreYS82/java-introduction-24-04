package homework4;

public class ClassWork4 {
    public static void main(String[] args) {

        int emp1 = 3000;
        int emp2 = 4500;
        int emp3 = 5800;
        int y = 120;
        int sal1 = emp1 * y;
        int sal2 = emp2 * y;
        int sal3 = emp3 * y;

        System.out.println("sal1 = " + sal1);
        System.out.println("sal2 = " + sal2);
        System.out.println("sal3 = " + sal3);

        double tax1 = sal1 * 0.05;
        double tax2 = sal2 * 0.05;
        double tax3 = sal3 * 0.05;

        double yearsSal1 = sal1 - tax1;
        double yearsSal2 = sal2 - tax2;
        double yearsSal3 = sal3 - tax3;

        System.out.println("yearsSal1 = " + yearsSal1);
        System.out.println("yearsSal2 = " + yearsSal2);
        System.out.println("yearsSal3 = " + yearsSal3);

        double aveSal1 = yearsSal1 / y;
        double aveSal2 = yearsSal2 / y;
        double aveSal3 = yearsSal3 / y;

        System.out.println("aveSal1 = " + aveSal1);
        System.out.println("aveSal2 = " + aveSal2);
        System.out.println("aveSal3 = " + aveSal3);







    }
}
