package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] stdName = {"학생1", "학생2", "학생3", "학생4"};
        int[] stdAge = {15, 16, 17, 18};
        int[] stdGrade = {80, 90, 70, 60};

        for (int i = 0; i < stdName.length; i++) {
            System.out.println("이름: " + stdName[i] + ", 나이: " + stdAge[i] + ", 성적: " + stdGrade[i]);
        }
    }
}
