package com.homework.lesson18;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    public static void dictionaryList() {

        System.out.println("English-Romanian Dictionary ");
        HashMap<String, String> word = new HashMap<String, String>();
        word.put("Advice", "Sfat");
        word.put("Borrow", "Împrumuta");
        word.put("Dog", "Căine");
        word.put("Employee", "Angajat");
        word.put("Gift", "Cadou");
        word.put("Mistake", "Greșeală");
        word.put("Necklace", "Colier");
        word.put("Tired", "Obosit");
        word.put("Village", "Sat");
        word.put("Yacht", "Iaht");
for (Map.Entry<String, String> item: word.entrySet()){
    System.out.println(item.getKey() + " - " + item.getValue());
}
    }

}
