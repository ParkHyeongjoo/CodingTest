package level0;

public class 대문자와소문자 {
    public static void main(String[] args) {
        System.out.println(solution("cccCCC"));
    }

    public static String solution(String my_string) {
        String answer = "";
        char[] charArray = my_string.toCharArray();

        for(int i=0; i<charArray.length; i++){
            if(!Character.isUpperCase( charArray[i] )){ // 소문자면
                answer += Character.toUpperCase(charArray[i]);
            }else{ // 대문자면
                answer += Character.toLowerCase(charArray[i]);
            }
        }
        return answer;
    }
}
