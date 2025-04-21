/**
 * 문제: 주사위 게임 2
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181929
 * 키워드: 반복문, 삼항 연산자
 */

class Solution {
    public int solution(int[] num_list) {
        int num1 = 1;
        int num2 = 0;
        for(int i=0; i<num_list.length; i++) {
            num1 *= num_list[i];
            num2 += num_list[i];
        }
        num2 = num2*num2;

        return num1 < num2 ? 1 : 0;
    }
}