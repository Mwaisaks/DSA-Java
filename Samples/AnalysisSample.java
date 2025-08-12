public class AnalysisSample {

   // Linear Search
    public static int search(int[] arr, int x){
        for (int i = 0; i< arr.length; i++){
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    //Special Array Sum
    public static int getSum(int[] arr1){
        int n = arr1.length;

        if (n % 2 == 0)
            return 0;

        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += arr1[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 10, 20, 15};
        int x = 20;
        System.out.println(search(arr, x));

        int[] arr1 = {1, 2, 4, 3, 5 };
        System.out.println(getSum(arr));
        System.out.println(getSum(arr1));
    }


}