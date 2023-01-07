package level0;

public class 제곱수판별하기 {
    public static void main(String[] args) {
        int n = 144;
        int answer = 0;

        for(int i=1; i<n; i++){
            if (i*i == n){
                answer = 1;
                break;
            }else{
                answer = 2;
            }
        }
        System.out.println(answer);
    }
}
