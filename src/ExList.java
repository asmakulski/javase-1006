import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExList {

    public static void main(String[] args) {
        String color1 = "white";
        String color2 = "black";
        String color3 = "red";
        String color4 = "blue";
        String color5 = "blue";

        List<String> listArray = new ArrayList<>();
        listArray.add(color1);
        listArray.add(color2);
        listArray.add(color3);
        listArray.add(color4);
        listArray.add(color5);

        List<String> listLinked = new LinkedList<>();
        listLinked.add(color1);
        listLinked.add(color2);
        listLinked.add(color3);
        listLinked.add(color4);
        listLinked.add(color5);

        System.out.println("Whole collection of an ArrayList");
        System.out.println(listArray);

        System.out.println("Whole collection of an LinkedList");
        System.out.println(listLinked);
        System.out.println();

        System.out.println("Each element of an ArrayList (for loop)");
        for (String color : listArray){
            System.out.println(color);
        }

        System.out.println("Each element of an LinkedList (for loop)");
        for (String color : listLinked){
            System.out.println(color);
        }
        System.out.println();

        System.out.println("Each element of an ArrayList (get(int index))");
        System.out.println(listArray.get(0));
        System.out.println(listArray.get(1));
        System.out.println(listArray.get(2));
        System.out.println(listArray.get(3));
        System.out.println(listArray.get(4));

        System.out.println("Each element of an LinkedList (get(int index))");
        System.out.println(listLinked.get(0));
        System.out.println(listLinked.get(1));
        System.out.println(listLinked.get(2));
        System.out.println(listLinked.get(3));
        System.out.println(listLinked.get(4));
    }

}
