package homework4;

public class MethodRepeat {
    public static void main(String[] args) {

        printInfo();
        printInfo();
        printInfo();

        int result = sum(1, 2);
        System.out.println("result " + result);

        int result2 = sum(result, 10);
        System.out.println("result2 " + result2);

       int evenNumber = 18;


    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return  true;
        }else {
            return  true;
        }
    }
    public static void printInfo() {
        System.out.println("Some info");

    }

    public static int sum(int number1, int number2) {
        int sum = number1 + number2;
        return sum;
    }
}
