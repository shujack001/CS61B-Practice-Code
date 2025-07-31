public class walrus {
    int weight;
    double years;

    walrus(int w, double y){
        weight = w;
        years = y;

    }
    public static void main(String[] args){
        walrus a = new walrus(1000, 8.3);
        walrus b;
        b = a;
        b.weight = 5;
        System.out.println(a);
        System.out.println(b);

        int x = 5;
        int y;
        y = x;
        y = 2;
        System.out.println("y is " + y);
        System.out.println("x is "+ x);

        char c = 'H';
        int d = c;
        System.out.println(c);
        System.out.println(d);
    }
}
