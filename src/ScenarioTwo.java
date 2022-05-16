import java.util.ArrayList;
import java.util.Scanner;

public class ScenarioTwo {
    public static void main(String[] args) {
        int count, i;

        float sum = 0, mean;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number of Elements");
        count = input.nextInt();

        System.out.println("Enter " + count + " Elements");
        for (i = 0; i < count; i++) {
            sum += input.nextInt();
        }mean = sum / count;

        System.out.println("Mean : " + mean);

    }
}
