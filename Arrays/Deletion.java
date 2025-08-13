package Arrays;

import java.util.Arrays;

public class Deletion {
    public static void main(String[] args) {
        int[] tags = new int[10];
        int n = tags.length;

        for (int i = 0;i < n;i++){
            tags[i] = i + 10;
            System.out.println("Tags[" + i + "] = " + tags[i]);
        }
        System.out.println("Array before deletion: ");
        System.out.println("Tags = " + Arrays.toString(tags));

        for (int i = 1; i < n-1; i++){
            tags[i] = tags[i+1];
            n = n - 1;
        }

        System.out.println("Array after deletion: ");
        for (int i = 0; i < n; i++){
            System.out.println("Tags[" + i + "] = " + tags[i]);
            //System.out.println("Tags =[" + Arrays.toString(tags) + "]");
        }
    }
}
