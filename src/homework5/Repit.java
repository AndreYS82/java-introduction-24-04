package homework5;public class Repit {

    public static void main(String[] args) {
        int mark1 = 8;
        int mark2 = 12;
        int mark3 = 10;
        int mark4 = 12;
        int mark5 = 9;
        double middleAvarage = calculate(mark1, mark2, mark3, mark4, mark5);
        Scholarship(middleAvarage);
    }
    public static double calculate (int mark1, int mark2, int mark3, int mark4, int mark5){
        return (double)(mark1 + mark2+ mark3 + mark4 + mark5)/5;
    }
    public static void Scholarship (double middleAvarage){
        if (middleAvarage >= 10){
        System.out.println("Підвищена стипендія");
    } else if (middleAvarage >= 6){
            System.out.println("Занижена стипендія");
        }else{
            System.out.println("Sorry Uncle");
        }

        }

    }
