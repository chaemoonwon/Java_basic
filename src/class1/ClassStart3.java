package class1;

public class ClassStart3 {

    public static void main(String[] args) {

        //실제 설계도에 만들어진 실체를 객체 또는 인스턴스라고 함.
        Student student1;   //변수를 선언
        student1 = new Student();   //Student클래스를 기반으로 새로운 객체를 생성
        //Student클래스는 name, age, grade라는 멤버변수를 가지고 있음. => 메모리 공간도 함께 확보가 됨.
        //객체를 생성하면 메모리에 접근할 수 있는 참조값을 반환
        //반환한 참조값을 어딘가에 저장해야함 => student1 변수에 저장
        student1.name = "학생1";  //객체에 접근하기위해 .(dot)를 사용함
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        //참조값 확인
//        System.out.println(student1);
//        System.out.println(student2);

        System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적: " +student1.grade);
        System.out.println("이름: " + student2.name + " 나이: " + student2.age + " 성적: " +student2.grade);


    }
}
