package telran.homework;

public class MinMaxAppl {
    public static void main(String[] args) {
        if(args.length ==0){
            System.out.print("Min byte: " + Byte.MIN_VALUE + " || ");
            System.out.println("Max byte: "+ Byte.MAX_VALUE);
            System.out.print("Min int: " + Integer.MIN_VALUE + " || ");
            System.out.println("Max int: "+ Integer.MAX_VALUE);
            System.out.print("Min short: " + Short.MIN_VALUE + " || ");
            System.out.println("Max short: "+ Short.MAX_VALUE);
            System.out.print("Min long: " + Long.MIN_VALUE + " || ");
            System.out.println("Max long: "+ Long.MAX_VALUE);
            System.out.print("Min char: " + (int)Character.MIN_VALUE + " || ");
            System.out.println("Max char: "+ (int)Character.MAX_VALUE);
            System.out.print("Min float: " + Float.MIN_VALUE + " || ");
            System.out.println("Max float: "+ Float.MAX_VALUE);
            System.out.print("Min double: " + Double.MIN_VALUE + " || ");
            System.out.println("Max double: "+ Double.MAX_VALUE);
        }
        else if(args.length != 1){
            System.out.println("Wrong number arguments");
            return;
        }
        else {
            String primitive = args[0];

            MinMax(primitive);
        }
    }

    private static void MinMax(String primitive){
        if(primitive.equals("byte")){
            System.out.println(Byte.MIN_VALUE);
            System.out.println(Byte.MAX_VALUE);
        }
        else if(primitive.equals("int")){
            System.out.println(Integer.MIN_VALUE);
            System.out.println(Integer.MAX_VALUE);
        }
        else if(primitive.equals("short")){
            System.out.println(Short.MIN_VALUE);
            System.out.println(Short.MAX_VALUE);
        }
        else if(primitive.equals("long")){
            System.out.println(Long.MIN_VALUE);
            System.out.println(Long.MAX_VALUE);
        }else if(primitive.equals("char")){
            System.out.println((int)Character.MIN_VALUE);
            System.out.println((int)Character.MAX_VALUE);
        }else if(primitive.equals("float")){
            System.out.println(Float.MIN_VALUE);
            System.out.println(Float.MAX_VALUE);
        }else if(primitive.equals("double")){
            System.out.println(Double.MIN_VALUE);
            System.out.println(Double.MAX_VALUE);
        }
        else {
            System.out.println(primitive + "Wrong type");
        }




    }
}
