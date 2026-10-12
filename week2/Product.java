public class Product {
    private final String name;
    private double price;
    private int quantity;
    public Product(String name, double price, int quantity) {
        if(name==null||name.isBlank()){
            throw new IllegalArgumentException("Product name cannot be null or blank");
        }
        this.name=name;
        setPrice(price);
        setQuantity(quantity);
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setPrice(double price) {
        if(price<=0){
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }
    public void setQuantity(int quantity) {
        if(quantity<=0){
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        this.quantity = quantity;
    }
    public double totalValue(){
        return price*quantity;
    }
    public void show(){
        System.out.println(name+"|gia: "+price+"|SL:"+quantity+"|tong:"+totalValue());
    }
}
