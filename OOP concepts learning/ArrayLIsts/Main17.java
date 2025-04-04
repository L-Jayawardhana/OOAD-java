import java.util.ArrayList;
import java.util.Collections;

public class Main17 {
    public static void main(String[] args) {

        // ArrayLists = A resizeable array that stores objects (autoboxing)
        //              Arrays are fixed in size, but ArrayLists can change.

        ArrayList<String> foods = new ArrayList<>();

        // add array elemnts
        foods.add("Apple");
        foods.add("Banana");
        foods.add("Cheese");
        foods.add("Pineapple");

        System.out.println(foods); //print array

        // remove array elements
        foods.remove(0);
        System.out.println(foods);

        System.out.println();

        //print using for loop
        for (String food : foods) {
            System.out.println(food);
        }
        System.out.println();

        // get specific array element
        System.out.println(foods.get(0));
        System.out.println(foods.get(1));

        System.out.println();
        // modify specific array element
        System.out.println(foods.set(1 , "Orange"));
        System.out.println(foods);

        System.out.println();

        // sort in ascending order
        Collections.sort(foods);
        System.out.println(foods);

        // sort in descending order
        Collections.reverse(foods);
        System.out.println(foods);
    }
}
