package homework.week03;

import java.util.Scanner;

public class BookStore {
    public static void main(String[] args) {
        BookList bookList = new BookList();
        Scanner input = new Scanner(System.in);

        int option;

        do {
            System.out.println("\nWelcome to the BookStore! Please choose an option:");
            System.out.println("1. View Printed Books");
            System.out.println("2. View Digital Books");
            System.out.println("3. View Audio Books");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");

            option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.println("\nAvailable Printed Books:");
                    bookList.displayBooks("Printed");
                    break;
                case 2:
                    System.out.println("Available Digital Books:");
                    bookList.displayBooks("Digital");
                    break;
                case 3:
                    System.out.println("Available Audio Books:");
                    bookList.displayBooks("Audiobook");
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (option != 0);
    }
}
