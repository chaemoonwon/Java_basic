package static1;

public class DataCounterMain2 {
    public static void main(String[] args) {

        Counter counter = new Counter();
        // counter 객체가 공유됨.
        Data2 data1 = new Data2("A", counter);
        System.out.println("A count = " + counter.count);

        Data2 data2 = new Data2("A", counter);
        System.out.println("A count = " + counter.count);

        Data2 data3 = new Data2("A", counter);
        System.out.println("A count = " + counter.count);
    }
}
