import java.util.*;

public class ScenarioThree {
    public static void main(String[] args) {

        ArrayList<String> groceryList = new ArrayList<String>();
        Scanner input = new Scanner(System.in);

        System.out.println("What would you like to add to the list?");
        String food = input.nextLine().toLowerCase();

        while (!food.equals("stop")) {
            groceryList.add(food);

            System.out.println("What would you like to add to the list?");
            food = input.nextLine();
        }
        System.out.println("Size of list = " + groceryList.size());

        System.out.println("Input list:-\n" + groceryList);

        Collections.sort(groceryList);
        for(int i=0; i<groceryList.size(); i++)
            System.out.println("sorted: " +groceryList.get(i));


    }
}