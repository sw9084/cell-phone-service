package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone cellPhone1 = new CellPhone();

        // first cellphone

        System.out.println(" What is your Serial number?");
        int serialNumber1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println(" What model is the phone?");
        String model1 = scanner.nextLine();

        System.out.println(" Who is the carrier?");
        String carrier1 = scanner.nextLine();

        System.out.println("What is the phone number?");
        String phoneNumber1 = scanner.nextLine();

        System.out.println(" Who is the owner of the phone?");
        String owner1 = scanner.nextLine();

        // Use setter to store the values
        cellPhone1.setSerialNumber(serialNumber1);
        cellPhone1.setModel(model1);
        cellPhone1.setCarrier(carrier1);
        cellPhone1.setPhoneNumber(phoneNumber1);
        cellPhone1.setOwner(owner1);

        // second cellphone
        CellPhone cellphone2 = new CellPhone();

        System.out.println("/nEnter information fro the SECOND call phone:");
        System.out.println("What is the serial number?");
        int serialNumber2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What model is the phone?");
        String model2 = scanner.nextLine();
        System.out.println("What is the carrier?");
        String carrier2 = scanner.nextLine();
        System.out.println("What is the phone number?");
        String phoneNumber2 = scanner.nextLine();
        System.out.println("Who is the owner of the phone?");
        String owner2 = scanner.nextLine();

        cellphone2.setSerialNumber(serialNumber2);
        cellphone2.setModel(model2);
        cellphone2.setCarrier(carrier2);
        cellphone2.setPhoneNumber(phoneNumber2);
        cellphone2.setOwner(owner2);
        //display both phone
        display(cellPhone1);
        display(cellphone2);

        // Display phone 1 dial phone 2
        System.out.println();
       cellPhone1.dial(cellphone2.getPhoneNumber());

        scanner.close();
    }
    public static void display(CellPhone phone) {

        System.out.println("\nCell Phone Information---");
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier : " + phone.getCarrier());
        System.out.println("Phone Number : " + phone.getPhoneNumber());
        System.out.println("Owner : " + phone.getOwner());

    }
}







