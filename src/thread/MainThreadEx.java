package thread;

public class MainThreadEx {
    public static void main(String[] args) {
        System.out.println("시작");

        // 현재 작업중인 쓰레드
        Thread currThread = Thread.currentThread();
//        currThread = null;        Exception in thread "main"
        System.out.println(currThread.getName());

        System.out.println("종료");
    }
}
