class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int Psum = 0;
        int Ysum = 0;

        char[] str = s.toCharArray();

        for(int i = 0; i < str.length; i++){
            if(str[i] == 'Y' || str[i] == 'y'){
                Ysum += 1;
            }else if(str[i] == 'P' || str[i] == 'p'){
                Psum += 1;
            }
        }
    if(Psum != Ysum) {
        answer = false;
    }
        return answer;
    }
}
