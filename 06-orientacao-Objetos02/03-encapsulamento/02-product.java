package entities;

public class Product {
    //atributos
    private String name;
    private double price;
    private int quantity;
    
    //construtores

    public Product() {}

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    
    //encapsulamento

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }
    
    //metodos
    public double totalValueInStock(){
        return price*quantity;
    }
    
    public void addProducts(int quantity){
        //O this acessa o atributo da classe e não o parametro da função 
        this.quantity += quantity;
    }
    
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }
    
    //converte o objeto para String
    public String toString(){
        return name + ", R$ " + String.format("%.2f", price) + ", " + quantity + " unidades, Total: R$" + String.format("%.2f",totalValueInStock());
    }
}
