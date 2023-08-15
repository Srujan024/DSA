package Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class GraphicalMethod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of constraints: ");
        int n = scanner.nextInt();

        List<List<Double>> constraints = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Double> constraint = new ArrayList<>();
            for (int j = 0; j < 2; j++) {
                constraint.add(scanner.nextDouble());
            }
            constraints.add(constraint);
        }

        System.out.println("Enter the objective function: ");
        List<Double> objectiveFunction = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            objectiveFunction.add(scanner.nextDouble());
        }

        // Plot the constraints
        for (List<Double> constraint : constraints) {
            double x1 = constraint.get(0);
            double x2 = constraint.get(1);

            // Check if the first point is valid
            if (objectiveFunction.get(0) * x1 + objectiveFunction.get(1) * x2 <= 0) {
                System.out.println("The problem has no solution.");
                return;
            }

            // Plot the line
            System.out.println("(" + x1 + ", " + x2 + ")");
            System.out.println("(" + x2 + ", " + x1 + ")");
        }

        // Find the optimal point
        double minValue = Double.MAX_VALUE;
        List<Double> optimalPoint = null;
        for (int i = 0; i < 100; i++) {
            double x = i;
            double y = -objectiveFunction.get(0) / objectiveFunction.get(1) * x;

            if (objectiveFunction.get(0) * x + objectiveFunction.get(1) * y <= 0) {
                if (minValue > x + y) {
                    minValue = x + y;
                    optimalPoint = new ArrayList<>();
                    optimalPoint.add(x);
                    optimalPoint.add(y);
                }
            }
        }

        // Print the optimal point
        if (optimalPoint != null) {
            System.out.println("The optimal point is (" + optimalPoint.get(0) + ", " + optimalPoint.get(1) + ").");
        } else {
            System.out.println("The problem has no solution.");
        }
    }
}