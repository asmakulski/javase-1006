public class ExArray {

    private  static int[] tab = new int[10];

    public static void main(String[] args) {
        fillTable(8);
        printTable();
    }

    public static void fillTable(int startingNumber){
        for (int i = 0; i < tab.length; i++){
            tab[i] = startingNumber + i;
        }
    }

    public static void printTable(){
        for (int i = 0; i < tab.length; i++){
            System.out.println(tab[i]);
        }
    }
}

