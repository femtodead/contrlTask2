package Model;

import java.util.ArrayList;
import java.util.HashMap;

public class PointOfIssue {
    HashMap<String, ArrayList<String>> listOrder;

    public PointOfIssue() {
        this.listOrder = new HashMap<>();
    }

    public void addOrder(String number, ArrayList<String> order){
        this.listOrder.put(number, order);
    }

    public void delOrder(String number){
        this.listOrder.remove(number);
    }
    
}
