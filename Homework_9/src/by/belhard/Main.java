package by.belhard;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Создайте HashMap, содержащий пары значений – код товара и объект товара (класс Product определите сами, но в нём должно быть, как минимум название).
 * Перебрать и распечатать пары значений - entrySet().
 * Перебрать и распечатать набор из имен продуктов - keySet().
 * Перебрать и распечатать значения продуктов - values().
 * Для каждого перебора создать свой метод.
 */

public class Main {
    public static void printEntrySet(Map<Integer, Product> products) {
        Set<Map.Entry<Integer, Product>> entries = products.entrySet();

        for (Map.Entry<Integer, Product> entry : entries) {
            Product value = entry.getValue();
            Integer key = entry.getKey();
            System.out.println(key + " " + value.getName());
        }

    }
    public static void printKeySet(Map<Integer, Product> products) {
        Set<Integer> keySet = products.keySet();

        for (Integer key : keySet) {
            System.out.println(key);
        }
    }
    public static void printValue(Map<Integer, Product> products) {

        Collection<Product> valuesSet = products.values();
        for (Product val : valuesSet) {
            System.out.println(val.getName());
        }
    }

    public static void main(String[] args) {

        Map<Integer, Product> products = new HashMap<>();

        products.put(1, new Product("Table"));
        products.put(2, new Product("Microwave"));
        products.put(3, new Product("Book"));

        printEntrySet(products);
        printKeySet(products);
        printValue(products);
    }
}