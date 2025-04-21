/**
 * 문제: 홀짝에 따라 다른 값 반환하기
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181935
 * 키워드: 조건문, 증감연산자, 홀짝
 */

class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n % 2 == 0){
            for(int i = 2; i<= n; i+=2) {
                answer += i * i;
            }
        }
        else if ((n+1) % 2 == 0){
            for(int i = 1; i<= n; i+=2) {
                answer += i;
            }
        }
        return answer;
    }
}