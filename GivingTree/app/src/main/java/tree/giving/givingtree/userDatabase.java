package tree.giving.givingtree;

import java.util.ArrayList;

/**
 * Created by 16031 on 2016-11-20.
 */

public class userDatabase {
    ArrayList<User> users = new ArrayList<User>();
    User u1 = new User("superman", "password", "Clark", "Kent", 5);
    User u2 = new User("wonderwoman", "password", "Diana", "Prince", 15);
    User u3 = new User("batman", "password", "Bruce", "Wayne", 25);
    User u4 = new User("JD", "password", "Jane", "Doe", 19);
    public userDatabase(){
        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
    }
    public User getUser(int i){
        return users.get(i);
    }
}
