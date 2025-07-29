package telran.memory.utils;

import java.util.ArrayList;
import java.util.Arrays;

public class MemoryService {
    public static int getMaxAvailableMemory(){

        //First theory
//        StringBuilder sb = new StringBuilder("1");
//        int org = sb.length();
//        int res = org+1;
//        boolean flag = true;
//        while (flag){
//            org = sb.length();
//            try {
//                sb.append("1");
//                flag = true;
//            }catch (Throwable e){
//                flag = false;
//                break;
//            }
//
//            res = sb.length();
//        }
//        return sb.length();

        //Failed


        //Second theory
//        int[] arr;
//        arr = new int[1];
//        boolean flag = true;
//        while (flag){
//            try {
//                arr = Arrays.copyOf(arr,arr.length+1);
//                flag = true;
//            }catch (Throwable e){
//                flag = false;
//                break;
//            }
//        }
//        return arr.length;
        //Idk if it works. Took to much time to work :..(
        //TODO homework
        // Runtime.getRunTime().maxMemory(); нельзя
        //Third theory
        // return 2_147_483_647/2;
        //It worked? Lol

        //Fourth theory
//        ArrayList<Integer> list = new ArrayList<>();
//        boolean flag = true;
//        while (flag){
//            try {
//                list.add(1);
//                flag = true;
//            }catch (Throwable e){
//                flag = false;
//                break;
//            }
//        }
//        return list.size();
        //kinda vibecoded this one. I mean I am still not familiar with lists, so Ive asked GPT how to extend array

        //Second  theory 2
        int[] arr;
        arr = new int[1];
        boolean flag = true;
        while (flag){
            try {
                arr = Arrays.copyOf(arr,arr.length*3);
                flag = true;
            }catch (Throwable e){
                flag = false;
                break;
            }
        }
        flag = true;
        while (flag){
            try {
                arr = Arrays.copyOf(arr,arr.length+1);
                flag = true;
            }catch (Throwable e){
                flag = false;
                break;
            }
        }
        return arr.length;
        //It worked! Just needed optimisation <3

    }
}
