package Controller;


import java.util.ArrayList;
import java.util.Scanner;

import Model.LootBox;
import Model.OnlineStore;
import Model.ToyLootBox;
import Veiw.Veiw;

public class Controller {
    OnlineStore model;
    Veiw veiw;
    public Controller(OnlineStore model, Veiw veiw) {
        this.model = model;
        this.veiw = veiw;
    }

    public void run()
    {
        this.model.getWebsite().addRangeToy(this.model.getStosk().getToys());
        while (true) {
            switch (this.veiw.menu()) {
                case 1:
                
                        int num = this.veiw.as(model.getWebsite().getRangeListToy(), "Наш ассортимент: ");
                        
                        if (num > model.getWebsite().getRangeListToy().size()){
                            break;
                        }
                        else{
                            if (this.veiw.Confirmation("Добавить в корзину?") == 1)
                            {
                                model.getWebsite().addBasket(num-1);
                            }
                            break;
                        }
                    
                case 2:
                    if (this.veiw.as(this.model.getWebsite().getBasket(), "Ваша корзина") > this.model.getWebsite().getBasket().size())
                    {
                        this.veiw.menu();
                    }                  
                    break;
                case 3:
                    
                        int num2 = this.veiw.lBoxAs(model.getWebsite().getRangeListLootBox());
                                           
                        if (num2 > model.getWebsite().getRangeListLootBox().size()){
                            break;
                        }
                        else{
                            if (this.veiw.Confirmation("Открыть контейнер?") == 1)
                            {   
                                LootBox box = this.model.getWebsite().getRangeListLootBox().get(num2-1);
                                ToyLootBox numToy = box.openBox();
                                model.getWebsite().addBasket(Integer.parseInt(numToy.getId()));
                                System.out.println("Ваш приз добавлен в козину");
                            }
                            break;
                        }
                        
                        
                                     
                case 4:
                    String numberOr = this.model.getWebsite().creaitOrder(this.model.getWebsite().getBasket());
                    ArrayList<String> id = this.model.getWebsite().getIdBasket();

                    for (String string : id) {

                        String col = this.model.getStosk().getToys().get(string).get(1);
                        this.model.getStosk().getToys().get(string).remove(1);
                        int temp = Integer.parseInt(col);
                        temp = temp - 1;
                        this.model.getStosk().getToys().get(string).add(1, Integer.toString(temp));
                    }
                    this.model.getStosk().addToysHash();
                    System.out.println("Ваш заказ оформлен его номер: " + numberOr);
                    this.model.getPointOfIssue().addOrder(numberOr, this.model.getWebsite().getBasket());
                    this.model.getWebsite().clearBasket();
                    break;
                    
                case 5:
                    Scanner in = new Scanner(System.in);
                    System.out.print("Введите номер заказа: ");
                    String Str = in.nextLine();
                    in.close();
                    System.out.println("Спасибо за покупку");
                    this.model.getPointOfIssue().delOrder(Str);
                    return;
    
                case 6:
                    return;
                default:
                    break;
            }
        }
    }
}
