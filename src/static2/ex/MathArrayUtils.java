package static2.ex;

import java.util.Arrays;

public class MathArrayUtils {

    //인스턴스를 생성하지 않고 사용하는 제약 조건
    private MathArrayUtils() {
        //private으로 인스턴스 생성을 막는다.
    }

    public static int sum(int[] values) {
        int totalPrice = 0;
        for (int value : values) {
            totalPrice += value;
        }
        return totalPrice;
    }

    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        int min = values[0];
        for (int value : values) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static int max(int[] values) {
        int max = values[0];
        for (int value : values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}
