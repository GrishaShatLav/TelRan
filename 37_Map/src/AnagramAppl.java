import java.util.HashMap;
import java.util.Map;

public class AnagramAppl {
    public static void main(String[] args) {
        String word = "electricity";
       IsAnagram(word,"electric");
       IsAnagram(word,"city");
       IsAnagram(word,"tric");
       IsAnagram(word,"tric");
       IsAnagram(word,"tet");
       IsAnagram(word,"let");
       IsAnagram(word,"tree");
       System.out.println("FALSE");
     // false
       IsAnagram(word,"tot");
     IsAnagram(word,"ellect");
       IsAnagram(word,"tet e");
       IsAnagram(word,"select");
     IsAnagram(word,"teeet");
     IsAnagram(word,"teeet");
       IsAnagram(word,"   tet");
       IsAnagram(word,"t et");



    }

    private static void IsAnagram(String word, String tot) {
        String[] words = word.split("");
        Map<String, Integer> res = new HashMap<>();
        for (String w : words) {
            if (w.isEmpty()) continue;
            res.put(w, res.getOrDefault(w, 0) + 1);
        }
      //  System.out.println(res);
        String[] tots = tot.split("");
        Map<String, Integer> resTot = new HashMap<>();
        for (String t : tots) {
            if (t.isEmpty()) continue;
            resTot.put(t, resTot.getOrDefault(t, 0) + 1);
        }
        //System.out.println(resTot);

        System.out.println(res.entrySet());
        System.out.println(resTot.entrySet());

        for (String t : tots) {
            if(!res.containsKey(t)) {
                System.out.println("Not an Anagram");
                break;
            }
            else {
                if (res.get(t)<resTot.get(t)) {
                    System.out.println("Not an Anagram");
                    break;
                }
                resTot.replace(t,res.get(t));
            }

        }
        System.out.println(res.entrySet());
        System.out.println(resTot.entrySet());

        if(res.entrySet().containsAll(resTot.entrySet()))
            System.out.println("Is Anagram");




    }
}
