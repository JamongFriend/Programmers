/**
 * 문제: 주사위 게임 2
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181930
 * 키워드: 조건문, 주사위
 */

class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if(a != b && a != c && b != c)
            answer = a+b+c;
        else if(a == b && a == c)
            answer = (a + b + c) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);
        else
            answer = (a + b + c) * (a*a + b*b + c*c);
        return answer;
    }
}