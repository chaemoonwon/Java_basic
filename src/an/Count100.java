package an;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//커스텀 어노테이션 만들기
@Retention(RetentionPolicy.RUNTIME) //JVM이 실행시에 감지할 수 있는 어노테이션
public @interface Count100 {

}
