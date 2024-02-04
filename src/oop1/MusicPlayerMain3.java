package oop1;
/*
* 음악플레이어 각각의 기능을 메서드로 만들어서 추출
* */
public class MusicPlayerMain3 {

    public static void main(String[] args) {

        //음악 플레이어와 관련되 데이터
        MusicPlayerData data = new MusicPlayerData();

        //음악 플레이어 켜기
        on(data);
        //볼륨 증가
        volumeUp(data);
        //볼륨 증가
        volumeUp(data);
        //볼륨 감소
        volumeDown(data);
        //음악 플레이어 상태
        showStatus(data);
        //음악 플레이어 끄기
        off(data);


        //절차 지향 프로그래밍의 한계
        //데이터와 기능이 서로 분리되어 있음

        //데이터와 기능을 하나로 묶어서 사용할 수 있게 해주는 객체 지향 프로그래밍이 등장
    }

    //기능
    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨 = " + data.volume);
    }

    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨 = " + data.volume);
    }

    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어의 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " +data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }

}
