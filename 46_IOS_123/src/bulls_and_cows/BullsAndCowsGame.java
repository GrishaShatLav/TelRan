package bulls_and_cows;

import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//1234 1-> !0  no copies
// 2354 -> 2(2) 2(1) -> cow 3 -> cow, 4 -> bull
public class BullsAndCowsGame {
    private String secret;


    public BullsAndCowsGame() {
        this.secret = generateSecret();
        System.out.println(secret);
    }

    public String getSecret() {
        return secret;
    }

    public int[] check(String guess) {
        if (guess == null || guess.length() != 4 ||
                !guess.chars().allMatch(Character::isDigit))
            throw new IllegalArgumentException("Need 4 digits!");
        if (hasRepeat(guess))
            throw new IllegalArgumentException("Digits has to be unique");
        if (guess.charAt(0) == '0')
            throw new IllegalArgumentException("First digit must not be zero");
        

    }

    private boolean hasRepeat(String guess) {
        IntStream sr=  guess.chars().asDoubleStream().mapToInt(s->(int) s).distinct();
        if(sr.count()<4)
            return false;
        return true;
    }

    private String generateSecret() {
        Random r = new Random();
        int first = r.nextInt(9) + 1;
        IntStream rest = IntStream.generate(() -> r.nextInt(10))
                .filter(d -> d != first)
                .distinct().limit(3);
        return IntStream.concat(IntStream.of(first), rest)
                .mapToObj(Integer::toString).collect(Collectors.joining());

    }
}
