package Task2;

public class Customer {
    public String Name;

    public Customer(String name) {
        Name = name;
    }

    public void receiveNotification(String Deal){
        System.out.println("Dear "+Name+", Recieved new Deal:"+Deal);

    }
}
