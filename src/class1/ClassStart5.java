package class1;

public class ClassStart5 {

    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        //Student를 보관할 수 있다
        Student[] students = new Student[]{student1, student2};    //배열 생성과 선언
        //참조값이 없는 상태이기 때문에 null값으로 초기화 됨.

//        for (int i = 0; i < students.length; i++) {
//            System.out.println("이름: " + students[i].name + " 나이: " + students[i].age + " 성적: " + students[i].grade);
//        }
//
//        for (int i = 0; i < students.length; i++) {
//            Student s = students[i];
//            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
//        }

        for (Student s : students) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }

    }
}
