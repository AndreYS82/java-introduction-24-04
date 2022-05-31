package homework5;

public class BaggageRepeat {
    public static void main(String[] args) {
        System.out.println(isLuggagePasses(57, 19, 41));
    }

    public static boolean isLuggagePasses(int length, int width, int height) {
        int lengthHandLuggage = 55;
        int widthHandLuggage = 20;
        int heightHandLuggage = 40;
        int lengthSuitcase = 40;
        int widthSuitcase = 22;
        int heightSuitcase = 53;

        if (length <= lengthHandLuggage && width <= widthHandLuggage && height <= heightHandLuggage) {
            return true;
        } else if (length <= lengthSuitcase && width <= widthSuitcase && height <= heightSuitcase) {
            return true;
        }
        return false;
    }


}





