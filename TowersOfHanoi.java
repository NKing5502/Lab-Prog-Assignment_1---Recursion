import java.util.Scanner; 

public class TowersOfHanoi {
  // This is the Main method
public static void main(String[] args) {
    try (// Creates a Scanner
    Scanner input = new Scanner(System.in)) {
        System.out.print("Enter number of disks: ");
        int n = input.nextInt();

        // Finds the solution recursively
        System.out.println("The moves are:");
        moveDisks(n, 'A', 'B', 'C');
    }
  }
  
  public static void moveDisks(int n, char fromTower,
      char toTower, char auxTower) {
    if (n == 1) // Stopping condition
      System.out.println("Move disk " + n + " from " +
        fromTower + " to " + toTower);
    else {
      moveDisks(n - 1, fromTower, auxTower, toTower);
      System.out.println("Move disk " + n + " from " +
        fromTower + " to " + toTower);
      moveDisks(n - 1, auxTower, toTower, fromTower);
    }
  }
}
