package tree.giving.givingtree;

/**
 * Created by 16031 on 2016-11-20.
 */

public class Request {
    String itemString;
    String recipientString;

    public void putItemString(String item){
        itemString = item;
    }
    public void putRecipientString(String recipient){
        recipientString = recipient;
    }
    public String getItemString(){
        return itemString;
    }
    public String getRecipientString() {
        return recipientString;
    }
}

