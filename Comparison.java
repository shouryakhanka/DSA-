public class Comparison {
    public static void main(String[] args) {
        String a = "Shourya";
        String b = "Shourya";

        String c = a;
        System.out.println(c == a);

        // // ==
        // System.out.println(a == b);
        String name1 = new String("Shourya   ");
        String name2 = new String("Shourya");

        System.out.println(name1 .equals(name2));
    }
}
