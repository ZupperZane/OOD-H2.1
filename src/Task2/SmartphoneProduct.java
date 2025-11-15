package Task2;

public class SmartphoneProduct extends Product{

    public SmartphoneProduct(String name,Double price){
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

    public void displayInfo(){
        System.out.println("Smartphone Product:");
        System.out.println("Details for Product: "+ Name+".");
        System.out.println("Price: "+Price+"$");
    }
}
