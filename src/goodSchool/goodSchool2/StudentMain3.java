package goodSchool.goodSchool2;

public class StudentMain3 {
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
//        RequireScore requireScore = new RequireScore();
//        GenerateScore generateScore = new GenerateScore();

        // 다형성 이용
        ScorePolicy[] scorePolicy =
                {
                        new RequireScore(),
                        new GenerateScore()
                };


        //국어 수강생 학점 출력
        KorStudentScore(students, subject, scorePolicy[0], scorePolicy[1]);

        //수학 수강생 학점 출력
        MathStudentScore(students, subject, scorePolicy[0], scorePolicy[1]);
    }

    private static void MathStudentScore(Student[] students, Subject subject, ScorePolicy requireScore, ScorePolicy generateScore) {
        System.out.println("수학 수강생 학점");
        System.out.println("이름  |   학번  |중점과목|  점수");
        for (Student student : students) {
            if (student.major.equals(Major.COMPUTER)) {
                System.out.println(student.stName + " | " + student.stNum + " | " + subject.getSubject(Major.COMPUTER) + " | " + student.math + " | " + requireScore.getGrade(student.math));
            } else if (student.major.equals(Major.KOREAN)) {
                System.out.println(student.stName + " | " + student.stNum + " | " + subject.getSubject(Major.KOREAN) + " | " + student.math + " | " + generateScore.getGrade(student.math));
            }
        }
    }

    private static void KorStudentScore(Student[] students, Subject subject, ScorePolicy requireScore, ScorePolicy generateScore) {
        System.out.println("국어 수강생 학점");
        System.out.println("이름  |   학번  |중점과목|  점수");
        for (Student student : students) {
            if (student.major.equals(Major.KOREAN)) {
                System.out.println(student.stName + " | " + student.stNum + " | " + subject.getSubject(Major.KOREAN) + " | " + student.kor + " | " + requireScore.getGrade(student.kor));
            } else if (student.major.equals(Major.COMPUTER)) {
                System.out.println(student.stName + " | " + student.stNum + " | " + subject.getSubject(Major.COMPUTER) + " | " + student.kor + " | " + generateScore.getGrade(student.kor));
            }
        }
    }
}