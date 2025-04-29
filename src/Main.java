import products.*;

public class Main {
    public static double calculateTotalPrice (Inventory<? extends Product> inventory){
        double totalPrice = 0;
        for (Product p : inventory.getItems()){
            totalPrice += p.getPrice();
        }
        return totalPrice;
    }
    public static void main(String[] args) {
        Inventory<Product> inventory = new Inventory<>();

        Book book = new Book("ap", 150.0, "mehdi ghati", "kheyli sabz", "vahshat");
        Notebook notebook = new Notebook("daftar darsi 1", 50.0, 120, true);
        Accessory accessory = new Accessory("khodkar", 10.0, "abi");

        inventory.addItem(book);
        inventory.addItem(notebook);
        inventory.addItem(accessory);

        inventory.displayAll();

        double total = calculateTotalPrice(inventory);
        System.out.println("Total price: " + total);

        inventory.applyDiscount("ap", 10);
        inventory.removeItemsById(Integer.parseInt(accessory.getId()));

        Product found = inventory.findItemsById(Integer.parseInt(accessory.getId()));
        if (found != null){
            System.out.println("Found item: " + found);
        }

        System.out.println("Total Price " + calculateTotalPrice(inventory));

    }
}