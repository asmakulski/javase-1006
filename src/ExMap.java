import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExMap {

    public static void main(String[] args) {
        String currency1 = "PLN";
        String currency2 = "CHF";
        String currency3 = "USD";
        String currency4 = "USD";

        Double maxValue1 = 4.30;
        Double maxValue2 = 3.15;
        Double maxValue3 = 2.75;
        Double maxValue4 = 5.25;

        Map<String, Double> mapHash = new HashMap<>();

        mapHash.put(currency1, maxValue1);
        mapHash.put(currency2, maxValue2);
        mapHash.put(currency3, maxValue3);
        mapHash.put(currency4, maxValue4);

        Map<String, Double> mapTree = new TreeMap<>();
        mapTree.put(currency1, maxValue1);
        mapTree.put(currency2, maxValue2);
        mapTree.put(currency3, maxValue3);
        mapTree.put(currency4, maxValue4);

        System.out.println("Whole collection of a HashMap");
        System.out.println(mapHash);
        System.out.println("Keys: " + mapHash.keySet());
        System.out.println("Values: " + mapHash.values());

        System.out.println("Whole collection of a TreeMap");
        System.out.println(mapTree);
        System.out.println("Keys: " + mapTree.keySet());
        System.out.println("Values: " + mapTree.values());
        System.out.println();

        System.out.println("Each element of a HashMap (for loop)");
        for (String currency : mapHash.keySet()){
            System.out.println(currency + " - " + mapHash.get(currency));
        }

        System.out.println("Each element of a TreeMap (for loop)");
        for (String currency : mapTree.keySet()){
            System.out.println(currency + " - " + mapTree.get(currency));
        }
        System.out.println();

        System.out.println("Each element of a HashMap (get(Object key))");
        System.out.println(mapHash.get(currency1));
        System.out.println(mapHash.get(currency2));
        System.out.println(mapHash.get(currency3));
        System.out.println(mapHash.get(currency4));

        System.out.println("Each element of a TreeMap (get(Object key))");
        System.out.println(mapTree.get(currency1));
        System.out.println(mapTree.get(currency2));
        System.out.println(mapTree.get(currency3));
        System.out.println(mapTree.get(currency4));
    }





}
