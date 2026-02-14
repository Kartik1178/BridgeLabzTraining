

interface Category{
    String getCategoryName();
}
class BookCategory implements Category{
    @java.lang.Override

    public String getCategoryName() {
        return "book";
    }
}
class ClothingCategory implements Category{
    @java.lang.Override
    public String getCategoryName() {
        return "clothing";
    }
}
class GadgetsCategory implements Category{
    @java.lang.Override
    public String getCategoryName() {
        return "gadgets";
    }
}
class Product<T extends Category>{
    private String name;
    private int price;
    private T category;
    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public setPrice(int price){
        this.price=price;
    }
    public T getCategoryType(){
        return category;
    }

    public String toString() {
        return name + " | ₹" + price + " | Category: " + category.getCategoryName();
    }

}
class ProductCatalog {
    List<Product<? extends Category>> products = new ArrayList<>();

    void addProducts(Product<? extends Category> product) {
        products.add(product);
    }

    void displayProducts() {
        for (Product<? extends Category> p : products) {
            System.out.println(p);
        }

    }
}
class DiscountService {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        product.setPrice(product.getPrice() + product.getPrice() * percentage);
    }
}
public static void main(String[] args){
    Product<BookCategory> book=new Product("book1",42,new BookCategory());
    ProductCatalog catalog = new ProductCatalog();

    catalog.addProduct(book);
    DiscountService.applyDiscount(book, 10);
    catalog.displayCatalog();
}


