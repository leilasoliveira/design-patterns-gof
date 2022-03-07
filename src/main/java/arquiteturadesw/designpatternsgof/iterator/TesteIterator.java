package arquiteturadesw.designpatternsgof.iterator;

import java.util.*;

public class TesteIterator {

    public static void main(String[] args) {
        List<String> lista = Arrays.asList("ITEM 1", "ITEM 2", "ITEM 3");
        String[] itens = new String[]{"ITEM 4", "ITEM 5"};
        Map<Integer, String> map = new HashMap<>();
        map.put(6, "ITEM 6");
        map.put(7, "ITEM 7");

        iterate(lista.iterator());
        iterate(Arrays.stream(itens).iterator());
        iterate(map.keySet().iterator());
        iterate(map.values().iterator());
    }

    private static void iterate(Iterator iterator) {
        while (iterator.hasNext()) {
            // do something
        }
    }


}
