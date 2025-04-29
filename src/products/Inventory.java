package products;

import java.util.ArrayList;

public class Inventory <T extends Product>{
    private ArrayList<T> items = new ArrayList<>();

    public ArrayList<T> getItems() {
        return items;
    }
    public void setItems(ArrayList<T> items) {
        this.items = items;
    }

    public void addItem(T item){
        items.add(item);
    }

    public void removeItemsById(int id) {
        items.removeIf(p -> {
            try {
                return Integer.parseInt(p.getId()) == id;
            } catch (NumberFormatException e) {
                return false;
            }
        });
    }

    public void applyDiscount(String productName, int discount) {
        for (T p : items) {
            if (p.getTitle().equals(productName)) {
                double discountedPrice = p.getPrice() * (1 - discount / 100.0);
                p.setPrice(discountedPrice);
            }
        }
    }

    public T findItemsById(int id){
        for(T item : items){
            if (Integer.parseInt(item.getId()) == id){
                return item;
            }
        }
        System.out.println("Item not found.");
        return null;
    }

    public void displayAll(){
        for(T item : items){
            System.out.println(item.toString());
        }
    }
}
