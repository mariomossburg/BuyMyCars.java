package vehicle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Car {

    public static ArrayList<String> car1 = new ArrayList<>(Arrays.asList("Chevy", "Corvette", "2015", "Mileage: 57,982"));
    public static ArrayList<String> car2 = new ArrayList<>(Arrays.asList("Chevy", "Impala", "2013", "Mileage: 97,542"));
    public static ArrayList<String> car3 = new ArrayList<>(Arrays.asList("Nissan", "Altima", "2009", "Mileage: 111,923"));
    public static ArrayList<String> car4 = new ArrayList<>(Arrays.asList("Ford", "Fusion", "2017", "Mileage: 73,923"));
    public static ArrayList<String> car5 = new ArrayList<>(Arrays.asList("Toyota", "Corolla", "2007", "Mileage: 164,012"));

    public static ArrayList<String> car6 = new ArrayList<>(Arrays.asList("Honda", "Civic", "1998", "Mileage: 201,314"));

    public static ArrayList<String> car7 = new ArrayList<>(Arrays.asList("Nissan", "GT-R Premium", "2016", "Mileage: 26,842"));

    public static ArrayList<String> car8 = new ArrayList<>(Arrays.asList("Audi", "SQ5", "2018", "Mileage: 42,132"));

    public static ArrayList<String> car9 = new ArrayList<>(Arrays.asList("Kia", "Stinger", "2021", "Mileage: 4,586"));

    public static ArrayList<String> car10 = new ArrayList<>(Arrays.asList("Lincoln", "Navigator", "2019", "Mileage: 42,165"));

    public static ArrayList<String> car11 = new ArrayList<>(Arrays.asList("RangeRover", "Evoque", "2015", "Mileage: 57,992"));

    public static ArrayList<String> car12 = new ArrayList<>(Arrays.asList("Kia", "Soul", "2016", "Mileage: 73,681"));


    //2d ArrayList
    public static ArrayList<ArrayList<String>> allCars = new ArrayList<>();
    //public static ArrayList<String> carCompany = new ArrayList<>();


    static {
        allCars.add(car1);
        allCars.add(car2);
        allCars.add(car3);
        allCars.add(car4);
        allCars.add(car5);
        allCars.add(car6);
        allCars.add(car7);
        allCars.add(car8);
        allCars.add(car9);
        allCars.add(car10);
        allCars.add(car11);
        allCars.add(car12);

    }// static


    public static double Price() {
        Random rndGen = new Random();
        double price = rndGen.nextInt(30000 - 7000 + 1) + 5000;

       // System.out.println("Price: $" + price);
        return price;
    }

    public static void withoutBrackets(ArrayList<String> list) {
        for (String c : list) {
            System.out.print(c + " ");
        }
        System.out.println();
    }


}// end car class
