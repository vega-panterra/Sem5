package Sem5;

// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
// их необходимо считать, как одного человека с разными телефонами.
// Вывод должен быть отсортирован по убыванию числа телефонов.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }

    public static void printBook(Map<String, ArrayList<Integer>> map) {
        for (var item : map.entrySet()) {
            String phones = "";
            for (int el : item.getValue()) {
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }

    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> phoneBook = new HashMap<>();
        addNumber("Степанова Ольга", 264537684, phoneBook);
        addNumber("Володин Виталий", 164579732, phoneBook);
        addNumber("Петрухин Алексей", 785432789, phoneBook);
        addNumber("Корнеева Светлана", 854326789, phoneBook);
        addNumber("Корнеева Светлана", 135488887, phoneBook);
        addNumber("Степанова Ольга", 234678905, phoneBook);
        addNumber("Володин Виталий", 265783552, phoneBook);
        addNumber("Орехова Лидия", 165427890, phoneBook);
        addNumber("Степанова Ольга", 123456789, phoneBook);
        addNumber("Корнеева Светлана", 234583345, phoneBook);
        printBook(phoneBook);
    }
}