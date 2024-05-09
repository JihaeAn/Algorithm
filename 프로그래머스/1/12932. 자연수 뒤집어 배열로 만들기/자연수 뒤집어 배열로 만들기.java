class Solution {
    public int[] solution(long n) {

            String s1 = n + "";
            int answer [] = new int [s1.length()];

            for(int i = 0; i < answer.length; i++){
                answer[i] = Integer.parseInt(s1.substring(s1.length()-i -1, s1.length()-i));
                System.out.println(answer[i]);
            }
            
    return answer;
    }
}