package Lesson04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListLearning {
    public static void main(String[] args) {

        //Declaration
        List<String> myStringList = new ArrayList<>();

        Integer[] myNums = {1,2,3};
        List<Integer> myIntList = new ArrayList<>();
        myIntList.add(1);
        myIntList.add(2);
        myIntList.add(3);

//        myIntList.remove("1");
//        for(Integer integer:myIntList){
//            System.out.println(integer);
//        }

        // Add values into an array list | add
        myStringList.add("1");
        myStringList.add("5");
        myStringList.add("2");
        myStringList.add("4");

        //Get value
        String valueifIndex1 = myStringList.get(1);
        System.out.println("valueifIndex1" + valueifIndex1);

        // Insert a value into an array list | add
        // 0 1 2 3

        myStringList.add(2,"3");

        // Loop
        for (String s : myStringList) {
            System.out.println(s);
        }


        // Update value | set
       // myStringList.set(3,"5");


        //Remove value
       // myStringList.remove("5");
        for(int elementIndex = 0; elementIndex < myStringList.size(); elementIndex++){
            System.out.println("Element " + (elementIndex + 1) +":" +myStringList.get(elementIndex));
        }

        //check element existences
        boolean is6Existing = myStringList.contains("6");
        boolean is5Existing = myStringList.contains("5");

        System.out.println(is5Existing);
        System.out.println(is6Existing);

        List<Integer> anotherIntList = new ArrayList<>();
        anotherIntList.add(4);
        anotherIntList.add(6);
        anotherIntList.add(9);
        anotherIntList.add(12);

        // Remove duplicate element without using Set
        List<String> listWithDubValue = new ArrayList<>();

        listWithDubValue.add("A");
        listWithDubValue.add("B");
        listWithDubValue.add("C");
        listWithDubValue.add("A");
        listWithDubValue.add("D");
        listWithDubValue.add("E");
        listWithDubValue.add("B");

        List<String> listWithoutDub = new ArrayList<>();

//        for (String letter : listWithoutDub) {
//            if (!listWithoutDub.contains(letter)){
//                listWithoutDub.set(letter)
//            }

        }
    }

