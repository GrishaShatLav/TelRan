import java.util.*;

public class WordCounterAppl {
    public static void main(String[] args) {
        String str = "crazy? I was crazy once, they locked me in a room, a rubber room, a rubber room with rats, and rats make me crazy";
        displayWordCount(str);
    }

    private static void displayWordCount(String str) {
        String[] words = str.split("[^A-Za-z]+");
        Map<String, Integer> res = new HashMap<>();
        for (String w : words) {
            if (w.isEmpty()) continue;
            res.put(w, res.getOrDefault(w, 0) + 1);
        }
        System.out.println(res);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(res.entrySet());
        list.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                int res = Integer.compare(o2.getValue(), o1.getValue());
                return res != 0 ? res : o2.getKey().compareToIgnoreCase(o1.getKey());
            }
        });
        for (Map.Entry<String, Integer> e : list) {
            System.out.printf("%s->%d\n", e.getKey(), e.getValue());
        }
    }
}
