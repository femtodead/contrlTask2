package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Website {
    ArrayList<String> rangeListToy;
    ArrayList<String> rangId;
    ArrayList<String> idBasket;
    ArrayList<String> basket;
    ArrayList<LootBox> rangeListLootBox;
    
    
    public Website() {
        this.rangeListLootBox = new ArrayList<>();
        this.basket = new ArrayList<>();
        this.rangeListToy = new ArrayList<>();
        this.idBasket = new ArrayList<>();
        this.rangId = new ArrayList<>();
    }

    public void addRangeToy (HashMap<String,List<String>> toys){
        for (Map.Entry<String,List<String>> item :  toys.entrySet()) {
            this.rangeListToy.add(item.getValue().get(0));
            this.rangId.add(item.getKey());
        }
    }
    
    public void addBasket (int indx){
        basket.add(rangeListToy.get(indx));
        this.idBasket.add(Integer.toString(indx+1));
    }

    public void addRangeListLootBox (LootBox box){
        this.rangeListLootBox.add(box);
    }

    public String creaitOrder (ArrayList<String> basket){
        String numOrder = Integer.toString(basket.size());
        String temp = "";
        for (String string : basket) {
            temp = temp + Integer.toString(string.length());
        }
        numOrder = numOrder +temp;
        return numOrder;
    }

    public void clearIdBasket(){
        this.idBasket = new ArrayList<>();
    }

    public void clearBasket (){
        this.basket = new ArrayList<String>();
    }

    public ArrayList<String> getRangeListToy() {
        return rangeListToy;
    }

    public ArrayList<String> getBasket() {
        return basket;
    }

    public ArrayList<LootBox> getRangeListLootBox() {
        return rangeListLootBox;
    }

    public void setRangeListToy(ArrayList<String> rangeListToy) {
        this.rangeListToy = rangeListToy;
    }

    public ArrayList<String> getRangId() {
        return rangId;
    }

    public void setRangId(ArrayList<String> rangId) {
        this.rangId = rangId;
    }

    public ArrayList<String> getIdBasket() {
        return idBasket;
    }

    public void setIdBasket(ArrayList<String> idBasket) {
        this.idBasket = idBasket;
    }

    public void setBasket(ArrayList<String> basket) {
        this.basket = basket;
    }

    public void setRangeListLootBox(ArrayList<LootBox> rangeListLootBox) {
        this.rangeListLootBox = rangeListLootBox;
    }

}
