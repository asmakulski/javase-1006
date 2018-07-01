import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExSet {

    public static void main(String[] args) {
        String color1 = "white";
        String color2 = "black";
        String color3 = "red";
        String color4 = "blue";
        String color5 = "blue";

        Set<String> setHash = new HashSet<>();
        setHash.add(color1);
        setHash.add(color2);
        setHash.add(color3);
        setHash.add(color4);
        setHash.add(color5);

        Set<String> setTree = new TreeSet<>();
        setTree.add(color1);
        setTree.add(color2);
        setTree.add(color3);
        setTree.add(color4);
        setTree.add(color5);

        System.out.println("Whole collection of a HashSet");
        System.out.println(setHash);

        System.out.println("Whole collection of a TreeSet");
        System.out.println(setTree);
        System.out.println();

        System.out.println("Each element of a HashSet (for loop)");
        for (String color : setHash){
            System.out.println(color);
        }


        System.out.println("Each element of a TreeSet (for loop)");
        for (String stringOfCharacters : setTree){
            System.out.println(stringOfCharacters);
        }

    }


}


