package telran.interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class InterviewTasks {
    /**
     * 
     * @param array
     * @param sum
     * @return true if a given array comprise of two numbers, 
     * summing of which gives the value equaled to a given "sum" value (1,2,3,4 -> 7. true; 1,2,3,4 -> 100. false)
     */
    public static boolean hasSumTwo(int[] array, int sum) {
        boolean res = false;
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++){
                if((array[i] + array[j]) == sum) {
                    res = true;
                }
            }
        }
        return res;
    }
    public static boolean hasSumTwo2(int[] array, int sum) {
        boolean res = false;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < array.length; i++) {
           int complement = sum - array[i];
           if(set.contains(complement)) {
            res = true;
           }
           set.add(array[i]);
        }
        return res;
    }
}