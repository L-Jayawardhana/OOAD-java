public class Friends {
    static int noOfFriends;
    String name;

    Friends(String name){
        this.name = name;
        noOfFriends++;
    }

    //since noOfFriends is static we don't have to call using this.noOfFriends
    //we can directly call using variable name
    void friendsCount(){
        System.out.println("you have " + noOfFriends + " friends");
    }
}
