import java.util.*;

public class EventMaterialSupply {

    static class Material {
        int id;
        String name;
        double price;

        Material(int id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }
    }

    static ArrayList<Material> materials = new ArrayList<>();

    public static void main(String[] args) {

        materials.add(new Material(1, "Chairs", 20));
        materials.add(new Material(2, "Tables", 100));
        materials.add(new Material(3, "Decoration Set", 500));
        materials.add(new Material(4, "Stage Set", 2000));
        materials.add(new Material(5, "Sound System", 1500));
        materials.add(new Material(6, "Lighting Set", 1000));
        materials.add(new Material(7, "Tent / Canopy", 2500));
        materials.add(new Material(8, "Catering Equipment", 1200));

        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("   EVENT MATERIAL SUPPLY SYSTEM");
        System.out.println("=================================");

        System.out.println("\nAvailable Materials:");

        for (Material m : materials) {
            System.out.println(m.id + ". " + m.name + " - Rs." + m.price);
        }

        System.out.print("\nEnter Customer Name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = scanner.nextLine();

        System.out.print("Enter Event Type: ");
        String eventType = scanner.nextLine();

        System.out.print("Enter Material ID: ");
        int materialId = scanner.nextInt();

        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();

        Material selectedMaterial = null;

        for (Material m : materials) {
            if (m.id == materialId) {
                selectedMaterial = m;
                break;
            }
        }

        if (selectedMaterial == null) {
            System.out.println("\nInvalid Material ID!");
            scanner.close();
            return;
        }

        double total = selectedMaterial.price * quantity;

        System.out.println("\n========== ORDER DETAILS ==========");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Phone         : " + phone);
        System.out.println("Event Type    : " + eventType);
        System.out.println("Material      : " + selectedMaterial.name);
        System.out.println("Price         : Rs." + selectedMaterial.price);
        System.out.println("Quantity      : " + quantity);
        System.out.println("-----------------------------------");
        System.out.println("Total Amount  : Rs." + total);
        System.out.println("-----------------------------------");
        System.out.println("\nOrder placed successfully!");

        scanner.close();
    }
}
