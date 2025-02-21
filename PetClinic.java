import java.util.Scanner;

class Pet {
    private String name;
    private String type;

    public Pet(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
}

public class PetClinic {
    public static void main(String[] args) {
        System.out.println("Welcome to the Pet Clinic!");
        Pet [] pets = new Pet[10];

        pets[0] = new Pet("Riko", "dog");
        pets[1] = new Pet("Bella", "cat");
        pets[2] = new Pet("Foxy", "dog");
        pets[3] = new Pet("Kat", "cat");
        pets[4] = new Pet("Bruno", "dog");
        pets[5] = new Pet("Garfield", "cat");
        pets[6] = new Pet("Ally", "dog");
        pets[7] = new Pet("Tony", "cat");
        pets[8] = new Pet("Ace", "cat");
        pets[9] = new Pet("Mittens", "cat");

        Scanner input = new Scanner(System.in);
        System.out.print("Give type: ");
        String type = input.nextLine();

        int counter = 0;

        if (type.equals("dog")) {
            for (int i = 0; i < pets.length; i++) {
                if (pets[i].getType().equals("dog")) {
                    System.out.println("- " + pets[i].getName());
                    counter ++;
                }
            }
            System.out.println("Total animals of " + type + " type: " + counter + ".");
        }
        else if (type.equals("cat")) {
            for (int i = 0; i < pets.length; i++) {
                if (pets[i].getType().equals("cat")) {
                    System.out.println("- " + pets[i].getName());
                    counter ++;
                }
            }
            System.out.println("Total animals of " + type + " type: " + counter + ".");
        }
        else {
            System.out.println("We dont have this type yet!");
        }
    }
}
