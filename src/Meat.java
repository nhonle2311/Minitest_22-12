import java.time.LocalDate;

public class Meat extends Material{
    private double weight;

    public Meat(){
    }

    public Meat(double weight) {
        this.weight = weight;
    }

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    @Override
    double getAmount() {
        return getCost()*this.weight;
    }

    @Override
    LocalDate getExpiryDate() {
        return this.getManufacturingDate().plusDays(7);
    }

    @Override
    public String toString() {
        return "Meat{" + super.toString()+
                "weight=" + weight +
                '}';
    }
}
