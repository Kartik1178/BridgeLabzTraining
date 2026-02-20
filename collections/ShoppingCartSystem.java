import java.util.*;

/*
 * ShoppingCart
 * HashMap stores prices, LinkedHashMap maintains insertion order,
 * TreeMap displays items sorted by price.
 */
class ShoppingCart {

    HashMap<String,Integer> priceMap=new HashMap<>();
    LinkedHashMap<String,Integer> cart=new LinkedHashMap<>();

    // Add item to cart
    public void addItem(String item,int price){
        priceMap.put(item,price);
        cart.put(item,price);
    }

    // Display items sorted by price
    public void displaySorted(){
        TreeMap<Integer,String> sorted=new TreeMap<>();
        for(String item:priceMap.keySet()){
            sorted.put(priceMap.get(item),item);
        }
        System.out.println(sorted);
    }

    // Main method
    public static void main(String[] args) {
        ShoppingCart sc=new ShoppingCart();
        sc.addItem("Pen",10);
        sc.addItem("Book",50);
        sc.addItem("Bag",30);
        sc.displaySorted();
    }
}