import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Predicate;

public class MonthDemo {
    public static void main(String[] args) {
        Map<String, Integer> months = new LinkedHashMap<>();
        fillMap(months);
        System.out.println(months);
        System.out.println("put jan=100? old value = " + months.put("jan", 100));
        System.out.println(months);
        System.out.println("put jun=6? old value = " + months.put("jun", 6));
        //putAll
        //putIfAbsent
        System.out.println(months.putIfAbsent("feb", 2));
        System.out.println(months);
        System.out.println(months.putIfAbsent("jul", 7));
        System.out.println(months);
        Map<String, Integer> months1 = new HashMap<>();
        months1.put("jan", 1000);
        months1.put("feb", 20);
        months1.put("aug", 8);
        months1.put("sep", 9);
        System.out.println(months1);
//        months.putAll(months1);
//        System.out.println(months);
//        months1.putAll(months);
//        System.out.println(months1);
        System.out.println(months.containsKey("jun"));
        System.out.println(months.containsKey("Jun"));
        Map<Map<String, Integer>, Integer> months11 = new HashMap<>();
        System.out.println(months.containsValue(4));
        System.out.println(months.get("jan"));
        System.out.println(months.get("jana"));
        System.out.println(months.getOrDefault("janaa", 0));
        System.out.println(months.remove("jan", 100));
        System.out.println(months);
        months1.clear();
        System.out.println(months1);
        System.out.println(months.entrySet());
        System.out.println("key");
        System.out.println(months.keySet());
        System.out.println(months.values());
        iterateEntries(months);
        iterateMonthsNames(months);
        iterateMonthsNumber(months);
        months.values().removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer t) {
                return t%2==0;
            }
        });
    }

    private static void iterateMonthsNumber(Map<String, Integer> months) {
        System.out.println("=====================Key Iterate===================");
        System.out.print(" || ");
        for (Integer v: months.values()) {

            System.out.print(v);
            System.out.print(" || ");
        }
    }

    private static void iterateMonthsNames(Map<String, Integer> months) {
        System.out.println("=====================Key Iterate===================");
        System.out.print(" || ");
        for (String name : months.keySet()) {

            System.out.print(name);
            System.out.print(" || ");
        }
        System.out.println();
    }

    private static void iterateEntries(Map<String, Integer> months) {
        System.out.println("=====================Entry Iterate===================");
        for (Map.Entry<String, Integer> entry : months.entrySet()) {
            String key = entry.getKey();
            Integer val = entry.getValue();
            System.out.println("Entry " + entry + " key = " + key + " value = " + val);
            System.out.println("Entry " + entry + " key = " + key + " -> " + val);
        }

    }

    private static void fillMap(Map<String, Integer> months) {
        months.put("jan", 1);
        months.put("feb", 2);
        months.put("mar", 3);
        months.put("apr", 4);
        months.put("may", 5);
    }
}
