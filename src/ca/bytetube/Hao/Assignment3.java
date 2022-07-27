package ca.bytetube.Hao;

public class Assignment3 {
    public static void main(String[] args) {
        System.out.println(InsertByBinary(new int[]{1, 3, 6, 23, 54,54,54, 72, 103, 409, 678}, 54));
//        System.out.println(InsertByBinary(new int[]{1, 3, 6, 23, 54, 72, 103, 409, 678}, 0));
//        System.out.println(InsertByBinary(new int[]{1, 3, 6, 23, 54, 72, 103, 409, 678}, 700));
//        System.out.println(InsertByBinary(new int[]{1, 3, 6, 23, 54, 72, 103, 409, 678}, 100));
//        System.out.println(InsertByBinary(new int[]{1, 3, 6, 23, 54, 72, 103, 409, 678}, 48));

    }

    public static int InsertByBinary(int arr[], int v) {
        if (arr == null || arr.length == 0) return -1;

        return InsertByBinary3(arr, 0, arr.length, v);
    }

//    public static int InsertByBinary2(int arr[], int begin, int end, int v) {
//
//        int mid = begin + (end - begin) / 2;
//        if (v >= arr[end - 1]) return end;
//        if (v <= arr[begin]) return begin;
//        if (arr[mid - 1] > v) {
//            return InsertByBinary2(arr, begin, mid - 1, v);
//        } else if (arr[mid + 1] < v) {
//            return InsertByBinary2(arr, mid + 1, end, v);
//        } else if (arr[mid] >= v && arr[mid - 1] <= v) {
//            return mid;
//        } else return mid + 1;
//
//
//    }
    public static int InsertByBinary3(int arr[], int begin, int end, int v) {
        while(begin <= end){
            int mid = begin + (end - begin) / 2;
            if(arr[mid] > v){
                end = mid;
            } else  {
                begin = mid + 1;
            }
        }
        return begin;


    }

}
