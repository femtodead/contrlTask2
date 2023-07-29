package Model;

import java.util.ArrayList;
import java.util.Random;

public class LootBox {
    String name;
    ArrayList<ToyLootBox> listToyLb;

    public LootBox(String name,ToyLootBox toi0, ToyLootBox toi1, ToyLootBox toi2, ToyLootBox toi3, ToyLootBox toi4) {
        double allDropRate = toi0.getDropRate() + toi1.getDropRate() + toi2.getDropRate() + toi3.getDropRate() + toi4.getDropRate();
        if (allDropRate > 100.0)
        {
            double temp = (allDropRate-100.0)/5;
            toi0.setDropRate(toi0.getDropRate()-temp);
            toi1.setDropRate(toi1.getDropRate()-temp);
            toi2.setDropRate(toi2.getDropRate()-temp);
            toi3.setDropRate(toi3.getDropRate()-temp);
            toi4.setDropRate(toi4.getDropRate()-temp);
        }
        ArrayList<ToyLootBox> listToyLb = new ArrayList<>();
        listToyLb.add(toi0);
        listToyLb.add(toi1);
        listToyLb.add(toi2);
        listToyLb.add(toi3);
        listToyLb.add(toi4);
        this.listToyLb = listToyLb;
        this.name = name;
    }

    public void addToy(ToyLootBox toi)
    {
        double temp = toi.getDropRate()/ this.listToyLb.size()+1;
        listToyLb.add(toi);
        for (int i = 0; i < this.listToyLb.size(); i++) {
            this.listToyLb.get(i).setDropRate(listToyLb.get(i).getDropRate()-temp);
        }
    }


    public ToyLootBox openBox(){
        Random random = new Random();
        int num = random.nextInt(100);
        double num2 = random.nextInt(100);
        while (true) {
            if (num2 <3 )
            {
                break;
            }
            else
            {
                num2 = num2/10;
            }
        }
        double finalNum = num + num2;
        double temp = 100/this.listToyLb.size();
        double index = finalNum/temp;
        return this.listToyLb.get((int) index);
    }

    @Override
    public String toString() {
        return this.name +" "+ listToyLb.toString();
    }
    
}
