package task23.ex1;

import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();

        map.put("Бобр", "Плотинов");
        map.put("Змея", "Травяная");
        map.put("Бык", "Сполей");
        map.put("Зебра", "Саванная");
        map.put("Конь", "Степной");
        map.put("Лиса", "Северная");
        map.put("Олень", "Северный");
        map.put("Змеюка", "Травяная");
        map.put("Корова", "Сполей");
        for (String key: map.keySet()) {
            int count = 0;
            String value = map.get(key);
            if (!map2.containsValue(value)) {
                Iterator<String> it = map.values().iterator();
                while (it.hasNext()) {
                    String str = it.next();
                    if (str.equals(value)) {
                        count += 1;
                    }
                }
                if (count == 1) {
                    map2.put(key, value);
                }
            }
        }

        System.out.println(map);
        System.out.println(map2);
    }
}
