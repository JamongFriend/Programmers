/**
 * 문제: 괄호 회전하기
 * 난이도: Lv.2
 * 분류: 완전탐색
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/76502
 * 문제 설명:
 * 다음 규칙을 지키는 문자열을 올바른 괄호 문자열이라고 정의합니다.
 *
 * (), [], {} 는 모두 올바른 괄호 문자열입니다.
 * 만약 A가 올바른 괄호 문자열이라면, (A), [A], {A} 도 올바른 괄호 문자열입니다.
 * 예를 들어, [] 가 올바른 괄호 문자열이므로, ([]) 도 올바른 괄호 문자열입니다.
 * 만약 A, B가 올바른 괄호 문자열이라면, AB 도 올바른 괄호 문자열입니다.
 * 예를 들어, {} 와 ([]) 가 올바른 괄호 문자열이므로, {}([]) 도 올바른 괄호 문자열입니다.
 *
 * 대괄호, 중괄호, 그리고 소괄호로 이루어진 문자열 s가 매개변수로 주어집니다.
 * 이 s를 왼쪽으로 x (0 ≤ x < (s의 길이)) 칸만큼 회전시켰을 때 s가 올바른 괄호 문자열이 되게 하는 x의 개수를 return 하도록 solution 함수를 완성해주세요.
 *
 * 풀이 전략:
 * 문자열을 문자하나씩 회전시키면서 비교
 * 각 회전된 문자열이 올바른 괄호 문자열인지 Stack으로 검사
 * isValid 메서드를 통해 stack이 비어있으면 올바른 괄호 문자열
 *  -> answer++
 *
 */

import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;

        for(int i = 0; i < s.length(); i++){
            String subS = s.substring(i) + s.substring(0, i);
            if(isValid(subS)){
                answer++;
            }

        }
        return answer;
    }

    private boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;

                char top = stack.pop();
                if (!isMatching(top, c)) return false;
            }
        }

        return stack.isEmpty();
    }

    private boolean isMatching(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }
}
