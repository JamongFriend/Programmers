/**
 * 문제: 문자 리스트를 문자열로 변환하기
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181941
 * 키워드: for문
 */

class Solution {
    public String solution(String[] arr) {
        String answer = "";
        for(int i=0; i< arr.length; i++){
            answer += arr[i];
        }
        return answer;
    }
}