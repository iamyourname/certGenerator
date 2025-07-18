package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static void displayMenu() {
        System.out.println("--- CRQ Cert Generator ---");
        System.out.println("1. Generate new requestFile");
        System.out.println("2. Decode file");
        System.out.println("3. Exit");
        System.out.print("Input your choice: ");
    }

    private static int getUserChoice(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // Consume the invalid input
            System.out.print("Enter your choice: ");
        }
        return scanner.nextInt();
    }

    private static void generateRequestFile() {
        //System.out.println("You selected Option One.");
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner crq = new Scanner(System.in);
        System.out.print("Enter CRQ number: ");
        String crqNumber = crq.nextLine();
        System.out.println(crqNumber);
        // Add specific logic for Option One here
    }

    private static void decodeFile() {
        System.out.println("You selected Option Two.");
        // Add specific logic for Option Two here
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            displayMenu();
            int choice = getUserChoice(scanner);

            switch (choice) {
                case 1:
                    generateRequestFile();
                    break;
                case 2:
                    decodeFile();
                    break;
                case 3:
                    System.out.println("Exiting the application. Goodbye!");
                    running = false; // Set running to false to exit the loop
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
            System.out.println(); // Add a blank line for better readability
        }
        scanner.close(); // Close the scanner when done
    }
}