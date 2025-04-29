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

    public void removeItemsById(int id){
        for(T item : items){
            if (Integer.parseInt(item.getId()) == id){
                items.remove(item);
                return;
            }
            System.out.println("Item not found");
            return;
        }
    }

    public void applyDiscount (String productName, int discount){
        for(T item : items){
            if (item.getTitle().equals(productName)){
                double discountPrice = item.getPrice() - (item.getPrice() * (discount / 100));
                item.setPrice(discountPrice);
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
