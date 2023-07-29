package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Stock {
    HashMap<String,List<String>> toys;

    public Stock() {
        try {
            File file = new File("BD.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            HashMap<String,List<String>> toysTemp = new HashMap<>();
            while (line != null) {
                String[] lineList = line.split(" ");
                List<String> list = new ArrayList<>();
                list.add(0, lineList[1]);
                list.add(1, lineList[2]);
                toysTemp.put(lineList[0], list);
                line = reader.readLine();
            }
            this.toys = toysTemp;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void addToy(Toy toy){
        List<String> list = new ArrayList<>();
        list.add(0,toy.getName());
        list.add(1,toy.getQuantity());
        this.toys.put(toy.getId(), list);
                try(FileWriter fw = new FileWriter("BD.txt", false))
        {
            for(Map.Entry<String,List<String>> item :  this.toys.entrySet())
            {
           
                         
            fw.write(item.getKey() +" "+ item.getValue().get(0)+" "+ item.getValue().get(1));
            fw.append('\n');
                

            }    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

        public void addToysHash(){
            try(FileWriter fw = new FileWriter("BD.txt", false))
        {
            for(Map.Entry<String,List<String>> item :  this.toys.entrySet())
            {
           
                         
            fw.write(item.getKey() +" "+ item.getValue().get(0)+" "+ item.getValue().get(1));
            fw.append('\n');
                

            }    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Stock [toys=" + toys.toString() + "]";
    }

    public HashMap<String, List<String>> getToys() {
        return toys;
    }
}
