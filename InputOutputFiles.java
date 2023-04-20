import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputOutputFiles {
public static void main(String[] args) throws FileNotFoundException {
Scanner scanner = new Scanner(System.in);
String filePath = "";
boolean validPath = false;
while (!validPath) {
    System.out.print("Please enter the path to open the input file for example C:\\Downloads\\lines.txt : ");
    filePath = scanner.nextLine();
    
    try {
        File inputFile = new File(filePath);
        Scanner in = new Scanner(inputFile);
        validPath = true;
        
        File outputFile = new File("C:\\Users\\geckert\\Downloads\\e02\\student\\outlines.txt");
        PrintWriter output = new PrintWriter(outputFile);

        while (in.hasNext()) {
            String line = in.nextLine().trim();
            if (!line.isEmpty()) {
                output.println(line);
            }
        }

        in.close();
        output.close();
    } catch (FileNotFoundException e) {
        System.out.println("File is not found, please try again.");
    }
}
scanner.close();
}
}
