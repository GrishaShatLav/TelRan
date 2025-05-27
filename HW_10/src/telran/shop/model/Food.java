package telran.shop.model;

public class Food extends Product {
    protected boolean kosher;
    protected long expDate;


    public Food(long barcode, String name, int price, boolean kosher, long expDate) {
        super(barcode, name, price);
        this.kosher = kosher;
        this.expDate = expDate;
    }

    public boolean isKosher() {
        return kosher;
    }

    public void setKosher(boolean kosher) {
        this.kosher = kosher;
    }

    public long getExpDate() {
        return expDate;
    }

    public void setExpDate(long expDate) {
        this.expDate = expDate;
    }
    @Override
    public void display(){
        super.display();
        System.out.println(" Kosher: " + kosher + " Expiration date: " + expDate);
    }
    @Override
    public String toString(){return "Barcode: "+ barcode + "Name: " + name + "Price: " + price+ " Kosher: " + kosher + " Expiration date: " + expDate;}
}
