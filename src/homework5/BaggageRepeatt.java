package homework5;

public class BaggageRepeatt {
    public static void main(String[] args) {
        System.out.println(isLuggagePasses(55, 19, 41));
    }
    public static boolean isLuggagePasses(int length, int width, int height){
        int lengthHandLuggage = 55;
        int widthHandLuggage = 20;
        int heightHandLuggage = 40;
        int lengthSuitcase = 40;
        int widthSuitcase = 22;
        int heightSuitcase = 53;{

            if (lengthHandLuggage <= 55 && widthHandLuggage <= 20 && heightHandLuggage <= 40){
            return true;
                } else if (lengthSuitcase <= 40 && widthSuitcase <= 22 && heightSuitcase <= 53){
                return true;
            } return false;
        }

        }

    }





