public class variables {
    //global variable
    //this can be use in class
    static int x = 12;

    public static void main(String[] args) {
        //local variables
        //can be use in this objective only
        int  a=10;

        System.out.printf("value of a is %d\n",a );

        anotherLocalVariable();
        anotherLocalVariable2();
    }
    public static void anotherLocalVariable(){
        //local variables in another function
        int b=60;
        System.out.printf("value of b is %d\n",b );
    }
    public static void anotherLocalVariable2(){
        System.out.printf("valus of x is %d",x );
    }
}



