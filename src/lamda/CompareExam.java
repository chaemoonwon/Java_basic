package lamda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class CompareExam {

    //람다식
    //매개변수 값을 함수로써 전달할 수 있게 되었음.
    public static void exec(Compare compare) {
        int k = 10;
        int j = 5;
        int value = compare.compareTo(k, j);
        System.out.println("value = " + value);
    }


    public static void main(String[] args) {
        exec((i, j) -> i - j);

        //Function
        //타입 변환
        Function<Integer, Double> function = i -> Double.valueOf(i);
        Double apply = function.apply(50);
        System.out.println("apply = " + apply);

        //Predicate
        //참, 거짓 판단
        Predicate<Integer> predicate = integer -> integer < 10;
        boolean test = predicate.test(11);
        System.out.println("test = " + test);

        //Supplier
        //매개변수 없음
        Supplier<String> supplier = () -> "안녕하세요";
        String s = supplier.get();
        System.out.println("s = " + s);

        //Consumer
        //void 형태 => 리턴 값 없음
        Consumer<String> consumer = s1 -> {
            System.out.println(s1);
        };
        consumer.accept("hello");
    }

}
