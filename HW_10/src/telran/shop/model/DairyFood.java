package telran.shop.model;

public class DairyFood extends Food{
    protected String typeOfMilk;
    protected int fatProcent;

    public DairyFood(long barcode, String name, int price, boolean kosher, long expDate,String typeOfMilk,int fatProcent) {
        super(barcode, name, price, kosher, expDate);
        this.typeOfMilk = typeOfMilk;
        this.fatProcent = fatProcent;
    }


    public String getTypeOfMilk() {
        return typeOfMilk;
    }

    public void setTypeOfMilk(String typeOfMilk) {
        this.typeOfMilk = typeOfMilk;
    }

    public int getFatProcent() {
        return fatProcent;
    }

    public void setFatProcent(int fatProcent) {
        this.fatProcent = fatProcent;
    }

    @Override
    public void display(){
        super.display();
        System.out.println(" Type of milk: " +typeOfMilk + " Fat Percentage: " + fatProcent);
    }

    @Override
    public String toString(){return "Barcode: "+ barcode + "Name: " + name + "Price: " + price+ " Kosher: " + kosher + " Expiration date: " + expDate+" Type of milk: " +typeOfMilk + " Fat Percentage: " + fatProcent;}

}
