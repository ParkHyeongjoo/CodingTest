package level0;

public class 문자반복출력하기 {
    public static void main(String[] args) {
        String my_string = "hello";
        int n = 3;
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            Character ch = my_string.charAt(i);
            for (int j = 0; j < n; j++) {
                answer += ch;
            }
        }
        System.out.println(answer);
    }
}
