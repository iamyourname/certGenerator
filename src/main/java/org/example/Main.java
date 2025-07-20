package org.example;

import java.util.Scanner;

import static org.example.InitClass.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static String userHost;
    public static String userCrq;

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

    public static void displayHosts(String envName, String envID){

        String[] hosts = getHostsByEnv(envName).split(",");
        for(int i = 1; i < hosts.length; i++){
            System.out.println(i+". "+hosts[i]);
        }
        Scanner host = new Scanner(System.in);
        System.out.print("Выберите хост: ");
        String hostName = host.nextLine();
        userHost=selectHostByEnv(envID,hostName);
       // System.out.println(userHost);
        Scanner crq = new Scanner(System.in);
        System.out.print("Введите CRQ: ");
        userCrq = crq.nextLine();

        userInput(userHost,userCrq);

    }

    public static void displayEnv(){
        System.out.println("1. SRMS-PROD");
        System.out.println("2. SRMS-TEST-LINUX");
        System.out.println("3. SRMS-TEST-PORTAL");
        System.out.println("4. SRMS-PROD-PORTAL");
        System.out.println("5. SRMS-TEST-NT");
        System.out.println("6. SRMS-DEV");
        System.out.println("7. SRMS-PRODLIKE");
        System.out.print("Выберите среду: ");
    }

    private static void generateRequestFile() {
        //System.out.println("You selected Option One.");
        System.out.print("\033[H\033[2J");
        System.out.flush();
        String envName="";
        Scanner env = new Scanner(System.in);
        displayEnv();
        String envNumber = env.nextLine();
        switch (envNumber) {
            case "1": envName = "SRMS-PROD";
                break;
            case "2": envName = "SRMS-TEST-LINUX";
                break;
            case "3": envName = "SRMS-TEST-PORTAL";
                break;
            case "4": envName = "SRMS-PROD-PORTAL";
                break;
            case "5": envName = "SRMS-TEST-NT";
                break;
            case "6": envName = "SRMS-DEV";
                break;
            case "7": envName = "SRMS-PRODLIKE";
                break;
        }
        displayHosts(envName, envNumber);
        // Add specific logic for Option One here
    }

    private static void decodeFile() {
        System.out.println("You selected Option Two.");
        // Add specific logic for Option Two here
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        readHosts();

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