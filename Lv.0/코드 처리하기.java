/**
 * 문제: 코드 처리하기
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181932
 * 키워드: 반복문, 제어문, String.length, 증감연산자, isEmpty()
 */

class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        for(int i = 0; i< code.length(); i++){
            if(code.charAt(i) == '1'){
                mode = 1 - mode;
            }
            else {
                if(mode == 0 && i % 2 == 0){
                    answer += code.charAt(i);
                }
                else if (mode == 1 && i % 2 != 0){
                    answer += code.charAt(i);
                }
            }
        }
        return answer.isEmpty() ? "EMPTY" : answer ;
    }
}