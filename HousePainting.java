import java.util.Scanner;

public class HousePainting {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int width, length, height;
    int numWindows, numDoors;
    int windowWidth, windowHeight;
    int doorWidth, doorHeight;
    int PerSquareFoot;
    int totalCost;

    System.out.print("Enter the width of the house: ");
    width = sc.nextInt();

    System.out.print("Enter the length of the house: ");
    length = sc.nextInt();

    System.out.print("Enter the height of the house: ");
    height = sc.nextInt();

    System.out.print("Enter the number of windows: ");
    numWindows = sc.nextInt();

    System.out.print("Enter the width of the windows: ");
    windowWidth = sc.nextInt();

    System.out.print("Enter the height of the windows: ");
    windowHeight = sc.nextInt();

    System.out.print("Enter the number of doors: ");
    numDoors = sc.nextInt();

    System.out.print("Enter the width of the doors: ");
    doorWidth = sc.nextInt();

    System.out.print("Enter the height of the doors: ");
    doorHeight = sc.nextInt();


    int wallArea = (2 * height * width) + (2 * height * length);
    int windowArea = numWindows * windowWidth * windowHeight;
    int doorArea = numDoors * doorWidth * doorHeight;
    
    PerSquareFoot =  length * width;
    System.out.println("Your total paintable surface area is" + PerSquareFoot "square feet.");
    
    
    totalCost = (wallArea - windowArea - doorArea) * costPerSquareFoot;
    System.out.println("The total cost to paint the house is: $" + totalCost);
  }
}

