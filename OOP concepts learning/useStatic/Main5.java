public class Main5 {
    public static void main(String[] args){

        // static = Makes a variable or method belong to the class
        //          rather than to any specific object
        //          commonly used for utility methods or shared resources


        Friends friend1 = new Friends("Nimal");
        Friends friend2 = new Friends("Wimal");
        Friends friend3 = new Friends("Bimal");
        Friends friend4 = new Friends("Namal");
        Friends friend5 = new Friends("Sumal");

        // since noOfFriends is a static in the Friends class
        //      we don't have to call using object name such like
        //      friend1.noOfFriend
        //      we can call directly using class name Friends

        System.out.println(Friends.noOfFriends);
    }
}
