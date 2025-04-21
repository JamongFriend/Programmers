/**
 * 문제: 배열 만들기 4
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181918
 * 키워드: 반복문, 조건문, 배열 인덱스값++
 */

class Solution {
    public int[] solution(int[] arr) {
        int[] stk = new int[arr.length];
        int top = 0;

        int i = 0;
        while(i < arr.length){
            if(top == 0){
                stk[top++] = arr[i++];
            }
            else if(stk[top-1] < arr[i]){
                stk[top++] = arr[i++];
            }
            else{
                top--;
            }
        }

        int[] result = new int[top];
        for(int j=0; j<top; j++){
            result[j] = stk[j];
        }

        return result;
    }
}