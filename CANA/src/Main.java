public class Main {
    public static void main(String[] args) {
        int[] Array = {8,6,3,10,2,4,1,9,5};

        insertionSort.insertion(Array);

        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");

        }

    }
}