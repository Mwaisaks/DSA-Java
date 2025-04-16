public class SpecialArraySum {

    public static int getSum(int[] arr1){
        int n = arr1.length;
        if (n % 2 == 0)
            return 0;

        int sum = 0;
        for (int i = 0;i < n; i++){
            sum += arr1[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,2,3,4,5};
        System.out.println(getSum(arr1));
        System.out.println(getSum(arr2));
    }
}

/*
Time Complexity Analysis:

Best Case: The order of growth will be constant because in the best case we are assuming that (n) is even.
Average Case: In this case, we will assume that even and odd are equally likely, therefore Order of growth will be linear
Worst Case: The order of growth will be linear because in this case, we are assuming that (n) is always odd.
 */