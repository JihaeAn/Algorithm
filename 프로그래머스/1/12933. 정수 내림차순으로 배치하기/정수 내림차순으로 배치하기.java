import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String stringNum = n+"";
        String arr[] = stringNum.split("");
        Arrays.sort(arr,Collections.reverseOrder());

        String str ="";
        for(int i = 0; i<arr.length; i++){
            str += arr[i];
        }
        
        return Long.parseLong(str);
    }
}