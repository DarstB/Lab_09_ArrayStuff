import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        // defining/declaring variables
        int[] dataPoints = new int[100];
        double sum = 0;
        double average;
        int userNum;
        int counter = 0;
        boolean found = false;

        // inputting random values into the array
        for (int i = 0; i < dataPoints.length; i++) {
            int randomVal = rnd.nextInt(100) + 1;
            dataPoints[i] = randomVal;
        }

        // defining min and max for later
        int max = dataPoints[0];
        int min = dataPoints[0];

        // outputting the array values
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.printf("%-2d | ", dataPoints[i]);
        }
        System.out.println();

        // summing the array
        for (int num : dataPoints) {
            sum += num;
        }

        // getting the average of the array
        average = sum / dataPoints.length;

        System.out.println("The sum of the array is: " + sum);
        System.out.println("The average of the array is " + average);

        // checking to see if the user's number appears in the array and the amount of times it is shown
        userNum = SafeInput.geRangedInt(in, "Enter an int between ", 1, 100);

        for (int i = 0; i < dataPoints.length; i++) {
            if (userNum == dataPoints[i]) {
                counter += 1;
            }
        }

        System.out.println("The number " + userNum + " appears " + counter + " times.");

        // checking to see if the user's number is in the array, and then outputting the index number
        userNum = SafeInput.geRangedInt(in, "Enter another int between ", 1, 100);

        for (int i = 0; i < dataPoints.length; i++) {
            if (userNum == dataPoints[i]) {
                System.out.println("The number " + userNum + " first appears at index " + i);
                found = true;
                break;
            }
        }

        // if the num couldn't be found
        if (!found) {
            System.out.println("The number " + userNum + " could not be found in the array");
        }

        // getting the min and max of the array
        for (int i = 0; i < dataPoints.length; i++) {
            if (min < dataPoints[i]) {
                min = dataPoints[i];
            }
            if (max > dataPoints[i]) {
                max = dataPoints[i];
            }
        }

        // outputting min and max
        System.out.println("The minimum value in the array is " + min);
        System.out.println("The maximum value in the array is " + max);

        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

    public static double getAverage(int values[]) {
        double secondAve = 0;
        double sum = 0;

        // summing the array
        for (int num : values) {
            sum += num;
        }

        // getting the average of the array
        secondAve = sum / values.length;

        return secondAve;
    }
}