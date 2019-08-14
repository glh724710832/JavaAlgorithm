public class Find {

    /**
     * @param a           查询的原数组
     * @param serachValue 要查找的元素值
     * @return 返回查找的位置，-1代表没找到
     */
    public static int binarySearch(int[] a, int serachValue) {

        int left = 0;
        int right = a.length - 1;
        boolean falg = false;
        for(int i=0;i<a.length-1;i++){
            if(a[i+1] - a[i] > 0){
                //正序
                falg = true;
                break;
            }else if(a[i+1] - a[i] < 0){
                //反序
                falg = false;
                break;
            }
        }

        if(falg) {
            if (serachValue < a[left] || serachValue > a[right]) {
                return -1;
            }
        }else {
            if (serachValue > a[left] || serachValue < a[right]) {
                return -1;
            }
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
                if(falg) {
                    //正序
                    right = middle - 1;
                }else {
                    //反序
                    left = middle + 1;
                }
            } else if (a[middle] < serachValue) {
                if(falg) {
                    //正序
                    left = middle + 1;
                }else {
                    //反序
                    right = middle -1;
                }
            } else {
                return middle;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8};
        int index = binarySearch(a, 3);
        System.out.println(index);
    }

}
