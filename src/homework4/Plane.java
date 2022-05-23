package homework4;

public class Plane {
    public static void main(String[] args) {
        printPlaneInformation("boing", "A170");
        printPlaneInformation("fog", "S22", 130);
        printPlaneInformation("fog", "S22", 130, 120);

    }
    public static void printPlaneInformation(String name, String type){
        System.out.println("plane information: name - " + name + ", type - " + type);
    }
    public static void printPlaneInformation(String name, String type, int places){
        System.out.println("plane information: name - " + name + ", type - " + type +
                ", number of places in economy class - " + places);
    }
    public static void printPlaneInformation(String name, String type, int economicPlaces,
                                             int businessPlaces){
        System.out.println("plane information: name - " + name + ", type - " + type +
                ", number of places in economy class - " + economicPlaces + ", " +
                "number of places in business class - " + businessPlaces);
    }
}
