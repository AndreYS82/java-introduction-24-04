package homework4;

public class AnimalShelter {

    public static void main(String[] args) {

        int dogs = 24;
        int cats = 8;
        int totalAnimalsShelter = dogs + cats;
        double lunchPortionInGrams = 50;
        double dailyPortionInGramsForCats = lunchPortionInGrams * 3 * cats;
        double dailyPortionInGramsForDogs = lunchPortionInGrams * 3 * dogs;
        double costPerPortionInDollars = 2.00;
        int daysInMonth = 30;
        double feedForMonthForCats = dailyPortionInGramsForCats * daysInMonth;
        double feedForMonthForDogs = dailyPortionInGramsForDogs * daysInMonth;
        double feedCost = totalAnimalsShelter * 3 * daysInMonth * costPerPortionInDollars;

        printAnimalShelterInformation(feedForMonthForCats,
                 feedForMonthForDogs, feedCost);

    }
    public static void printAnimalShelterInformation(double feedForMonthForCats,
                                                     double feedForMonthForDogs, double feedCost){
        System.out.println("Animal shelter information: FeedForMonthForCats - " + feedForMonthForCats +
                ", FeedForMonthForDogs - " + feedForMonthForDogs + ", FeedCost - " + feedCost);

    }


}
