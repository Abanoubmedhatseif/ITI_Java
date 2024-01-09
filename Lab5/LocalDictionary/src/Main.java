package src;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CollectionsDictionary dictionary = new CollectionsDictionary();


        boolean invalid = true;
        while (invalid) {
            System.out.println("\n--- Dictionary Menu ---");
            System.out.println("1. Add Words");
            System.out.println("2. Print All");
            System.out.println("3. Print by Character");
            System.out.println("4. Remove Word");
            System.out.println("5. Remove Key");
            System.out.println("6. Search Word");
            System.out.println("0. Exit");

            try {

                System.out.print("Enter a number: ");
                int choice = scanner.nextInt();
                scanner.nextLine();


                switch (choice) {
                    case 1:
                        System.out.print("Enter words (comma-separated): ");
                        String wordsInput = scanner.nextLine();
                        List<String> wordsToAdd = Arrays.asList(wordsInput.split(","));
                        dictionary.addNewWords(wordsToAdd);
                        System.out.println("Added Successfully");
                        break;

                    case 2:
                        dictionary.printAll();
                        break;

                    case 3:
                        System.out.print("Enter character: ");
                        char charToPrint = scanner.nextLine().charAt(0);
                        dictionary.printByChar(charToPrint);
                        break;

                    case 4:
                        System.out.print("Enter word to remove: ");
                        String wordToRemove = scanner.nextLine();
                        dictionary.removeWord(wordToRemove);
                        break;

                    case 5:
                        System.out.print("Enter key to remove: ");
                        char keyToRemove = scanner.nextLine().charAt(0);
                        if (dictionary.mydictionary.containsKey(keyToRemove)) {
                            dictionary.removeKey(keyToRemove);
                            System.out.println("Key removed");
                            break;
                        } else {
                            System.out.println("No Keys found");
                            break;
                        }


                    case 6:
                        System.out.print("Enter word to search: ");
                        String wordToSearch = scanner.nextLine();
                        dictionary.searchUsingRegex(wordToSearch);
                        break;

                    case 0:
                        System.out.println("Exiting program. Goodbye!");
                        System.exit(0);
                        // can use break as well

                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                } // end default


            }catch (InputMismatchException e){
                System.out.println("Invalid input , Try again. ");
                scanner.nextLine();
            }
        } // end while loop


    } // end main method




} // end main class