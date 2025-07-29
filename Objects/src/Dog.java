
public class Dog {

    public int weightInPounds;
    public static String name = "Canis familiaris";

    Dog(int x) {
        weightInPounds = x;
    }

    /*    public static Dog maxDog(Dog d1, Dog d2){
            if (weightInPounds > d2.weightInPounds){
                return this;
            }
            return d2;
        }
    */
    public static void main(String[] args) {
        System.out.println(name);
    }
}
