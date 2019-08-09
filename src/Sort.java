public class Sort {

    //冒泡排序
    public static void maoPao(int[] a) {
        if (a.length == 0 && a.length == 1) {
            return;
        }
        int times = 0;
        boolean isExchage = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - (i+1); j++) {
                times++;
                if (a[j] > a[j + 1]) {
                    int zhong = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = zhong;
                    isExchage = true;
                }
            }

            if(!isExchage){
                break;
            }
        }
        System.out.println("比较的次数：" + times);
    }

    public static void printfArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8};
        maoPao(a);
        printfArray(a);
    }

}
