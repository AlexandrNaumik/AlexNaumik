import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

    public class Task2 {
        public static void main(String[] args) {
            Products products1 = new Products(0001, "Двигатель");
            Products products2 = new Products(1002, "КПП");
            Products products3 = new Products(2003, "Бампер");
            Products products4 = new Products(3004, "Проводка");

            Map<Integer, Products> productsMap = new HashMap<>();
            productsMap.put(products1.getCode(), products1);
            productsMap.put(products2.getCode(), products2);
            productsMap.put(products3.getCode(), products3);
            productsMap.put(products4.getCode(), products4);

            printEntries(productsMap);
            printKeys(productsMap);
            printValues(productsMap);

        }

        private static void printEntries(Map<Integer, Products> productsMap) {
            Set<Map.Entry<Integer, Products>> entries = productsMap.entrySet();
            for (Map.Entry<Integer, Products> entry : entries) {
                System.out.println("Key= " + entry.getKey());
                System.out.println("value= " + entry.getValue());
            }
        }

        private static void printKeys(Map<Integer, Products> productsMap) {
            System.out.println("Вывести все ключи");
            Set<Integer> keyS = productsMap.keySet();
            for (Integer key : keyS) {
                System.out.println(key);
            }
        }

        private static void printValues(Map<Integer, Products> productsMap) {
            System.out.println("Вывести все объекты");
            Collection<Products> values = productsMap.values();
            for (Products value : values) {
                System.out.println(value);
            }

        }
    }

