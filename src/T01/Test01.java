package T01;

public class Test01 {

    /**
     * 输出n的锥形塔，比如n = 4
     * 1
     * 1 2
     * 1 2 3
     * 1 2 3 4
     * 1 2 3
     * 1 2
     * 1
     */
    public static void t01(int n) {
        int times = n * 2 - 1;
        for (int i = 0; i < times; i++) {
            int number = i + 1;
            if (number > n) number = n - (number - n);
            String printfString = "";
            for (int j = 1; j <= number; j++) {
                printfString = printfString + j + " ";
            }
            System.out.println(printfString + "\n");
        }
    }

    public static void main(String[] args) {
        t01(9);
    }

}
