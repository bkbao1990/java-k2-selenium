package lesson03;

import java.util.Arrays;

public class ArrayUltilMethods {
    public static void main(String[] args) {
        int[] unsortedArr = {1,4,3,6,2,9,2};

        int[] sortedArr = Arrays.stream(unsortedArr).sorted().toArray();


        for (int i: unsortedArr){
            System.out.print(i);
        }
        System.out.println("\n");
        for (int i: unsortedArr){
            System.out.print(i);
        }

        int minNum = Arrays.stream(unsortedArr).min().getAsInt();
        int maxNum = Arrays.stream(unsortedArr).max().getAsInt();

        boolean is3InArr = Arrays.stream(unsortedArr).anyMatch(b->b==3);
        System.out.println("\n"+is3InArr);

    }
}
