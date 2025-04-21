/**
 * 문제: 간단한 논리 연산
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181917
 * 키워드:  반복문, 조건문, 논리형
 */

class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean x5 = true, x6 = true;

        if(x1 == false && x2 == false)
            x5 = false;
        if(x3 == false && x4 == false)
            x6 = false;

        if(x5 == true && x6 == true)
            return answer;
        else
            return answer = false;
    }
}