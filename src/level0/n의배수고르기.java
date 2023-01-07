package level0;

import java.util.ArrayList;

public class n의배수고르기 {
    public static void main(String[] args) {
        int n = 3;
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                arrayList.add(numlist[i]);
            }
        }
        int[] answer = arrayList.stream().mapToInt(Integer::intValue).toArray(); // 뭔지 모르겠다!!
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}
