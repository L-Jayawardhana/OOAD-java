public class stringuses {
    public static void main(String[] args){
        String name = "Lakdinu Jayawardhana";

        int length = name.length();
        System.out.println(length);

        char letter = name.charAt(0);
        System.out.println(letter);

        int index = name.indexOf("a");
        System.out.println(index);

        int lastindex = name.lastIndexOf("a");
        System.out.println(lastindex);

        String name1 = name.toUpperCase();
        System.out.println(name1);

        String name2 = name.toLowerCase();
        System.out.println(name2);

        //check ad clear front and end spaces
        String namespace = "   Lakdinu Jayawardhana   ";
        String name3 = namespace.trim();
        System.out.println(name3);

        String name4 = name.replace("a" , "o");
        System.out.println(name4);

        //check the created string is empty . we can use also it in the print statement
        if(name.isEmpty()){
            System.out.println("empty");
        } else  {
            System.out.println("not empty");
        }

        //check the character in the String(name)
        if (name.contains(" ")){
            System.out.println("space in the name");
        }else {
            System.out.println("space not in the name");
        }

        //check the given string in the name
        if (name.equals("Lakdinu Jayawardhana")){
            System.out.println("name matched");
        }else{
            System.out.println("name not matched");
        }

        //Sub string method
        //in use of this function we can get substring of a string
        String email = "lakdinurameshjayawardhana@gmail.com";

        //using this index method we can choose relevant string length
        String user_name = email.substring(0 , 12);
        System.out.println(user_name);

        //we can use Index function to get sub string using particular character.
        String user_name_1 = email.substring(0 , email.indexOf("@"));
        String domain = email.substring(email.indexOf("@") + 1);// this get string after '@' character
    }
}
