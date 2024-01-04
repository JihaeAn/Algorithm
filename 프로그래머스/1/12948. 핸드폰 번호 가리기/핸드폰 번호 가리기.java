class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String a = phone_number.substring(phone_number.length()-4);
    	for(int i=0; i<phone_number.length()-4; i++) {
    		answer += "*";
    	}
    	
    	System.out.println(answer + a);
       return answer + a;
    }
}