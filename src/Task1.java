public class Task1 {
    public static void main(String[] args) {
        int h = 0, z = 40;
        while (h < 23) {
            System.out.println("h=" + h);
            h = h + 1;
        }
        do {
            h = h + 1;
            System.out.println("z=" + z);
        }
        while (z < 39);
    }
}
