public class TWOdArrays {
    public static void main(){
        // 2D array - An array where each element is an array
        //              useful for storing a metrix of data

        String[] vegetables = {"carrot" , "beans" , "potato"};
        String[] fruits = {"apple" , "orange" , "strawberry"};
        String[] meats = {"chicken" , "pork" , "beef"};

        String[][] groceries = {vegetables,fruits,meats};

        //print using for loop
        for (String[] foods : groceries){
            for (String food : foods){
                System.out.print(food + " ");
            }

        }

    }
}
