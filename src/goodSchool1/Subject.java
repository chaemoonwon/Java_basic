package goodSchool1;

public class Subject implements Major {

//    String KOR = "국어";
//    String MATH = "수학";

    public String getSubject(String subject) {

        switch (subject) {
            case KOREAN ->
                subject = "국어";

            case COMPUTER ->
                subject = "수학";

        }
        return subject;
    }
}
