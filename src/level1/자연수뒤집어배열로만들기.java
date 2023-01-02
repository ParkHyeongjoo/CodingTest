package level1;

import java.util.ArrayList;

public class 자연수뒤집어배열로만들기 {
    public static void main(String[] args) {
        //자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

        long n = 12345;
        int length = (int)(Math.log10(n)+1);
        int[] answer = new int[length];
        int i = 0;

        while(n>0){
            answer[i] = (int)(n%10);
            n /= 10;
            i++;
        }
        System.out.println(answer[0]);
    }
}
