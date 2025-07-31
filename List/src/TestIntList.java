import org.junit.Test;

import static org.junit.Assert.*;

public class TestIntList {

    @Test
    public void testGet() {
        IntList L = new IntList(5, null);
        L.rest = new IntList(10, null);
        L.rest.rest = new IntList(15, null);
        int actual1 = L.nbGet(0);
        int excepted1 = 5;
        int actual2 = L.nbGet(1);
        int excepted2 = 10;
        int actual3 = L.nbGet(2);
        int excepted3 = 15;
        assertEquals(excepted1, actual1);
        assertEquals(excepted2, actual2);
        assertEquals(excepted3, actual3);
    }

//    public static void main(String[] args){
//    }
}
