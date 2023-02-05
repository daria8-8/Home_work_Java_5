import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ex1{
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }
    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Lebedeva", 892043456, bookPhone);
        addNumber("Lebedeva", 892545633, bookPhone);
        addNumber("Kotova", 893033045, bookPhone);
        addNumber("Musina", 895647744, bookPhone);
        addNumber("Lebedeva", 893456721, bookPhone);
        addNumber("Kotova", 891523400, bookPhone);
        printBook(bookPhone);
       }
}