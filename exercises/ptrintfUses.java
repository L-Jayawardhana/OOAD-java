public class ptrintfUses {
    public static void main(String[] args){
        //printf function is use to format outputs

        //we can print outputs using one printf instead pf several print s
        String name = "Lakdinu";
        int age = 22;
        System.out.printf("hi %s you are %d years old\n", name , age);

        //we can limit decimal points of doubles using printfs
        double value = Math.PI;
        System.out.println("value of pi is \n" + value);
        System.out.printf("value of pi is %.2f\n" , value);

        //we can adjust width of numbers using printfs
        //0 to zero padding
        //positive numbers to right justified padding
        //negative numbers to left justified padding
        int num1 = 1 ;
        int num2 = 12;
        int num3 = 123;
        int num4 = 1234;
        System.out.printf("%4d\n" ,num1);
        System.out.printf("%4d\n" ,num2);
        System.out.printf("%4d\n" ,num3);
        System.out.printf("%4d\n" ,num4);

    }
}
