package construct;

public class MemberConstruct {

    String name;
    int age;
    int grade;

    //생성자 추가
    public MemberConstruct(String name, int age) {
        //this() 를 사용하면 생성자 내부에서 다른 생성자를 호출할 수 있다
        this(name, age, 50);
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
    }

    public MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name: " + name +", age: " + age + ", grade: " +grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
