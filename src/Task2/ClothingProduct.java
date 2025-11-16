package Task2;

public class ClothingProduct extends Product{
    public ClothingProduct(String name,Double price){
        Name = name;
        Price = price;
    }

    @Override
    public double getPrice() {
        return Price   ;
    }

    @Override
    public String getName() {
        return Name;
    }

    public void display(){
        System.out.println("Product: "+Name+" ,Price: "+Price+"$");
    }
}
