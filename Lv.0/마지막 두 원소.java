/**
 * 문제: 마지막 두 원소
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181927
 * 키워드: 반복문, 삼항연산자
 */

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];

        for(int i = 0; i< num_list.length; i++){
            answer[i] = num_list[i];
        }
        int a = num_list[num_list.length - 1];
        int b = num_list[num_list.length - 2];
        answer[answer.length-1] = a > b ? a-b : a*2;

        return answer;
    }
}