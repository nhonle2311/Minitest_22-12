import java.time.LocalDate;

public class CrispyFlour extends Material{
    private int quantity;

    public CrispyFlour(){
    }
    public CrispyFlour(int quantity) {
        this.quantity = quantity;
    }

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    @Override
    double getAmount() {
        return quantity * getCost();
    }

    @Override
    LocalDate getExpiryDate() {
        return this.getManufacturingDate().plusYears(1);
    }

    @Override
    public String toString() {
        return "CrispyFlour{" + super.toString()+
                "quantity=" + quantity +
                '}';
    }
}
