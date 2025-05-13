public class ArrayAdvAppl {
    public static void main(String[] args) {
        int[] arr = new int[7];
        printArray(arr);
        fillArray(arr,1,99);
        printArray(arr);
        int summ = sumArray(arr);
        System.out.println("Sum = " + summ);
        double avg = average(arr, summ);
        System.out.printf("Average =" + "%.2f%n", avg);
        int max = max(arr);
        System.out.println("Max = " + max);
        try {
            int search = search(arr, 95);
            System.out.println("Index = " + search);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        //Always successful search method 
        int search = search(arr, arr[6]);
        System.out.println("(Always successful) Index = " + search);
    }

    private static int search(int[] arr, int dex) {
        int index;
        for (int i = 0; i<arr.length;i++){
            if (arr[i]==dex){
                index = i;
                return index;
            }

        }
        throw new IllegalArgumentException("Value not found in array: " + dex);
    }

    private static int max(int[] arr) {
        int max = arr[1];
        for (int i = 0; i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    private static double average(int[] arr, int summ) {
        double avg;
        return avg = (double) summ /arr.length;
         

    }

    private static int sumArray(int[] arr){

        int summ = 0;
        for (int i = 0; i<arr.length;i++){
            summ += arr[i];
        }
        return summ;

    }

    private static void fillArray(int[] arr, int from, int to) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(from + Math.random()*(to - from +1));
        }
    }

    private static void printArray(int[] arr){
        for (int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
}
