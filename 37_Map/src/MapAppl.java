import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class MapAppl {
    public static void main(String[] args) {
        Map<Integer, Integer> dice = new LinkedHashMap<>();
        Random r = new Random();
//        dice.put(0,0);
//        dice.put(1,0);
//        dice.put(2,0);
//        dice.put(3,0);
//        dice.put(4,0);
//        dice.put(5,0);
//        dice.put(6,0);
//        dice.put(7,0);
//        dice.put(8,0);
//        dice.put(9,0);
//        dice.put(10,0);
        for (int i = 0; i < 100; i++) {
            int res = r.nextInt(0, 11);
            dice.put(res, dice.getOrDefault(res, 0) + 1);

        }
        int res = 0;
        for (int i = 0; i < 11; i++) {

            res += dice.get(i);
        }

        System.out.println(dice + " = " + res);
    }
}
