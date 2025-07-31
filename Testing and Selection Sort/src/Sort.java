public class Sort {

    /** Sorts strings destructively */
    public static void sort(String[] input){
        // find the smallest item
        // move it to the front
        // selection sort the rest (using recursion?)
        sort(input, 0);

    }

    /** Sorts string destructively starting from item start*/
    private static void sort(String[] input, int start){
        if (start == input.length){
            return;
        }
        int smallest = findSmallest(input, start);
        swap(input, start, smallest);
        sort(input, start + 1);

    }

    /** Returns the smallest string int x. */
    public static int findSmallest(String[] x, int start){
        int smallest = start;
        for(int i = start; i < x.length; i++){
            if(x[i].compareTo(x[smallest]) < 0){
                smallest = i;
            }
        }
        return smallest;
    }

    /** Swap a and b*/
    public static void swap(String[] x, int a, int b) {
        String temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }

    /** for fun*/
    public static int add(int[] x){
        int sum = 0;
        for(int i = 0; i < x.length; i++){
            sum += x[i];
        }
        return sum ;
    }

}
