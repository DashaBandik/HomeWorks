package by.belhard;

import java.util.HashMap;
import java.util.Map;

/**Напишите метод, который получает на вход массив элементов типа К (Generic) и возвращает Map<K, Integer>,
 * где K — значение из массива, а Integer — количество вхождений в массив.
 То есть сигнатура метода выглядит так:
 <K> Map<K, Integer> arrayToMap(K[] ks);
 То есть, если массив похож на {1,2,4,4}, то map будет выглядеть как {1:1, 2:1, 4:2}
 **/


 public class Generics{
    public static void main(String[] args) {
    Integer[] array = new Integer[]{1,1,1,2,4,4,5,4};

    Map<Integer, Integer> ar = arrayToMap(array);
        System.out.println(ar);
    }

    public static <K> Map<K, Integer> arrayToMap(K[] keys){
        Map<K, Integer> map = new HashMap<>();
        for (int i =0; i < keys.length; i++){
            int amount = 1;
            K key = keys[i];
            if (map.containsKey(key) == true){
                amount = map.get(key) + 1;
            }
            map.put(key, amount);
        }



        return map;
    }

}
