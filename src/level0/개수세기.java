package level0;

public class 개수세기 {
    public static void main(String[] args) {
        int[] array = {7, 77, 10};
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            String arrStr = Integer.toString(array[i]);
            for (int j = 0; j < arrStr.length(); j++) {
                if(arrStr.charAt(j) == '7'){
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
