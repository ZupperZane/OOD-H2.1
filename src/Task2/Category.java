package Task2;

import java.util.ArrayList;
import java.util.List;

public class Category {
    List<Category> CatList = new ArrayList<Category>();
    List<Product> ProductList = new ArrayList<Product>();
    String Name;
    public void addCatList(Category next){
        CatList.add(next);
    }
    public void addProductList(Product next){
        ProductList.add(next);
    }

    public Category(String name){
        Name=name;
    }

    public void Display(){
        System.out.println("Subcategories:");
            for (Category category : CatList) {
                System.out.print(category+", ");
            }
        System.out.println("Products:");
        for (Product product : ProductList) {
            System.out.print(product+", ");
        }
    }
}
