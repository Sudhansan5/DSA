package Array;

import java.util.ArrayList;
import java.util.HashMap;

public class GoodPair {

    public int solve(ArrayList<Integer> A, int B) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<A.size();i++){
            int diff = B-A.get(i);
            if (map.containsKey(diff)){
                return 1;
            }
            else {
                map.put(A.get(i),i);
            }
        }
        return 0;
    }
}
