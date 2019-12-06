package com.company;

import javax.naming.Name;
import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Main myApp = new Main();
        myApp.runProgram();
    }

    Scanner input = new Scanner(System.in);
    ArrayList<String> customerList = new ArrayList<>();
    //Skapade objec för att kalla på constructorn i customer, Martin
    Customer object = new Customer();
    int choice;

    public void runProgram() {
        do {
            printMenu();
            System.out.println("Enter your choice: ");
            System.out.print(">> ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    ListOfCustomers();
                    break;
                case 2:
                    RoomWithSpecifications();
                    break;
                case 3:
                    AvailableRooms();
                    break;
                case 4:
                    AddCustomer();
                    break;
                case 5:
                    RemoveCustomer();
                    break;
                case 6:
                    ViewBooking();
                    break;
                case 7:
                    SearchForBooking();
                    break;
                case 8:
                    CheckIn();
                    break;
                case 9:
                    CheckOut();
                    break;
                case 10:
                    SaveBooking();
                    break;
                case 11:
                    AddRoom();
                    break;
                case 12:
                    EditRoom();
                    break;
                case 13:
                    ViewCustomerInfo();
                    break;
                case 14:
                    BookingInfo();
                    break;
                case 15:
                    EditCustomerInfo();
                    break;
            }
        } while (choice != 16);


    }

    private void printMenu() {
        System.out.println("---- Hello and Welcome to our Hotel Application ----");
        System.out.println("----------------------------------------------------");
        System.out.println("Please select one of the options.");
        System.out.println("------------------------------------------------");
        System.out.println("1: View list of all customers");
        System.out.println("------------------------------------------------");
        System.out.println("2: View all rooms and their specifications");
        System.out.println("------------------------------------------------");
        System.out.println("3: View available rooms");
        System.out.println("------------------------------------------------");
        System.out.println("4: Add new customer");
        System.out.println("------------------------------------------------");
        System.out.println("5: Remove customer");
        System.out.println("------------------------------------------------");
        System.out.println("6: View bookings");
        System.out.println("------------------------------------------------");
        System.out.println("7: Search for a particular booking");
        System.out.println("------------------------------------------------");
        System.out.println("8: Check in customer");
        System.out.println("------------------------------------------------");
        System.out.println("9: Check out customer");
        System.out.println("------------------------------------------------");
        System.out.println("10: Save bookings into a text file");
        System.out.println("------------------------------------------------");
        System.out.println("11: Add rooms and their information");
        System.out.println("------------------------------------------------");
        System.out.println("12: Edit the information of a existing room");
        System.out.println("------------------------------------------------");
        System.out.println("13: View information about a specific customer");
        System.out.println("------------------------------------------------");
        System.out.println("14: Edit information of a particular booking");
        System.out.println("------------------------------------------------");
        System.out.println("15: Edit information for a specific customer");
        System.out.println("------------------------------------------------");
    }

    private void ListOfCustomers() {
        int index = 0;
        for (String s : customerList)
            System.out.println((index++) + ": " + s);

    }

    private void RoomWithSpecifications() {

    }

    private void AvailableRooms() {

    }

    private void AddCustomer() {
        //Ändrade så objectet skickar namnet till customer class istället för lokala variabler i main class, Martin
        System.out.println("Enter customers full name: ");
        object.setName(input.nextLine());
        System.out.println("Enter customers address: ");
        object.setAddress(input.nextLine());
        System.out.println("Enter customers ssn: ");
        object.setSsn(input.nextLine());
        System.out.println("Enter customers telephone number: ");
        object.setTelephoneNumber(input.nextLine());
        System.out.println("");
        customerList.add(String.valueOf(object));

    }

    private void RemoveCustomer() {
        //skapade en remove method med hjälp av att läsa av arrayindex och man får inmata index nr på customer som ska tas bort, Martin.
        int index = 0;
        for (String s : customerList)
            System.out.println((index++) + ": " + s);
        System.out.println("Which customer do you want to remove?: ");
        customerList.remove(input.nextInt());


    }


    public void ViewBooking() {

    }

    private void SearchForBooking() {

    }

    private void CheckIn() {

    }

    private void CheckOut() {

    }

    private void SaveBooking() {

    }

    private void AddRoom() {

    }

    private void EditRoom() {

    }

    private void ViewCustomerInfo() {

    }

    private void BookingInfo() {

    }

    private void EditCustomerInfo() {

    }
}

