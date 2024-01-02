import java.io.FileOutputStream;
import java.time.LocalDate;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        MaterialManager manager = new MaterialManager();
        for (int i = 0; i < 5; i++) {
            manager.addMaterial(new CrispyFlour("C" + i, "CrispyFlour" + i, LocalDate.now(), 100, i + 1));
            manager.addMaterial(new Meat("M" + i, "Meat" + i, LocalDate.now(), 200, 2.5 * (i + 1)));
        }
//            System.out.println("-------------------------");
//            System.out.println("Material list before applying discounts:");
//            manager.displayMaterialList();
//            manager.applyDiscounts();
//            System.out.println("--------------------------");
//            System.out.println("\nMaterial list after applying discounts:");
//            manager.displayMaterialList();
//            manager.calculateTotalCost();
//            manager.sortMaterialsByPrice();
//            System.out.println("-----------------------");
//            System.out.println("\nMaterial list after sorting by price:");
//            manager.displayMaterialList();
//            System.out.println("delete----");
//            manager.deleteMaterial("C2");
//            manager.displayMaterialList();
//            System.out.println("update----");
//            manager.updateMaterial("C2", new CrispyFlour("C2", "CrispyFlour2", LocalDate.now(), 100, 2));
//            manager.displayMaterialList();
//            System.out.println("write to file----");
//            manager.writeMaterialListToFile("material.txt");
//            System.out.println("read from file----");
//            manager.readMaterialListFromFile("material.txt");
//            manager.displayMaterialList();
//            manager.updateMaterial("C2", new CrispyFlour("C2", "CrispyFlour2", LocalDate.now(), 20, 2));
//            manager.displayMaterialList();
//            manager.addMaterial(new Meat("M5", "Meat5", LocalDate.now(), 200, 2.5 * (5 + 1)));
//            manager.displayMaterialList();

    }

}