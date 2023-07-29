

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
        Stock stock = new Stock(); // создаем склад
        Website site = new Website();// создаем сайт
        PointOfIssue poi = new PointOfIssue();// создаем пункт выдачи
        OnlineStore os = new OnlineStore(stock, site, poi); // создаем интернет магазин
        Veiw veiw = new Veiw();// создаем вьюшку
        Controller controller = new Controller(os, veiw);//  создаем контроллер
        Toy fox = new Toy("Лиса", "100", "1");//  создаем игрушки и добавляем их на склад
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
        ToyLootBox tl1 = new ToyLootBox(fox, 20); //  создаем игрушки для лутбоксов это класс ребенок добавляется вес
        ToyLootBox tl2 = new ToyLootBox(blackfox, 20);
        ToyLootBox tl3 = new ToyLootBox(bear, 20);
        ToyLootBox tl4 = new ToyLootBox(bear1, 20);
        ToyLootBox tl5 = new ToyLootBox(bear2, 20);
        LootBox lb = new LootBox("lb", tl1, tl2, tl3, tl4, tl5);//  добавляем их в лутбокс - сам лутбокс контролирует чтобы общий вес игрушек не превышал 100% и их кол-во не было ниже 5
        // при этом также в классе присутствует функция добавления игрушки в лутбокс при этом он будет пересчитывать вес каждой игрушки чтобы получилась 100% 
        // по хорошому не вижу смысла в данном параметре, я бы сделал возможность утаноовки веса при создание или добавление в лутбокс игрушек так проще и правильней на мой взгляд
        site.addRangeListLootBox(lb);// добавил лут бокс в ассортимент он под цифрой 3. в меню
        controller.run();// ну и запуск контроллера 
        System.out.println(" "+stock.toString()); // вот это для проверки файла в зависимости от наброного в карзину товара или добавленого посредством открывани лут бокса а после оформления заказа 
        // вычитает из позиций количиство

        // если честно можно добавить еще уйму чего, цены, кошелек, защиту от дураков, несколько магазинов, курьерскую службу и т.д. но я решил оставить пока так, а то ни когда не сдам работу
        // P.S. иногда сканер почему-то игнорирует ввод может быть это у меня так но будьте внимательны
        
    }

}
