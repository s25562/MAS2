package pck;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private List<Order> orders = new ArrayList<>();

    public Client(String name){
        this.name = name;
    }

    public void addOrder(Order order){
        if(!orders.contains(order)){
            orders.add(order);
            order.setClient(this);
        }
    }

    public void getOrders(){
        for (Order o : orders)
            System.out.println(o.getNumber());
    }

    public String getName(){
        return this.name;
    }
}
