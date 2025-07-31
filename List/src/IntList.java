public class IntList {

    public int first;
    public IntList rest;

    IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    /** Return the size of the list using no recursion*/
    public int iterativerSize(){
        int count = 0;
        IntList p = this;
        while(p != null){
            count += 1;
            p = p.rest;
        }
        return count;
    }

    /** Return the size of the list using recursion */
    public int size(){
        if(this.rest == null){
            return 1;
        }else{
            return this.rest.size() + 1;
        }
    }

    /** return the ith item of this Inist. */
    public int get(int i){
        IntList p = this;
        for(int j = i; j > 0; j--){
            if(p.rest == null){
                return 1111111;
            }
            p = p.rest;
        }
        return p.first;
    }

    public int nbGet(int i){
        if(i == 0){
            return this.first;
        }
        return this.rest.get(i - 1);
    }

    public static void main(String[] args){
        IntList L = new IntList(1, null);
        L.rest = new IntList(2, null);
        L.rest.rest = new IntList(3, null);

        IntList N = new IntList(15, null);
        N = new IntList(10, N);
        N = new IntList(5, N);
    }
}
