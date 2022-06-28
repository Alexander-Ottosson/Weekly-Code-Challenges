import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class SherlockSquares {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean isInvalid = true;
        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;
        do {
            try {
                System.out.print("Minimum Value: ");
                minValue = Integer.parseInt(reader.readLine());
                isInvalid = false;
            } catch (IOException e) {
                System.out.println("IOException, please try again");
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input, please try again");
            }
        } while (isInvalid);

        isInvalid = true;
        do {
            try {
                System.out.print("Maximum Value: ");
                maxValue = Integer.parseInt(reader.readLine());
                if (maxValue < minValue) {
                    System.out.println("Number cannot be smaller than the minimum value");
                }
                isInvalid = false;
            } catch (IOException e) {
                System.out.println("IOException, please try again");
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input, please try again");
            }
        } while (isInvalid);

//        int[] squares = getSquares(minValue, maxValue);
//        System.out.printf("Amount of Squares: %o%n", squares.length);
        System.out.println(getNumOfSquares(minValue, maxValue));
    }

    private static int getNumOfSquares(int min, int max) {
        int squareCount = 0;
        int iterations = 1;
        while (true) {
            int amountSquared = iterations * iterations;
            if (amountSquared > max) {
                break;
            } else if (amountSquared >= min) {
                ++squareCount;
            }
            ++iterations;
        }
        return squareCount;
    }
}
