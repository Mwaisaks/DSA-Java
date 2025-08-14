package SearchingAlgorithms;

public class Search {

    static int linearSearch(int[] arr, int value){

        int i = 1;
        int n = arr.length;

        for (i = 0; i < n; i++){
            if (arr[i] == value)
                return i;
        }
        return -1;
    }

    static int binarySearch(int[] arr, int value){
        int low = 0, high = arr.length - 1;

        while (low <= high){

            int mid = low + (high - low) / 2;

            if (arr[mid] == value)
                return mid;

            if (arr[mid] < value)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    static int interpolationSearch( int[] arr, int low, int high, int value){
        int position;

        if (low <= high && value >= arr[low] && value <= arr[high]){

            // Probing the position with keeping uniform distribution in mind
            position = low + ((high - low) / (arr[high] - arr[low]))
                    * (value - arr[low]);

            // Condition of target found
            if (arr[position] == value)
                return position;

            // If x is larger, x is in right sub array
            if (arr[position] < value)
                return interpolationSearch(arr, position + 1, high, value);

            // If value is smaller, value is in the left sub array
            if (arr[position] > value)
                return interpolationSearch(arr, low, position - 1, value);

        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {43, 52, 74, 92, 61, 20};
        int[] arr2 = { 2, 3, 4, 10, 40 };
        int arr3[] = { 10, 12, 13, 16, 18, 19, 20, 21,
                22, 23, 24, 33, 35, 42, 47 };

        int x = 92, y = 10;
        int n = arr3.length;
        int result = linearSearch(arr, x);
        int result2 = binarySearch(arr2, y);
        int result3 = interpolationSearch(arr3, 0, n - 1, y);

        if (result == -1)
            System.out.println("Element is not present in array!");
        else
            System.out.println("Element " + x +" is present at index " + result);

        if (result2 == -1)
            System.out.println("Element is not present in array!");
        else
            System.out.println("Element " + y +" is present at index " + result2);

        if (result3 == -1)
            System.out.println("Element is not present in array!");
        else
            System.out.println("Element " + y +" is present at index " + result3);
    }
}
