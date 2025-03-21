import java.util.ArrayList;

public class ManageMembers {
    protected ArrayList<ArrayList<String>> members;

    public ManageMembers() {
        members = new ArrayList<>();
    }

    // add members
    public void addMember(String name , String ID) {
        ArrayList<String> memberDetails = new ArrayList<>();
        memberDetails.add(name);
        memberDetails.add(ID);
        memberDetails.add("NONE");
        members.add(memberDetails);
    }
    // check the member is registered or not
    public ArrayList<String> findMemberByID(String ID) {
        for (ArrayList<String> member : members) {
            if (member.get(1).equals(ID)) {
                return member;
            }
        }
        return null;
    }

    // search members and print details if found
    public void searchMember(String ID) {
        ArrayList<String> member = findMemberByID(ID);
        if (member != null) {
            // Print member details
            System.out.println("Member Found");
            System.out.println("Member ID: " + member.get(1) + " | Member Name: " + member.get(0) + " | Borrowed Books: " + member.get(2));
        } else {
            System.out.println("Member ID does not exist");
        }
    }
}
