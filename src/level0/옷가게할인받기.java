package level0;

public class 옷가게할인받기 {
    public static void main(String[] args) {
        int price = 185300;

        double answer = 0;

        if (price >= 500000) {
            answer = price * 0.8;
        } else if (price >= 300000) {
            answer = price * 0.9;
        } else if (price >= 100000) {
            answer = price * 0.95;
        } else {
            answer = price;
        }

        System.out.println((int) answer);
    }
}
