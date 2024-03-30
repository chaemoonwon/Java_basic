package goodSchool.goodSchool1;

public class StudentMain1 {
    public static void main(String[] args) {
        Student[] students = new Student[]
                {
                        new Student("강감찬", "211213", Major.KOREAN, "국어", 95, 56),
                        new Student("김유신", "212330", Major.COMPUTER, "수학", 95, 98),
                        new Student("신사임당", "201518", Major.KOREAN, "국어", 100, 88),
                        new Student("이순신", "202360", Major.KOREAN, "국어", 89, 95),
                        new Student("홍길동", "201290", Major.COMPUTER, "수학", 83, 56)
                };

        Subject subject = new Subject();
        ScorePolicy scorePolicy = new ScorePolicy();

        //국어 수강생 학점 출력
        System.out.println("국어 수강생 학점");
        System.out.println("이름  |   학번  |중점과목|  점수");
        for (Student student : students) {
            if (student.major.equals(Major.KOREAN)) {
                System.out.println(student.stName + " | " + student.stNum + " | " +subject.getSubject(Major.KOREAN) + " | " + student.kor + " | " + scorePolicy.require(student.kor));
            } else if (student.major.equals(Major.COMPUTER)) {
                System.out.println(student.stName + " | " + student.stNum + " | " +subject.getSubject(Major.COMPUTER) + " | " + student.kor + " | " + scorePolicy.generate(student.kor));
            }
        }

        //수학 수강생 학점 출력
        System.out.println("수학 수강생 학점");
        System.out.println("이름  |   학번  |중점과목|  점수");
        for (Student student : students) {
            if (student.major.equals(Major.COMPUTER)) {
                System.out.println(student.stName + " | " + student.stNum + " | " + subject.getSubject(Major.COMPUTER) + " | " + student.math + " | " + scorePolicy.require(student.math));
            } else if (student.major.equals(Major.KOREAN)) {
                System.out.println(student.stName + " | " + student.stNum + " | " + subject.getSubject(Major.KOREAN) + " | " + student.math + " | " + scorePolicy.generate(student.math));
            }
        }
    }
}