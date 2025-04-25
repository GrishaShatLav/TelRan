public class Homework {
    private static byte i=0;

    public static void main(String[] args){

        System.out.println("Crazy?");

        FuncSix();

        FuncOne();
        FuncTwo();
    }


    public static void FuncOne(){
        System.out.println("They put me in a room");
        FuncFour();
    }
    public static void FuncTwo(){
        System.out.println("Crazy?");
        FuncSix();
    }
    public static void FuncThree(){
        System.out.println("Why am I here? Is this some sort of a joke? Or is it some kind of a political comment on a cruel fate of voiceless groups who are still forced to participate in order to be demonstrably ignored?  ");

    }
    public static void FuncFour(){
        System.out.println("A rubber room");
        FuncFive();
    }
    public static void FuncFive(){
        System.out.println("A rubber room with rats");

        FuncSix();
    }
    public static void FuncSix(){


        if (i==0) {
            System.out.println("I was crazy once");
            i++;
        }
        else  {
            System.out.println("The rats made me crazy");
            i=0;
        }




    }
}


