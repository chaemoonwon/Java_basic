package construct;

public class MemberThis {
    String nameField;

    //멤버변수의 이름과 매개변수의 이름이 다른 경우
    void initMember(String nameParameter) {
        this.nameField = nameParameter; //this 생략 가능
    }
}
