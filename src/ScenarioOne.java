import java.util.Scanner;

public class ScenarioOne {
        public static void main(String[] args) {


                int num;
                int sum = 0;
                int evenCount = 0;
                int oddCount = 0;
                int evenSum = 0;
                int oddSum = 0;
                while (true) {
                        System.out.println("Enter numeric value: ");
                        Scanner input = new Scanner(System.in);
                        num = input.nextInt();

                        if (num == 0) {
                                break;
                        } else if (num < 1) {
                                continue;
                        } else if (num % 2 == 0) {
                                evenCount += 1;
                                evenSum += num;
                        } else {
                                oddCount += 1;
                                oddSum += num;
                        }
                        sum += 1;
                }
                System.out.println("Sum of odds:" +oddSum);
                System.out.println("Sum of evens:" +evenSum);
                System.out.println("Even count:" +evenCount);
                System.out.println("Odd count:" +oddCount);
                System.out.println("Total positive int count:"+ sum);


        }


}
