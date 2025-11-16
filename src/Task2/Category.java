package Task2;

import java.util.ArrayList;
import java.util.List;

public class Category extends Product{
    List<Product> ProductList = new ArrayList<Product>();
    String Name;
    public void addProductList(Product next){
        ProductList.add(next);
    }

    public Category(String name){
        Name=name;
    }

    public void PrintList(){
        for (Product cur : ProductList) {
            System.out.println("Product: "+cur.Name+", Price: "+cur.Price);
        }
    }

    public void display(){
        System.out.println("Category: "+this.Name);
            for (Product cur : ProductList) {
                cur.display();
            }
        }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getName() {
        return Name;
    }
}
