package Practic.src.ru.mirea.task27;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String, String> fio = new HashMap<>();
        fio.put("Шатов", "Денис");
        fio.put("Шат", "Денис");
        fio.put("Шаов", "Ден");
        fio.put("Штов", "Дионис");
        fio.put("Шатов", "Олег");
        fio.put("Шатов", "Максим");
        fio.put("Шатов", "Саша");
        fio.put("Шатовкин", "Зорик");
        fio.put("Шатовидзе", "Георг");
        fio.put("Шатовян", "Никита");
        fio.remove("Шатов");
        System.out.println(fio + "\n\n");

        HashMap<String, ArrayList<String>> map = new HashMap<>();
        ArrayList<String> cities = new ArrayList<>();
        ArrayList<String> cities1 = new ArrayList<>();
        cities.add("Москва");
        cities.add("Санкт-Петербург");
        map.put("Россия", cities);
        cities1.add("Вашингтон");
        cities1.add("Нью-Йорк");
        map.put("США", cities1);
        System.out.println(map);
    }
}
