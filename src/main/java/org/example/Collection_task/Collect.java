package org.example.Collection_task;

import java.util.*;

public class Collect {
    //Task 3
    public static void main(){
        HashMap<String, String> emailDB = new HashMap<String, String>();
        emailDB.put("ex@mail.ru", "Ivanov Orc Ivanovich");
        emailDB.put("EEEEx@gmail.com", "Ivanova Orc Ivanovna");
        emailDB.put("Exxx@gmail.com", "Иванов Орк Иванович");
        for (HashMap.Entry<String, String> data: emailDB.entrySet()) System.out.println("Key: " + data.getKey() + " Value: " + data.getValue());
    //Task 4
        HashSet<Integer> Numbers = new HashSet<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Integer values as String: ");
        String input = "";
        input += sc.nextLine();
        System.out.println(input);
        String[] substrings = input.split(",");
        int value;
        for (int i = 0; i < substrings.length; i++) {
            value = Integer.parseInt(substrings[i].trim());
            Numbers.add(value);
        }
        System.out.print("Unique Values: ");
        System.out.println(Numbers.toString());
        // Task 5
        int[] Array = {0,1,1,1,1,2,3,2,4,5,5,6,6,7,8,9,1,2,3,4};
        Map<Integer, Integer> mapwithcnt = new HashMap<>();
        for (int e : Array) {
            if (mapwithcnt.containsKey((Integer)e) && mapwithcnt.get((Integer)e) >= 1) {
                mapwithcnt.put(e, mapwithcnt.get(e) + 1);
            } else {
                mapwithcnt.put((Integer)e, 1);
            }


//            mapwithcnt.containsKey(e) ?  mapwithcnt.put(e, mapwithcnt.get(e) + 1) : mapwithcnt.put(e, 1);
        }
        for (HashMap.Entry<Integer, Integer> e : mapwithcnt.entrySet()) {
            if (e.getValue() > 1)
            System.out.println("Число " + e.getKey() + " встречается " + e.getValue() + " раз(а).");
        }
    }

}
