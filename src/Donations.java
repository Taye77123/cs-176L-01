import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Donations {
    int numIndividual, numBusiness, numOther;
    double amtIndividual, amtBusiness, amtOther;

    public void processDonation(String category, double amount) {
        if (category.equals("Individual")) {
            if (amount >= 0) {
                numIndividual++;
                amtIndividual += amount;
            } else {
                numIndividual--;
                amtIndividual -= amount;
            }
            System.out.println(category + " donation amount: " + amount);
        } else if (category.equals("Business")) {
            if (amount >= 0) {
                numBusiness++;
                amtBusiness += amount;
            } else {
                numBusiness--;
                amtBusiness -= amount;
            }
            System.out.println(category + " donation amount: " + amount);
        } else {
            if (amount >= 0) {
                numOther++;
                amtOther += amount;
            } else {
                numOther--;
                amtOther -= amount;
            }
            System.out.println(category + " donation amount: " + amount);
        }
    }

    public void getStatistics() {
        System.out.println("Number of donations for: Individual");
        System.out.println("Total donations for Individual: $" + amtIndividual);
        System.out.println("Number of donations for: Business");
        System.out.println("Total donations for Business: $" + amtBusiness);
        System.out.println("Number of donations for: Other");
        System.out.println("Total donations for Other: $" + amtOther);
    }
}
