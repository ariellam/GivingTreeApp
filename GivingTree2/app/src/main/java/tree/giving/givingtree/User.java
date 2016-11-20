package tree.giving.givingtree;

import java.util.ArrayList;

public class User {
    String username;
    String password;
    String firstName;
    String lastName;
    int karma = 25; // 0-50
    ArrayList requests = new ArrayList();

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getKarma(){
        return karma;
    }

    public ArrayList getRequests() {
        return requests;
    }

    public void putFirstName(String first){
        firstName = first;
    }

    public void putLastName(String last){
        lastName = last;
    }

    public void putKarma(int k){
        karma = k;
    }
    public void addRequest(ArrayList newReq){
        requests.add(newReq);
    }
}
