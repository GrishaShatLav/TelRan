package telran.controller;

public class StringAppl {
    public static void main(String[] args) {
        String str = "Hello";
        char[] chars = {' ', 'w', 'o', 'r', 'l', 'd'};
        String str1 = new String(chars);
        str += str1;
        System.out.println(str);
        str += 123;
        System.out.println(str);
        char c = str.charAt(2);
        System.out.println(c);
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        String str2 = " world";
        System.out.println(str2.equals(str1));
        System.out.println(str2.equalsIgnoreCase(str1));
        String strUpper = str.toUpperCase();
        System.out.println(str);
        int index = str.indexOf('l');
        System.out.println(index);
        char charInt = 192;
        System.out.println(str + charInt);
        System.out.println(str.substring(2,5));
        System.out.println(str.replace("o", "ooooooooooooooo"));
    }
}
