package thread.multi;

import java.awt.*;

public class BeepPrintExV2 {
    public static void main(String[] args) {
        //소리 음과 출력을 동시에 작업하기 위해서는 쓰레드를 만들어주어야 함.
        //작업 1
        // 익명 자식 객체이 Thread를 이용해서 재정의 해줌
        Thread thread = new Thread() {
            @Override
            public void run() {
                //작업 1 : 소리
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++) {
                    toolkit.beep(); //'띵'소리
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                    }
                }
            }
        };

        thread.start();

        //작업 2 :출력
        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
        
    }
}
