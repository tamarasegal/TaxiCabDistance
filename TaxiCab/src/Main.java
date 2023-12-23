public class Main {
    public static void tcgen(int xc, int yc, int tcd) {
        System.out.println(tcd*4 + " solutuons:");

        for (int i = 0; i < tcd; i++) {
            System.out.println("(" + ( (xc + i)) + ", " + (yc + (tcd - i)) + ")"); // all adding
            System.out.println("(" + (xc - i) + ", " +  ((yc - (tcd - i))) + ")"); // all subtracting
            System.out.println("(" + (xc + (tcd - i)) + ", " + ((yc - i)) + ")"); //x add, y subtract
            System.out.println("(" + (xc - (tcd-i)) + ", " + (yc + i) + ")"); //x subtract, y add
        }
        


    }


    public static void main(String[] args) {
        tcgen(-4, -3, 3);
        tcgen(4, 3, 3);
        tcgen(-4, 3, 3);
        tcgen(4, -3, 3);
    }

}