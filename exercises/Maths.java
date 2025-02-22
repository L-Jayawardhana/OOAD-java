public class Maths {
    public Maths() {
    }

    public static void main(String[] args){
        double num1,num2,num3,num4,num5,num6,num7,num8,num9,num10 ;

        num1 = Math.PI; //print value of pi (3.1415)
        num2 = Math.E; //print value of exponent (2.7182)
        num3 = Math.pow(2,3); //print 2 to the power 3 (8)
        num4 = Math.abs(-7); //print absolute value (7)
        num5 = Math.sqrt(16); //print square root (4)
        num6 = Math.round(3.14); //print the nearest integer to the value (3)
        num7 = Math.ceil(3.14); //print the upper integer to the value (4)
        num8 = Math.floor(3.78); //print the lower integer tt the value (3)
        num9 = Math.min(23,2); //print the minimum value (2)
        num10 = Math.max(23,2); //print the maximum value (23)

        System.out.println(num1);
        System.out.printf("%.2f\n" , num1); //we can limit decimal points by using printf function instead of println or print
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
        System.out.println(num8);
        System.out.println(num9);
        System.out.println(num10);
    }
}
