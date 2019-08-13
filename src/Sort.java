public class Sort {

    //冒泡排序
    public static void maoPao(int[] a) {
        if (a.length == 0 && a.length == 1) {
            return;
        }
        int times = 0;
        boolean isExchage = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - (i + 1); j++) {
                times++;
                if (a[j] > a[j + 1]) {
                    int zhong = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = zhong;
                    isExchage = true;
                }
            }

            if (!isExchage) {
                break;
            }
        }
        System.out.println("比较的次数：" + times);
    }

    //选择排序
    public static void xuanZhe(int[] a) {
        if (isOrdered(a)) {
            return;
        }
        int times = 0;
        for (int i = 0; i < a.length; i++) {
            int currentIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                times++;
                if (a[j] < a[currentIndex]) {
                    currentIndex = j;
                }
            }
            //进行交换
            if (currentIndex != i) {
                int zhong = a[currentIndex];
                a[currentIndex] = a[i];
                a[i] = zhong;
            }
        }
        System.out.println("比较的次数:" + times);
    }

    //插入排序
    public static void chaRu(int[] a){
        int times = 0;
        for(int i=0;i<a.length;i++){
            for(int j=i;j>0;j--){
                times++;
               if(a[j] < a[j-1]){
                   int zhong = a[j];
                   a[j] = a[j-1];
                   a[j-1] = zhong;
               }
            }
        }
        System.out.println("比较的次数："+times);
    }

    //快速排序
    public static void quickSort(int[] a){

    }

    public static boolean isOrdered(int[] a) {
        int orderCount = 0;
        int times = 0;
        for (int i = 0; i < a.length - 1; i++) {
            times++;
            if (a[i + 1] >= a[i]) {
                orderCount++;
            }
        }
        if (orderCount == a.length - 1) {
            System.out.println("比较的次数：" + times);
            return true;
        }
        return false;
    }

    public static void printfArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        chaRu(a);
        printfArray(a);
    }

}
