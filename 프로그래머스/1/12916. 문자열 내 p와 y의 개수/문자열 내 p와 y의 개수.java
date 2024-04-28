class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int Psum = 0;
        int Ssum = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.substring(i, i+1).equals("p") || s.substring(i, i+1).equals("P")){
                Psum += 1;
            }else if(s.substring(i, i+1).equals("y") || s.substring(i, i+1).equals("Y")){
                Ssum += 1;
            }
        }

        if(Psum != Ssum) answer = false;

        return answer;
    }
}