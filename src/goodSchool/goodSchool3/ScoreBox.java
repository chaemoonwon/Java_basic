package goodSchool.goodSchool3;

import java.util.ArrayList;
import java.util.List;

public class ScoreBox<T> {

    List<T> scores = new ArrayList();

    public void add(T score) {
        scores.add(score);
    }

}
