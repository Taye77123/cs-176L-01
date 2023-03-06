public class ArrayAssignment1 {
   public static void main(String[] args) {
      double[] values = {25.3, 100, -10, -1.5, 13, 98.6, 17, 123.145, 125.6, 123.146};
      
      // Printing all elements of the array in a single row
      System.out.print("Array elements: ");
      for(double element : values) {
         System.out.print(element + " ");
      }
      System.out.println();
      
      // Computing and printing the largest element in the array
      double largest = values[0];
      for(double element : values) {
         if(element > largest) {
            largest = element;
         }
      }
      System.out.println("Largest element: " + largest);
      
      // Computing and printing a count of elements in the array that are negative
      int negativeCount = 0;
      for(double element : values) {
         if(element < 0) {
            negativeCount++;
         }
      }
      System.out.println("Negative elements count: " + negativeCount);
   }
}
