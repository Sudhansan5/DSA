package Array;

import java.util.ArrayList;
import java.util.HashMap;

public class GoodPair {

    /**
     * Checks if there exists a pair in the array which sums up to B
     * @param A the input array
     * @param B the target sum
     * @return 1 if there is a pair, 0 otherwise
     */
    public int solve(ArrayList<Integer> A, int B) {
        // Store the elements of the array in a HashMap
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<A.size();i++){
            // Calculate the difference of the current element and the target sum
            int diff = B-A.get(i);
            // Check if the difference is already present in the HashMap
            if (map.containsKey(diff)){
                // If yes, return 1
                return 1;
            } 
            else {
                // Else add the current element to the HashMap
                map.put(A.get(i),i);
            }
        }
        // If no pair is found, return 0
        return 0;
    }
}
