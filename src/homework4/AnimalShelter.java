package homework4;

public class AnimalShelter {

    public static void main(String[] args) {

        int dogs = 24;
        int cats = 8;
        double lunchPortionInGrams = 50;
        int numberPortionOnDay = 3;
        double costPerPortionInDollars = 2.00;
        int daysInMonth = 30;
        double foodForCats = calculateAnimalsFood(cats, lunchPortionInGrams, numberPortionOnDay, daysInMonth);
        System.out.println(foodForCats);
        double foodForDogs = calculateAnimalsFood(24, lunchPortionInGrams, 3, 31);
        System.out.println(foodForDogs);
        double priceMonthForCats = calculateMoneyShelterInMonth(cats, numberPortionOnDay, costPerPortionInDollars,
                daysInMonth);
        System.out.println(priceMonthForCats);
        double priceMonthForDogs = calculateMoneyShelterInMonth(dogs, numberPortionOnDay, costPerPortionInDollars,
                daysInMonth);
        System.out.println("priceMonthForDogs - " + priceMonthForDogs);
    }
    public static void printAnimalShelterInformation(double feedForMonthForCats,
                                                     double feedForMonthForDogs, double feedCost){
        System.out.println("Animal shelter information: FeedForMonthForCats - " + feedForMonthForCats +
                ", FeedForMonthForDogs - " + feedForMonthForDogs + ", FeedCost - " + feedCost);

    }
    public static double calculateAnimalsFood(int animals, double lunchPortion, int numberPortionOnDay,
                                              int daysInMonth){
        return animals * lunchPortion * numberPortionOnDay * daysInMonth;
    }
    public static double calculateMoneyShelterInMonth(int animals, int numberPortionOnDay, double price, int days){
        return animals * numberPortionOnDay * price * days;
    }


}
