package telran.shop.controller;

import telran.shop.model.DairyFood;
import telran.shop.model.Food;
import telran.shop.model.MeatFood;
import telran.shop.model.Product;

public class ShopAppl {
    public static void main(String[] args) {
        Product[] product = new Product[4];
        product[0] = new Product(169,"Cheesepuff ", 11);
        product[1] = new Food(179,"Beefpuff ", 12, true,12);
        product[2] = new MeatFood(189,"Ribs ", 15, false, 11, "Pork");
        product[3] = new DairyFood(199,"GoatCheese ", 17, true, 11, "Goat", 14);

        printArray(product);
        costOfGoods(product);
        costOfKosherGoods(product);
        printArrayNotFood(product);



    }

    private static void printArrayNotFood(Product[] product) {
        System.out.println("==============================");

        for (int i = 0; i < product.length; i++) {
            if (!(product[i] instanceof Food)){
            System.out.println(product[i]);
            }
        }

    }

    private static void costOfKosherGoods(Product[] product) {
        System.out.println("==============================");
        int cog = 0;
        for (int i = 0; i < product.length; i++) {
            if (product[i] instanceof Food){
                Food food = (Food) product[i];
                if(food.isKosher()){
                    cog += food.getPrice();
                }
            }


        }
        System.out.println("Price of Kosher goods= " + cog);
    }

    private static void costOfGoods(Product[] product) {
        System.out.println("==============================");
        int cog = 0;
        for (int i = 0; i < product.length; i++) {

            cog += product[i].getPrice();

        }
        System.out.println("Total price of Goods = " + cog);
    }

    private static void printArray(Product[] product) {
        System.out.println("==============================");
        for (int i = 0; i < product.length; i++) {
            System.out.println(product[i]);
        }

    }

}


