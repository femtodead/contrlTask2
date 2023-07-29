package Model;




public class Toy {
    String id;
    String name;
    String quantity;
    public Toy(String name, String quantity, String id) {
        this.name = name;
        this.quantity = quantity;
        this.id = id;    
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getQuantity() {
        return quantity;
    }
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return "[" + name + "]";
    }

}
