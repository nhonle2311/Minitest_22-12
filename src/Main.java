import java.time.LocalDate;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        MaterialManager manager = new MaterialManager();

        for (int i = 0; i < 5; i++) {
            manager.addMaterial(new CrispyFlour("C" + i, "CrispyFlour" + i, LocalDate.now(), 100, i + 1));
            manager.addMaterial(new Meat("M" + i, "Meat" + i, LocalDate.now(), 200, 2.5 * (i + 1)));
        }
        System.out.println("-------------------------");
        System.out.println("Material list before applying discounts:");
        manager.displayMaterialList();
        manager.applyDiscounts();
        System.out.println("--------------------------");
        System.out.println("\nMaterial list after applying discounts:");
        manager.displayMaterialList();
        manager.calculateTotalCost();
        manager.sortMaterialsByPrice();
        System.out.println("-----------------------");
        System.out.println("\nMaterial list after sorting by price:");
        manager.displayMaterialList();
    }

}