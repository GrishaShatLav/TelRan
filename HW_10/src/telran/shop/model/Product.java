package telran.shop.model;

public class Product {

    protected long barcode;
    protected String name;
    protected int price;

    public Product(long barcode, String name, int price) {
        this.barcode = barcode;
        this.name = name;
        this.price = price;
    }

    public long getBarcode() {
        return barcode;
    }

    public void setBarcode(long barcode) {
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public  void display(){
        System.out.println("Barcode: "+ barcode + "Name: " + name + "Price: " + price);
    }
    @Override
    public String toString(){return "Barcode: "+ barcode + "Name: " + name + "Price: " + price;}
}
