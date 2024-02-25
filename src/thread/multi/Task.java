package thread.multi;

//작업 내용을 가지고 있는 클래스(객체)
//다른 곳에서 필요하다면 따로 클래스를 만들어서 사용하는 것이 좋음.
public class Task implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
}
