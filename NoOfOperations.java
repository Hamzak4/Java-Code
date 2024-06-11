import java.util.Scanner;

public class NoOfOperations {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Prompt user for input
    System.out.print("Enter the first number: ");
    int num1 = scanner.nextInt();
    System.out.print("Enter the second number: ");
    int num2 = scanner.nextInt();

    // Calculate average
    double average = (double) (num1 + num2) / 2;

    // Initialize variables for sums
    int sumEven = 0;
    int sumSquares = 0;

    // Iterate from num1 to num2 (inclusive)
    for (int num = num1; num <= num2; num++) {
      // Add even numbers
      if (num % 2 == 0) {
        sumEven += num;
      }
      // Add squares
      sumSquares += num * num;
    }

    // Print the results
    System.out.println("Average: " + average);
    System.out.println("Sum of even numbers: " + sumEven);
    System.out.println("Sum of squares: " + sumSquares);
  }
}
