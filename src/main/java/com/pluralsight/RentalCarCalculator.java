package com.pluralsight;

import java.util.*;

public class RentalCarCalculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to our Rent-a-car!");
        String date = promptforStrings("Pick a date when you would like your car: ");
        int num_of_days = promptforInts("How many days would you like the car: ");
        String electric_tag = promptforStrings("Would you like a electric tag at $3.95/day (yes/no): ");
        String GPS = promptforStrings("Would you like a GPS at $2.95/day (yes/no): ");
        String roadside_assist = promptforStrings("Would you like roadside assistance at $3.95/day (yes/no): ");
        int age = promptforInts("How old are you: ");

        float total_charges = basic_rent(num_of_days) + electronic_toll(num_of_days,electric_tag) + GPS_charge(num_of_days,GPS) + rsAssist_charge(num_of_days, roadside_assist) + age_charge(age);

        System.out.printf("Your total cost for the rent would be: $%.2f", total_charges);
    }

    public static String promptforStrings(String prompt){
        System.out.print(prompt);
        String value = scanner.nextLine();
        return value;
    }

    public static int promptforInts(String prompt){
        System.out.print(prompt);
        int num = scanner.nextInt();
        scanner.nextLine();
        return num;

    }

    public static float basic_rent(int days){
        float charges;
        return charges = 29.99f * days;
    }

    public static float electronic_toll(int days, String elec_tage){
        float charges;
        if(elec_tage.equals("yes")){
            charges = days * 3.95f;
            return charges;
        }else return charges = 0;
    }
    public static float GPS_charge(int days, String GPS){
        float charges;
        if(GPS.equals("yes")){
            charges = days * 2.95f;
            return charges;
        }else return charges = 0;
    }
    public static float rsAssist_charge(int days, String rs_assist){
        float charges;
        if(rs_assist.equals("yes")){
            charges = days * 3.95f;
            return charges;
        }else return charges = 0;
    }
    public static float age_charge(int age){
        float charge;
        if(age < 25){
            charge = 29.99f * .30f;
            return charge;
        }else return charge = 0;
    }
}
