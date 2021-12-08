package ru.mirea.Тask27;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Кейдж", "Николас");
        map.put("Стетхем", "Джейсон");
        map.put("Бонд", "Джеймс");
        map.put("Магнум", "Феррум");
        map.put("Красный", "Магнус");
        map.put("Элрик", "Эдвард");
        map.put("Руки-ножницы", "Эдвард");
        map.put("Гордон", "Рамзи");
        map.put("Врангель", "Николас");
        map.put("test", "test2");
        System.out.println("словарь до изменений: \n");

        for (HashMap.Entry entry: map.entrySet()) {
            System.out.println(entry);
        }
        System.out.println("\nсловарь после изменений: \n");
        HashMap<String,Integer> count=new HashMap<>();
        for(Map.Entry<String,String>entry: map.entrySet())
            if(count.containsKey(entry.getValue()))
                count.put(entry.getValue(),count.get(entry.getValue())+1);
            else
                count.put(entry.getValue(),1);

        for(Map.Entry<String,String> entry: new HashMap<>(map).entrySet())
            if(count.get(entry.getValue())>1)
                map.remove(entry.getKey());

        System.out.println(map);

        Map<String,ArrayList<String>> map1 = new HashMap();


    }
}
