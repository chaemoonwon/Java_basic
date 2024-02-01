package access;

public class SpeakerMain {
    public static void main(String[] args) {
        // 생성자를 통해 초기 음량 값을 지정
        Speaker speaker = new Speaker(90);
        speaker.volumeUp();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();



        //필드에 직접 접근
        System.out.println("volume 필드 직접 접근 수정");
//        speaker.volume = 200;     //private를 사용해서 필드에 직접 접근하는 것을 막음
        speaker.showVolume();
    }
}
