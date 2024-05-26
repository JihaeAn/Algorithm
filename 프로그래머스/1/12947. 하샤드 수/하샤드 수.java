class Solution {
    public boolean solution(int x) {
        String s = x + "";
            String str [] = s.split("");

            int sum = 0;
            for(int i = 0; i<str.length; i++){
                sum += Integer.parseInt(str[i]);
            }

            boolean answer = (x % sum != 0) ? false : true;
        return answer;
    }
}