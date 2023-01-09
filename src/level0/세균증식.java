package level0;

public class 세균증식 {
    public static void main(String[] args) {
        System.out.println(solution(2,10));
    }
    public static int solution(int n, int t) {
        double answer = 0;
        answer = n * Math.pow(2, t);
        return (int)answer;
    }
}
