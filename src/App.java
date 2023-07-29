

import Controller.Controller;
import Model.LootBox;
import Model.OnlineStore;
import Model.PointOfIssue;
import Model.Stock;
import Model.Toy;
import Model.ToyLootBox;
import Model.Website;
import Veiw.Veiw;

public class App {
    public static void main(String[] args) throws Exception {
        Stock stock = new Stock();
        Website site = new Website();
        PointOfIssue poi = new PointOfIssue();
        OnlineStore os = new OnlineStore(stock, site, poi);
        Veiw veiw = new Veiw();
        Controller controller = new Controller(os, veiw);
        Toy fox = new Toy("Лиса", "100", "1");
        stock.addToy(fox);
        Toy blackfox = new Toy("ЛисаЧерная", "100", "2");
        stock.addToy(blackfox);
        Toy bear = new Toy("Медведь", "100", "3");
        stock.addToy(bear);
        Toy bear1 = new Toy("Медведь1", "100", "4");
        stock.addToy(bear1);
        Toy bear2 = new Toy("Медведь2", "100", "5");
        stock.addToy(bear2);
        Toy bear3 = new Toy("Медведь3", "100", "6");
        stock.addToy(bear3);
        ToyLootBox tl1 = new ToyLootBox(fox, 20);
        ToyLootBox tl2 = new ToyLootBox(blackfox, 20);
        ToyLootBox tl3 = new ToyLootBox(bear, 20);
        ToyLootBox tl4 = new ToyLootBox(bear1, 20);
        ToyLootBox tl5 = new ToyLootBox(bear2, 20);
        LootBox lb = new LootBox("lb", tl1, tl2, tl3, tl4, tl5);
        site.addRangeListLootBox(lb);
        controller.run();
        System.out.println(stock.toString()); 
    }

}
