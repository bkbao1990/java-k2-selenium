package lesson.Lesson04;

import java.util.*;

public class HashMapLearning {
    public static void main(String[] args) {
        Map<Integer, String> emergencyNumList = new HashMap<>();

        //Add element
        emergencyNumList.put(113,"police");
        emergencyNumList.put(114,"fire Dept");
        emergencyNumList.put(115,"Hospital");

        //Add Dub Key
        emergencyNumList.put(115,"Hospital!!!");
        emergencyNumList.put(116,"other");
        emergencyNumList.put(115,"other");


        //Get values
//        System.out.println("113: "+ emergencyNumList.get(113));
//        System.out.println("114: "+ emergencyNumList.get(114));
//        System.out.println("115: "+ emergencyNumList.get(115));

        // Replace
     //   emergencyNumList.replace(115,"Hospital");


        //Remove
        //emergencyNumList.remove(116);
       // emergencyNumList.remove(116, "abc");

        //Get
        Set<Integer> allKeys = emergencyNumList.keySet();
        for (Integer key : allKeys) {
            System.out.println(key +": "+ emergencyNumList.get(key));
        }
        // Iterator and Exception
//        for (Integer key : allKeys) {
//            if (emergencyNumList.get(key).equals("other"))
//                emergencyNumList.remove(key);
//        }

        Iterator<Map.Entry<Integer, String>> emergencyNumIterator = emergencyNumList.entrySet().iterator();
        while (emergencyNumIterator.hasNext()){
            Map.Entry<Integer, String> entry = emergencyNumIterator.next();
            String entryValue = entry.getValue();
            if(entryValue.equals("other")) {
                emergencyNumIterator.remove();
            }
        }
        System.out.println("=============");
        for (Integer key : allKeys) {
            System.out.println(key +": "+ emergencyNumList.get(key));
        }

        // Used method: ContainsKey
        boolean isPoliceExist = emergencyNumList.containsValue("police\n");
        boolean isabcExist = emergencyNumList.containsValue("policee");

        System.out.println("ispoliceExist: " + isPoliceExist);
        System.out.println(isabcExist);

        // CRUD | Create (add) Read Update Delete + loop
    }
}
