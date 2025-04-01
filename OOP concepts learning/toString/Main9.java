public class Main9 {
    public static void main(String[] args) {

        //.toString() = Method inherited from the Object class.
        //              used to return a string representation of an object
        //              By default, it returns a hash code as a unique identifier
        //              It can be overridden to provide meaningful details.

        Car_S car1 = new Car_S("Ford" , "Mustang" , 2024 , "red");
        Car_S car2 = new Car_S("Porsche" , "gt3 RS" , 2025 , "grey");
        Car_S car3 = new Car_S("Maserati" , " quateraporte" , 2024 , "white");
        Car_S car4 = new Car_S("Toyota" , "Supra" , 2024 , "white");
        Car_S car5 = new Car_S("Nissan" , "GTR" , 2023 , "blue");

        // when directly assign the object name with out a overriding
        // it will print the hash code of that memory location

        // with the toString Overriding it will return the string
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
    }
}
