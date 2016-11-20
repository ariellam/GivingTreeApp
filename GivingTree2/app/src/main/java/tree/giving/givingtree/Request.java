package tree.giving.givingtree;

public class Request {
    String itemString;
    String recipientString;

    public Request(String i, String r){

    }
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

