public class Main3 {
    public static void main(String[] args){
        Cars car1 = new Cars("Mustang" , "red");
        Cars car2 = new Cars("Challenger" , "black");
        Cars car3 = new Cars("Porsche" , "gray");

        // create an array using objects
        Cars[] cars = {car1 , car2 , car3};

        //print array members using for loop
        for (Cars car : cars){
            car.Print();
        }

        System.out.println();
        //or u can directly crete objects inside the car array
        Cars[] cars1 = {new Cars("Maserati" , "yellow") ,
                        new Cars("Cadillac" , "white"),
                        new Cars("BMW" , "blue")};

        for (Cars car : cars1){
            car.Print();
        }

        System.out.println();
        Cars[] cars2 = {new Cars("Benz" , "purple") ,
                new Cars("Toyota" , "green"),
                new Cars("Nissan" , "orange")};

        // if we edit the object's attributes after assign it will store latest assign
        for (Cars car : cars2){
            car.color = "silver";
            car.Print();
        }
    }
}
