public class TWOdArrays {
    public static void main(String[] args){
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
            System.out.println();
        }

        System.out.println();
        System.out.println();

        //we can also input members direct in to 2D array
        char[][] numbers = {{'1' , '2' , '3'},
                            {'4' , '5' , '6'},
                            {'7' , '8' , '9'},
                            {'*' , '0' , '#'}};

        for (char[] row : numbers){
            for (char character : row){
                System.out.print(character + "  ");
            }
            System.out.println();
        }
    }
}
