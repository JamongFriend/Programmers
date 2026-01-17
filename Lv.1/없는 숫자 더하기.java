/**
 * 문제: 없는 숫자 더하기
 * 난이도: Lv.1
 * 분류: 연습문제
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12916
 * 문제 설명:
 *0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
 * numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록
 * solution 함수를 완성해주세요.
 *
 * 풀이 전략:
 */

class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        for(int i = 0; i<10; i++){
            for(int j : numbers){
                if( i == j) {
                    answer -= i;
                }
            }
        }
        return answer;
    }
}
