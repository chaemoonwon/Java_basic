package input_ouput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exam02 {
    public static void main(String[] args) {
        File file = new File("data");   //파일을 객체로 생성, 경로를 가지고 있는 객체
        FileInputStream fis = null;    //파일을 출력하는 흐름

        System.out.println(file.length());      //데이터의 크기를 알 수 있음
        System.out.println(file.canRead());
        System.out.println(file.canExecute());
        System.out.println(file.getAbsolutePath());

        try {
            fis = new FileInputStream(file);
                    int data = 0;      //1 Byte를 읽어드림
                    while ((data = fis.read()) != -1) { //-1 //EOF
                        System.out.print((char)data);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (fis != null) {
                        try {
                            fis.close();        //프로그램이 실행 할때 사용중이므로, 닫아주어야 다른 작업을 할 수 있음.
                } catch (IOException e) {
                }
            }
        }
    }
}
