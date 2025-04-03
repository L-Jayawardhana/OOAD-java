public class Main16 {
    public static void main(String[] args) {
        // Wrapper classes = Allow primitive values (int ,  char , double , boolean)
        //                   to be used as objects. "Wrap them in an object"
        //                   Generally, don't wrap primitive unless you need an object.
        //                   Allow use of Collection Framework and static Utility Methods.

        // Autoboxing
        Integer a = 123;
        Double b = 123.45;
        Character c = '$';
        Boolean d = true;

        // Unboxing //object back to its primitive
        int x =  a;
        double y = b;
        char z = c;
        boolean w = d;

        // convert data types to string
        String p = Integer.toString(123);
        String q = Double.toString(3.14);
        String r = Character.toString('$');
        String s = Boolean.toString(true);

        String t = p + q + r + s;
        System.out.println(t);

        // convert strings to data types
        int h = Integer.parseInt("123");
        double i = Double.parseDouble("3.14");
        char j = "Pizza".charAt(0);
        boolean k = Boolean.parseBoolean("true");

        // another useful operators using wrapper classes
        char letter = 'b';
        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));

        System.out.println();

        char letter1 = '$';
        System.out.println(Character.isLetter(letter1));
        System.out.println(Character.isUpperCase(letter1));

    }
}
