package tools;

import java.util.Comparator;

public class ArrayTools {

    public static void printArray(Object[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");


        }
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++");
    }

    public static void oddEvenComparator(Integer[] arr, Comparator<Integer> comp){
        //Even
        int evenCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                evenCount++;
            }

        }
        Integer[] evens= new Integer[evenCount];

        for (int i = 0,j=0; j < evenCount; i++) {
            if(arr[i]%2==0){
                evens[j]=arr[i];
                j++;
            }

        }

        for (int i = 0; i < evens.length-1; i++) {
            for (int j = 0; j < evens.length-1-i; j++) {
                if (comp.compare(evens[j],evens[j+1] )>0){
                    Integer temp = evens[j];
                    evens[j]=evens[j+1];
                    evens[j+1]=temp;

                }

            }

        }


        //Odd
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
                oddCount++;
            }

        }
        Integer[] odds= new Integer[oddCount];

        for (int i = 0,j=0; j < oddCount; i++) {
            if(arr[i]%2!=0){
                odds[j]=arr[i];
                j++;
            }

        }

        for (int i = 0; i < odds.length-1; i++) {
            for (int j = 0; j < odds.length-1-i; j++) {
                if (comp.compare(odds[j],odds[j+1] )<0){
                    Integer temp = odds[j];
                    odds[j]=odds[j+1];
                    odds[j+1]=temp;

                }

            }

        }

        for (int i = 0; i < evens.length; i++) {
            arr[i] = evens[i];


        }
        for (int i = evens.length,j=0; i < odds.length+evens.length; i++) {
            arr[i] = odds[j];
            j++;


        }




    }




}
