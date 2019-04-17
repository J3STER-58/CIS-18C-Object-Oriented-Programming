package javaapplication1;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;

public class JavaApplication1 {
    public static void main(String[] args) {
        // Declaring input, input value, name value, Hashmap, and Queue
        Scanner input = new Scanner(System.in);
        int choice;
        String aName;
        HashMap<String, Animal> zooVet = new HashMap<>();
        Queue<Animal> aQ = new LinkedList<>();
        
        // Options loop
        do {
            System.out.println("Welcome to the San Diego Zoo Animal Tracking system.  Please select an option:\n" +
                                "1. Enter a new animal by name\n" +
                                "2. Add an animal to the Veterinary Queue\n" +
                                "3. Get the next animal in the Veterinary queue\n" +
                                "4. Exit\n");
            System.out.print("What would you like to do: ");
            
            String sChoice = input.nextLine();
            choice = Integer.parseInt(sChoice);
            
            // Check to Quit Program
            switch (choice) {
                case 4: // Exit Program
                    System.out.println("\nExiting now.\n\n");
                    System.exit(0);
                case 1: // Add animal to HashMap
                    System.out.println("\nEnter the name of the Animal :  ");
                    aName = input.nextLine();        // Grabbing animal name from user
                    zooVet.put(aName, new Animal()); // Putting key (name) and value (new animal) into map
                    System.out.println("\nAnimal has been entered.\n\n");
                    break;
                case 2: // Add animal to Queue
                    System.out.println("\nEnter the name of the Animal :  ");
                    aName = input.nextLine(); // Grabbing Animal name from user
                    Animal n = new Animal();  // Creates new Animal
                    n.setName(aName);         // Sets new Animal's name
                    aQ.add(n);                // Adds Animal onto Queue
                    System.out.println("\nAdded " + aName + " onto Vet Queue\n\n");
                    break;
                case 3: // Pops animal off Queue (Dequeue)
                    Animal aNameRemove = aQ.poll(); // Removes Animal and holds value
                    System.out.println("\nRemoved from Vet Queue: " + aNameRemove.getName() + "\n\n");
                    break;
                default:
                    System.out.println("\nInvalid Entry\n\n");
                    break;
            }
        } while (choice != 4); // Continue loop while !Exit
    } 
}
