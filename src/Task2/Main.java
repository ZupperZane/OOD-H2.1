package Task2;

import javax.smartcardio.Card;

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
        //CLothing Category
        Category Clothing = new Category("Clothing");
        Product ShirtA = new ClothingProduct("Red Shirt",19.99);
        Product Jacket = new ClothingProduct("Jacket",69.99);
        Clothing.addProductList(ShirtA);
        Clothing.addProductList(Jacket);
        // organize into Black Friday Deals
        Category BlackFridayDeals = new Category("Black Friday Deals");
        BlackFridayDeals.addCatList(Electronics);
        BlackFridayDeals.addCatList(Clothing);
        // Register Customers
        Customer Bobby = new Customer("Bobby");
        Customer Tommy = new Customer("Tommy");
        //add to List
        BlackFridayDeals Deals = new BlackFridayDeals();
        Deals.addSubscriber(Bobby);
        Deals.addSubscriber(Tommy);

        //Display Category
        BlackFridayDeals.Display();
        // Notify
        Deals.notifyCustomers("Huge discounts on Electronics!");
    }
}
