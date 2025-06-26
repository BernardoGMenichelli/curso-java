package entities;

public class Produto {
    public String name;
    public double price;
    public int quantity;
    
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
