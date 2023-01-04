package level0;

public class 분수의덧셈 {
    public static void main(String[] args) {

        // denum = 분자, num = 분모

        int denum1 = 1;
        int num1 = 2; // 1/2

        int denum2 = 3;
        int num2 = 4; // 3/4

        int denominator; // 분자
        int numerator; // 분모

        denominator = denum1*num2 + num1*denum2;
        numerator = num1*num2;

        int min = Math.min(denominator,numerator);
        int max = 1;
        for(int i=1; i<=min; i++){
            if(denominator%i==0 && numerator%i==0){
                max= i;
            }
        }
        denominator /= max;
        numerator /= max;

        System.out.println(denominator + " / " + numerator);

    }
}
