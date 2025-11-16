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

    public void PrintProducts(){
        for (Product product : ProductList) {
            System.out.println("Product: "+product.Name+", Price: "+product.Price);
        }
    }

    public void Display(){
        System.out.println("Product Catalog:");
        System.out.println("Category: "+this.Name);
            for (Category cur : CatList) {
                System.out.println("Category: "+cur.Name);
                cur.PrintProducts();
            }
        }
    }
