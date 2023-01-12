package app;

import questions.Questions;
import vehicle.Car;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {

        System.out.println("\n\n\n\n");

        theInfo();



        System.out.println(Questions.questions.get(0));
        System.out.println("================================================\n");


        Scanner sc = new Scanner(System.in);
        System.out.println(Questions.questions.get(1));
        System.out.println("================================================\n");

        String name = sc.next();
        System.out.println("================================================");
        System.out.println("Hello, " + name);
        System.out.println("================================================\n");


        //sc.close();

        System.out.println(Questions.questions.get(2));
        System.out.println("================================================\n");
        //would you like to buy a car today
        String option = "yes";
        String option2 = "no";
        String choice = sc.next();


        if (choice.equalsIgnoreCase(option)) {
            System.out.println(Questions.questions.get(3));
            System.out.println("================================================\n");

        }
        //how to write not equal to for string comparison
        if (choice.equalsIgnoreCase(option2) || !choice.equalsIgnoreCase(option)) {
            System.out.println(Questions.questions.get(4));
            System.out.println("================================================\n");
            String choice2 = sc.next();
            if (choice2.equalsIgnoreCase(option) || !choice.equalsIgnoreCase(option2)) {
                System.out.println("Great, follow me");
                System.out.println("================================================\n");
            } else {
                System.out.println(Questions.statements.get(0));
                System.out.println("================================================\n");
            }
        }
        System.out.println();
        System.out.println(Questions.statements.get(1));
        System.out.println("================================================\n");


        ArrayList<String> carComp = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        for (ArrayList<String> s : Car.allCars) {
            carComp.add(s.get(0));

        }
//      enhanced forLoop hashset to print first item without brackets
        for (String a : carComp) {
            set.add(a);
        }
        System.out.println();
//      enhanced forloop below takes out brackets
        for (String m : set) {
            System.out.print(m + "\t");
        }
        System.out.println("\n================================================\n");
        System.out.println(Questions.questions.get(6));
        System.out.println("================================================\n");


        String choice3 = sc.next();

        System.out.println(Questions.statements.get(4));
        System.out.println("================================================\n");


        String yesNoforCar = sc.nextLine();
        ArrayList<String> firstPositionOf = new ArrayList<>();
        for (ArrayList<String> i : Car.allCars) {
            firstPositionOf.add(i.get(0));
        }

        if (!yesNoforCar.equalsIgnoreCase(option)) {
            if (choice3.equalsIgnoreCase(firstPositionOf.get(0))) {
                System.out.println("================================================\n");
                Car.withoutBrackets(Car.car1);
                Car.withoutBrackets(Car.car2);

                System.out.println("The price for the 1st car: $" + Car.Price());
                System.out.println("The price for the 2nd car: $" + Car.Price());
                System.out.println("================================================");
                System.out.println(Questions.questions.get(7));
                System.out.println("You can simply press 1 or 2");
                System.out.println("================================================\n");
                String optionForCar = sc.nextLine();
                if (optionForCar.equalsIgnoreCase("1") || optionForCar.equalsIgnoreCase("car one") || optionForCar.equalsIgnoreCase("car 1")) {
                    Car.withoutBrackets(Car.car1);
                    System.out.println("================================================\n");
                } else {
                    Car.withoutBrackets(Car.car2);
                    System.out.println("================================================\n");
                }

                System.out.println();
                System.out.println();
            } else if (choice3.equalsIgnoreCase(firstPositionOf.get(2))) {
                System.out.println("================================================");
                Car.withoutBrackets(Car.car3);
                Car.withoutBrackets(Car.car7);
                System.out.println("The price for 1st car: $" + Car.Price());
                System.out.println("The price for 2nd car: $" + Car.Price());
                System.out.println("================================================\n");
                System.out.println(Questions.questions.get(7));
                System.out.println("You can simply press 1 or 2");
                String optionForCar = sc.nextLine();
                if (optionForCar.equalsIgnoreCase("1") || optionForCar.equalsIgnoreCase("car one")) {
                    Car.withoutBrackets(Car.car3);
                    System.out.println("================================================");
                } else {
                    Car.withoutBrackets(Car.car7);
                    System.out.println("================================================\n");

                }

            } else if (choice3.equalsIgnoreCase(firstPositionOf.get(3))) {
                System.out.println("================================================");
                Car.withoutBrackets(Car.car4);
                System.out.println("The price: $" + Car.Price());
                System.out.println("================================================\n");
            } else if (choice3.equalsIgnoreCase(firstPositionOf.get(4))) {

                System.out.println("================================================");
                Car.withoutBrackets(Car.car5);
                System.out.println("The price: $" + Car.Price());
                System.out.println("================================================\n");

            } else if (choice3.equalsIgnoreCase(firstPositionOf.get(5))) {

                System.out.println("================================================");
                Car.withoutBrackets(Car.car6);
                System.out.println("The price: $" + Car.Price());
                System.out.println("================================================\n");

            } else if (choice3.equalsIgnoreCase(firstPositionOf.get(7))) {

                System.out.println("================================================");
                Car.withoutBrackets(Car.car8);
                System.out.println("The price: $" + Car.Price());
                System.out.println("================================================\n");


            } else if (choice3.equalsIgnoreCase(firstPositionOf.get(8))) {

                System.out.println("--------------------------------");
                Car.withoutBrackets(Car.car9);
                Car.withoutBrackets(Car.car12);
                System.out.println("The price for 1st the car: $" + Car.Price());
                System.out.println("The price for 2nd the car: $" + Car.Price());
                System.out.println("");
                System.out.println("--------------------------------");
                System.out.println("You can simply press 1 or 2");
                System.out.println(Questions.questions.get(7));
                String optionForCar = sc.nextLine();
                if (optionForCar.equalsIgnoreCase("1") || optionForCar.equalsIgnoreCase("car one")) {
                    Car.withoutBrackets(Car.car9);
                } else {
                    Car.withoutBrackets(Car.car12);
                }

            } else if (choice3.equalsIgnoreCase(firstPositionOf.get(9))) {

                System.out.println("================================================");
                Car.withoutBrackets(Car.car10);
                System.out.println("The price: $" + Car.Price());
                System.out.println("================================================\n");

            } else if (choice3.equalsIgnoreCase(firstPositionOf.get(10))) {

                System.out.println("================================================");
                Car.withoutBrackets(Car.car11);
                System.out.println("The Price: $" + Car.Price());
                System.out.println("================================================\n");
            }
        }//end if


        System.out.println(Questions.questions.get(8));
        System.out.println("================================================\n");


        String wouldYouLikeToBuy = sc.nextLine();


        if (wouldYouLikeToBuy.equalsIgnoreCase(option)) {
            System.out.println(Questions.statements.get(5));
            System.out.println("================================================\n");

        } else {
            System.out.println(Questions.statements.get(6));
            System.out.println("================================================\n");

        }



    }//end main


    public static void theInfo() {
        System.out.println("=============================");
        System.out.println("BuyMyCars Lot");
        System.out.println("=============================\n");


    }

}//end class
