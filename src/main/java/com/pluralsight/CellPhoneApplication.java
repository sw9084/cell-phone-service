package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone myPhone = new CellPhone();

        System.out.println(" What is your Serial number?");
        int serialNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println(" What model is the phone?");
        String model = scanner.nextLine();

        System.out.println(" Who is the carrier?");
        String carrier = scanner.nextLine();

        System.out.println("What is the phone number?");
        String phoneNumber = scanner.nextLine();

        System.out.println(" Who is the owner of the phone?");
        String owner = scanner.nextLine();

        // Use setter to store the values
        myPhone.setSerialNumber(serialNumber);
        myPhone.setModel(model);
        myPhone.setCarrier(carrier);
        myPhone.setPhoneNumber(phoneNumber);
        myPhone.setOwner(owner);

        // Use getters to print the phone information

        System.out.println("\nCell Phone Information:");
        System.out.println("Serial Number: " + myPhone.getSerialNumber());
        System.out.println("Model: " + myPhone.getModel());
        System.out.println("Carrier : " + myPhone.getCarrier());
        System.out.println("Phone Number : " + myPhone.getPhoneNumber());
        System.out.println("Owner : " + myPhone.getOwner());

        scanner.close();
    }
}







