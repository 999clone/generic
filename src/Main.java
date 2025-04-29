import products.*;

public class Main {
    public static double calculateTotalPrice(Inventory<? extends Product> inventory) {
        double total = 0;
        for (Product p : inventory.getItems()) {
            total += p.getPrice();
        }
        return total;
    }

    public static void main(String[] args) {

        Inventory<Book> bookInventory = new Inventory<>();
        Inventory<Notebook> notebookInventory = new Inventory<>();
        Inventory<Accessory> accessoryInventory = new Inventory<>();


        Book book1 = new Book("ap", 150.0, "ghati", "kheyli sabz", "Education");
        Book book2 = new Book("bp", 180.0, "Robert", "kheyli ghahve ei", "Programming");
        bookInventory.addItem(book1);
        bookInventory.addItem(book2);

        Notebook notebook1 = new Notebook("Notebook A4", 50.0, 120, true);
        Notebook notebook2 = new Notebook("Notebook B5", 45.0, 100, false);
        notebookInventory.addItem(notebook1);
        notebookInventory.addItem(notebook2);

        Accessory accessory1 = new Accessory("khodkar", 10.0, "abi");
        Accessory accessory2 = new Accessory("medad", 5.0, "siyah");
        accessoryInventory.addItem(accessory1);
        accessoryInventory.addItem(accessory2);


        System.out.println("\nAll Books:");
        bookInventory.displayAll();
        System.out.println("\nAll Notebooks:");
        notebookInventory.displayAll();
        System.out.println("\nAll Accessories:");
        accessoryInventory.displayAll();
        System.out.println();


        bookInventory.removeItemsById(Integer.parseInt(book1.getId()));
        notebookInventory.removeItemsById(Integer.parseInt(notebook2.getId()));
        accessoryInventory.removeItemsById(Integer.parseInt(accessory2.getId()));


        System.out.println("Total Book Price: " + calculateTotalPrice(bookInventory));
        System.out.println("\nTotal Notebook Price: " + calculateTotalPrice(notebookInventory));
        System.out.println("\nTotal Accessory Price: " + calculateTotalPrice(accessoryInventory));


        Product foundBook = bookInventory.findItemsById(Integer.parseInt(book2.getId()));
        if (foundBook != null) {
            System.out.println("\nFound Book: " + foundBook + "\n");
        }


        Product notFound = accessoryInventory.findItemsById(99999);


        bookInventory.applyDiscount("bp", 20);
        accessoryInventory.applyDiscount("khodkar", 50);


        System.out.println("\nFinal Book Inventory:");
        bookInventory.displayAll();

        System.out.println("\nFinal Notebook Inventory:");
        notebookInventory.displayAll();

        System.out.println("\nFinal Accessory Inventory:");
        accessoryInventory.displayAll();
    }
}
