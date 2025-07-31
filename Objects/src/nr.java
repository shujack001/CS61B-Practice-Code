public class nr {

    public static void main(String[] args){
        int[] arr1 = {0, 1, 2, 3, 4, 5, 6};
        int[] dr = {-1, 0 , 1};
        for(int r = 0; r < arr1.length; r++){
            for(int i = 0; i < dr.length; i++){
                int nr = r + dr[i];
                if(nr >= 0 && nr < arr1.length){
                    arr1[r] = arr1[r] + arr1[nr];
                }
            }
        }
        for(int i : arr1){
            System.out.println(i);
        }
    }
}
