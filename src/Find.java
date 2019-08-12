public class Find {

    /**
     * @param a           查询的原数组
     * @param serachValue 要查找的元素值
     * @return 返回查找的位置，-1代表没找到
     */
    public static int binarySearch(int[] a, int serachValue) {

        int left = 0;
        int right = a.length - 1;

        if (serachValue < a[left] || serachValue > a[right]) {
            return -1;
        }

        if (left > right) {
            if (a[left] == serachValue) {
                return 0;
            } else {
                return -1;
            }
        }

        while (left <= right) {
            int middle = (left + right) / 2;
            if (a[middle] > serachValue) {
                right = middle - 1;
            } else if (a[middle] < serachValue) {
                left = middle + 1;
            } else {
                return middle;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5, 6, 7, 8};
        int index = binarySearch(a, 3);
        System.out.println(index);
    }

}
