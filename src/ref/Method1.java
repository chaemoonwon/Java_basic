package ref;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        initStudent(student1,"학생1",15,90);

        Student student2 = new Student();
        initStudent(student2,"학생2",16,80);

        printStudent(student1);
        printStudent(student2);
    }

    // 전달한 학생 객체의 필드의 값을 설정 = > 참조값을 넘겨서 매개변수에 전달받은 값을 해당 객체의 필드의 값에 대입.
    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    // 전달한 학생 객체의 필드의 값을 읽어서 출력
    static void printStudent(Student student) {
        System.out.println("이름: " +student.name + " 나이: " + student.age + " 성적: " +student.grade);
    }
}
