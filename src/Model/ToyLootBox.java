package Model;


public class ToyLootBox extends Toy{
    double dropRate;
    
    public ToyLootBox(Toy toylb, double dropRate) {
        super(toylb.getName(), toylb.getQuantity(), toylb.getId());
        this.dropRate = dropRate;
    }

    public double getDropRate() {
        return dropRate;
    }

    public void setDropRate(double dropRate) {
        this.dropRate = dropRate;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
