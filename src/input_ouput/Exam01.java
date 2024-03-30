package input_ouput;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exam01 {
    public static void main(String[] args) {
        File file = new File("data");   //파일을 객체로 생성, 경로를 가지고 있는 객체
        FileOutputStream fos = null;    //파일을 출력하는 흐름

        try {
            fos = new FileOutputStream(file, true);
            fos.write(100);
            fos.write(100);
            fos.write(100);
            fos.write(100);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();        //프로그램이 실행 할때 사용중이므로, 닫아주어야 다른 작업을 할 수 있음.
                } catch (IOException e) {
                }
            }
        }
    }
}
