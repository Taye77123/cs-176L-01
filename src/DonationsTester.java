import java.util.Scanner;

public class DonationsTester {
public static void main(String[] args) {
Donations giveToMe = new Donations();
Scanner input = new Scanner(System.in);
System.out.print("Would you like to process donations now? (enter 'Yes' to continue): ");
String response = input.nextLine();

if (response.equals("Yes")) {
    System.out.println("Please enter the category and amount of each donation (type '<EOF>' to end):");
    while (input.hasNextLine()) {
        String line = input.nextLine();
        if (line.equals("<EOF>")) {
            break;
        }
        String[] parts = line.split(" ");
        String category = parts[0];
        double amount = Double.parseDouble(parts[1]);
        giveToMe.processDonation(category, amount);
    }
    giveToMe.getStatistics();
} else {
    System.out.println("Ending now without processing donations.");
}
}
}