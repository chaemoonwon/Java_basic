package construct;

public class MemberDefault {
    String name;

    //매개변수가 없는 생성자를 기본 생성자라 함
    //생성자가 없는 경우 기본 생성자를 자동으로 만들어주기 때문에 생략가능하다.
    //생성자가 하나라도 있으면 자바는 기본 생성자를 만들지 않는다.
    public MemberDefault() {
        System.out.println("생성자 호출");
    }
}
