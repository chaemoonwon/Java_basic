package goodSchool0;

public class ScorePolicy {
    //필수 과목의 학점 기준
    public String require(int score) {
        if (score >= 95 && score <= 100) {
            return "S";
        } else if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    //일반 과목의 학점 기준
    public String generate(int score) {
        if (score >= 90 && score <= 100) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 55) {
            return "D";
        } else {
            return "F";
        }
    }
}
