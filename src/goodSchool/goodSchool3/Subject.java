package goodSchool.goodSchool3;

public class Subject implements Major {

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
