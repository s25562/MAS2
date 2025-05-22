package pck;

public class Order {
    private String number;
    private Client client;

    public Order(String number){
        this.number = number;
    }

    public void setClient(Client client){
        if (this.client != client){
            this.client = client;
            client.addOrder(this);
        }
    }

    public Client getClient(){
        return this.client;
    }

    public String getNumber(){
        return this.number;
    }
}
