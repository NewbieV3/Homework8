public class Task {
    public static void main(String[] args) {
        int value = 3;
        boolean result = isSimple(value);
        System.out.println(result);
    }

    public static boolean isSimple(int value) {
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
}
