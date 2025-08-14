package HashTables;

import java.util.ArrayList;
import java.util.List;

public class Hash {

    private int bucketCount;
    private List<List<Integer>> table;

    // Constructor to initialise the hash table with given bucket count
    public Hash(int buckets){
        bucketCount = buckets;
        table = new ArrayList<>();

        for (int i = 0; i < bucketCount; i++){
            table.add(new ArrayList<>());
        }
    }

    public void insert(int key){

        // Get the hash index for the key
        int index = getHashIndex(key);

        // Insert the key into the corresponding bucket
        table.get(index).add(key);
    }

    public void remove(int key){
        int index = getHashIndex(key);
        table.get(index).remove(Integer.valueOf(key));
    }

    public void display(){
        for (int i = 0;i < bucketCount; i++){
            System.out.print(i);

            for (int key : table.get(i)){
                System.out.print(" --> " + key);
            }

            System.out.println();
        }
    }

    private int getHashIndex(int key) {
        return key % bucketCount;
    }

    public static void main(String[] args) {
        int[] keys ={7, 18, 12, 25};

        Hash hashTable = new Hash(7);

        for (int key : keys){
            hashTable.insert(key);
        }

        hashTable.remove(12);
        hashTable.display();
    }
}
