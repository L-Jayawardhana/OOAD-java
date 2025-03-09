import java.util.Arrays;
public class arrays{
    public static void main(String[] args){
       String[] names = {"nimal", "kamal", "sumal", "bimal"};
       System.out.println(names[0]); 

       //replace the array first member with wimal
        names[0] = "wimal";
        System.out.println(names[0]);

        //get the length of the array
        int length = names.length;
        System.out.println(length);

        //sort the array in ascending order
        Arrays.sort(names);
        for (int i = 0 ; i < names.length ; i++){
            System.out.printf("%s ", names[i]);
        }
    
        System.out.println("");

        //array fills with specific member "namal"
        Arrays.fill(names, "namal");
        for (int i = 0 ; i < names.length ; i++){
            System.out.printf("%s ", names[i]);
        }

        System.out.println("");
        
        //another method for pritning the array members using for loop
        for (String name : names){
            System.out.printf("%s ", name);
        }


    }
}