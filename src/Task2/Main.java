package Task2;

public class Main {
    public static void main(String[] args) {
        //Product Intialize
        Product laptop = new LaptopProduct("Razer", 799.99);
        Product smartphone = new SmartphoneProduct("Iphone", 1199.99);
        // Category Intialize
        Category Electronics = new Category("Electronics");
        //add to category
        Electronics.addProductList(laptop);
        Electronics.addProductList(smartphone);
        // organize into Black Friday Deals
        Category BlackFridayDeals = new Category("Black Friday Deals");
        BlackFridayDeals.addCatList(Electronics);
        // Register Customers

    }
}
