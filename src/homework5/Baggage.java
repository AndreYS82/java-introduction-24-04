package homework5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baggage {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input length :");
        double length = Double.parseDouble(reader.readLine());
        System.out.println("input width :");
        double width = Double.parseDouble(reader.readLine());
        System.out.println("input height :");
        double height = Double.parseDouble(reader.readLine());


        String massage = isHandBag(length, width, height) ? "it is handBag" :
                "it is not handBag";
        System.out.println(massage);

    }

    public static boolean isHandBag(double length, double width, double height) {
        int lengthBag = 55;
        int widthBag = 20;
        int heightBag = 40;
        int lengthSuitcase = 22;
        int widthSuitcase = 40;
        int heightSuitcase = 53;

        if (length <= lengthBag && width <= widthBag && height <= heightBag) {
            return true;
        } else if (length <= lengthSuitcase && width <= widthSuitcase && height <= heightSuitcase) {
            return true;
        }
        return false;
    }
}