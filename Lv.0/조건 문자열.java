/**
 * 문제: 조건 문자열
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181934
 * 키워드: 조건문, equals(), 삼항 연산자
 */

class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        if(ineq.equals(">") && eq.equals("=")){
            return n >= m ? 1 : 0;
        }
        else if (ineq.equals("<") && eq.equals("=")){
            return n <= m ? 1 : 0;
        }
        else if (ineq.equals(">") && eq.equals("!")){
            return n > m ? 1 : 0;
        }
        else if (ineq.equals("<") && eq.equals("!")){
            return n < m ? 1 : 0;
        }
        return 0;
    }
}