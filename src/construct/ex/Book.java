package construct.ex;

public class Book {
    String title;   //제목
    String author;  //저자
    int page;       //페이지 수

    // 기본 생성자
    public Book() {
        //this()는 중복을 제거할때 사용해 줌
        //생성자 첫 줄에만 작성 가능함.
        this("", "", 0);
    }

    // title과 author만을 매개변수로 받는 생성자
    public Book(String title, String author) {
        this(title, author, 0);
    }

    // 모든 필드를 매개변수로 받는 생성자
    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    //속성
    public void displayInfo() {
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + page);
    }
}
