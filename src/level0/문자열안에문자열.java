package level0;

public class 문자열안에문자열 {
    public static void main(String[] args) {
        System.out.println(solution("1253bv12lk5uvxfsd", "1vi7f4"));
    }

    public static int solution(String str1, String str2) {
        int answer = 0;
        if(str1.contains(str2)){
            answer = 1;
        }else{
            answer = 2;
        }
        return answer;
    }

}
