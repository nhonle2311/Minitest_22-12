import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaterialManager {
    private List<Material> materials;

    public MaterialManager() {
        this.materials = new ArrayList<>();
    }

    public void addMaterial(Material material) {
        materials.add(material);
    }

    public void updateMaterial(String id, Material newMaterial) {
        for (int i = 0; i < materials.size(); i++) {
            if (materials.get(i).getId().equals(id)) {
                materials.set(i, newMaterial);
                return;
            }
        }
        System.out.println("Material with ID " + id + " not found.");
    }

    public void deleteMaterial(String id) {
        materials.removeIf(material -> material.getId().equals(id));
    }

    public void displayMaterialList() {
        for (Material material : materials) {
            System.out.println(material);
        }
    }

    public void calculateTotalCost() {
        double totalCost = 0;
        for (Material material : materials) {
            totalCost += material.getAmount();
        }
        System.out.println("Total cost of materials: " + totalCost);
    }

    public void sortMaterialsByPrice() {
        Collections.sort(materials, Comparator.comparingInt(Material::getCost));
    }

    public void applyDiscounts() {
        LocalDate today = LocalDate.now();
        for (Material material : materials) {
            double discountPercentage = 0;

            if (material instanceof Meat) {
                LocalDate expiryDate = material.getExpiryDate();
                if (today.plusDays(5).isAfter(expiryDate)) {
                    discountPercentage = 0.3;
                } else {
                    discountPercentage = 0.1;
                }
            } else if (material instanceof CrispyFlour) {
                LocalDate expiryDate = material.getExpiryDate();
                LocalDate twoMonthsBeforeExpiry = expiryDate.minusMonths(2);
                LocalDate fourMonthsBeforeExpiry = expiryDate.minusMonths(4);

                if (today.isAfter(twoMonthsBeforeExpiry)) {
                    discountPercentage = 0.4;
                } else if (today.isAfter(fourMonthsBeforeExpiry)) {
                    discountPercentage = 0.2;
                } else {
                    discountPercentage = 0.05;
                }
            }

            double discountedAmount = material.getAmount() * (1 - discountPercentage);
            System.out.println("Discount applied for material " + material.getId() + ": " + discountPercentage * 100 + "%");
            System.out.println("Original amount: " + material.getAmount());
            System.out.println("Discounted amount: " + discountedAmount);
        }
    }
}
