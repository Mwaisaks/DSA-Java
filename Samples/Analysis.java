import java.util.Arrays;

public class Analysis {

    public static int search(int[] arr, int x){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 10, 30, 15};
        int x = 30;
        System.out.println(search(arr, x));
    }
}y

/*
Best Case: Constant Time irrespective of input size. This will take place if the element to be searched is on the first index of the given list. So, the number of comparisons, in this case, is 1.
Average Case: Linear Time, This will take place if the element to be searched is at the middle index (in an average search) of the given list.
Worst Case: The element to be searched is not present in the list
 */