package goodSchool0;

public class StudentMain0 {
    public static void main(String[] args) {
        Student[] students = new Student[]
                {
                        new Student("강감찬", "211213", Major.KOREAN, "국어", 95, 56),
                        new Student("김유신", "212330", Major.COMPUTER, "수학", 95, 98),
                        new Student("신사임당", "201518", Major.KOREAN, "국어", 100, 88),
                        new Student("이순신", "202360", Major.KOREAN, "국어", 89, 95),
                        new Student("홍길동", "201290", Major.COMPUTER, "수학", 83, 56)
                };

        Kor kor = new Kor();
        Math math = new Math();

        //국어 수강생 학점 출력
        System.out.println(kor.KOR + " 수강생 학점");
        System.out.println("이름  |   학번  |중점과목|  점수");
        for (Student student : students) {
            if (student.sub.equals("국어")) {
                System.out.println(student.stName + " | " + student.stNum + " | " + kor.KOR + " | " + student.kor + " | " + kor.require(student.kor));
            } else if (student.sub.equals("수학")) {
                System.out.println(student.stName + " | " + student.stNum + " | " + math.MATH + " | " + student.kor + " | " + kor.generate(student.kor));
            }
        }

        //수학 수강생 학점 출력
        System.out.println(math.MATH + " 수강생 학점");
        System.out.println("이름  |   학번  |중점과목|  점수");
        for (Student student : students) {
            if (student.sub.equals("수학")) {
                System.out.println(student.stName + " | " + student.stNum + " | " + math.MATH + " | " + student.math + " | " + math.require(student.math));
            } else if (student.sub.equals("국어")) {
                System.out.println(student.stName + " | " + student.stNum + " | " + kor.KOR + " | " + student.math + " | " + math.generate(student.math));
            }
        }

    }
}