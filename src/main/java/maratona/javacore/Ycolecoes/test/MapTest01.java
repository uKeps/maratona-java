package maratona.javacore.Ycolecoes.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "voce");
        map.putIfAbsent("vc2", "voce");
        System.out.println(map);
        for(String key : map.keySet()){
            System.out.println(key + " = " +map.get(key));
        }
        System.out.println("-----------------------");

        for(String value : map.values()){
            System.out.println(value);
        }

        System.out.println("---------------------");

        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
