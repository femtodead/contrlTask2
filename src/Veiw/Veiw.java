package Veiw;

import java.util.ArrayList;
import java.util.Scanner;

import Model.LootBox;

public class Veiw {
    Scanner in;
    
    public Veiw() {
        this.in = new Scanner(System.in);
    }

    public int Scaner(){
        this.in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        return num;
    } 

    public void Sclose(){
        in.close();
    }

    public int menu(){
        System.out.println("Добро пожаловать в интернет магазин выберите один из пунктов ниже \n 1. Посмотреть ассортимент \n 2. Посмотреть козину \n 3. Попытать удачу \n 4. Офомить заказ \n 5. Забрать заказ \n 6. Выход");
        return Scaner();
    }

    public int as (ArrayList<String> rangeListToy, String text){
        System.out.println(text + "\n");
        for (int i = 0; i < rangeListToy.size(); i++) {
            System.out.println((i+1)+". "+ rangeListToy.get(i));
        }
        System.out.println("\n"+(rangeListToy.size()+1)+". Выход");

        return Scaner();
    }


    public int Confirmation(String text){
        System.out.println(text + "\n1. Да\n2. Нет");
        return Scaner();
    }

    public int lBoxAs (ArrayList<LootBox> rangeListLootBox){
        System.out.println("Наши lootboxы: " + "\n");
        for (int i = 0; i < rangeListLootBox.size(); i++) {
            System.out.println((i+1)+". "+ rangeListLootBox.get(i).toString());
        }
        System.out.println("\n"+(rangeListLootBox.size()+1)+". Выход");

        return Scaner();
    } 
    
}
