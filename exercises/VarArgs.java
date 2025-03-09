public class VarArgs {
    public static void main(String[] args){
        //varargs = allows a method to accept a varying # ofarguments
        //          makes methods more flexible, no need for overload methods
        //          java will pack the arguments in to an array
        //          ...(ellipsis)

        //no need of seperate arguments .
        //variable atgument is enough for that.
        //it will automatically adjust the length of parameters
        //no need of change name of the parameter

        //get the average of some numbers
        System.out.println("average is "+ average(1,2,3,4));
    }
    static double average(double... numbers){
        double sum = 0 ;
        for (double number : numbers){
            sum += number;
        }
        double avg = sum / numbers.length;
        return avg;
    }
}
