package telran.pattern.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAppl {
    public static void main(String[] args) {
        String str = "Mama, mula ramy! Mama, mula ramy?";
        String regex = "(m|M)ama";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
//        System.out.println(matcher.matches());
        System.out.println("Find: " + matcher.find());
        System.out.println("Start: " + matcher.start());
        System.out.println("Group: " + matcher.group());
        System.out.println("End: " + matcher.end());
        System.out.println("================= #2 ==================");
        System.out.println("Find: " + matcher.find());
        System.out.println("Start: " + matcher.start());
        System.out.println("Group: " + matcher.group());
        System.out.println("End: " + matcher.end());
        System.out.println("========reset===========");
        matcher.reset("Mama mama mula ramu, mama Mama");
        while(matcher.find()){
            System.out.println("Start: " + matcher.start());
            System.out.println("Group: " + matcher.group());
            System.out.println("End: " + matcher.end());
        }
    }
}
