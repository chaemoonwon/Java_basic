package construct;

public class MemberInit {
    //속성
    String name;
    int age;
    int grade;



    //this를 사용하는 이유
    //멤버 변수보다 매개변수가 코드 블럭의 더 안쪽에 있기 때문에 매개변수가 우선순위를 가진다
    //매개변수의 이름과 멤버 변수의 이름이 같을 때 구분해주기 위해서 사용
    //이름이 중복되는 경우에만 사용
    void InitMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

}
