package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        //영화 리뷰 정보 선언
        MovieReview movieReview1 = new MovieReview();
        MovieReview movieReview2 = new MovieReview();


        //영화 리뷰 정보 출력
        movieReview1.title = "인셉션";
        movieReview1.review = "인생은 무한 루프";

        movieReview2.title = "어바웃 타임";
        movieReview2.review = "인생 시간 영화!";

        MovieReview[] movieReviews = new MovieReview[2];

        movieReviews[0] = movieReview1;
        movieReviews[1] = movieReview2;

        for (int i = 0; i < movieReviews.length; i++) {
            System.out.println("영화 제목: " + movieReviews[i].title + ", 리뷰: " + movieReviews[i].review);
        }
    }
}
