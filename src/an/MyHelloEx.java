package an;

import java.lang.reflect.Method;

public class MyHelloEx {
    public static void main(String[] args) {
        MyHello myHello = new MyHello();
//        myHello.hello();
        try {
            Method method = myHello.getClass().getDeclaredMethod("hello");      //메서드에 대한 정보
            if (method.isAnnotationPresent(Count100.class)) {
                for (int i = 0; i < 100; i++) {
                    myHello.hello();
                }
            } else {
                myHello.hello();
            }
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
