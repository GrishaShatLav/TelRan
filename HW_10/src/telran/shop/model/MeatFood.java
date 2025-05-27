package telran.shop.model;

public class MeatFood extends Food{
    protected String typeOfMeat;

    public MeatFood(long barcode, String name, int price, boolean kosher, long expDate, String typeOfMeat) {
        super(barcode, name, price, kosher, expDate);
        this.typeOfMeat = typeOfMeat;

    }

    public String getTypeOfMeat() {
        return typeOfMeat;
    }

    public void setTypeOfMeat(String typeOfMeat) {
        this.typeOfMeat = typeOfMeat;
    }

    @Override
    public void display(){
        super.display();
        System.out.println(" Type of meat: " +typeOfMeat);
    }
    @Override
    public String toString(){return "Barcode: "+ barcode + "Name: " + name + "Price: " + price+ " Kosher: " + kosher + " Expiration date: " + expDate+" Type of meat: " +typeOfMeat;}

}
