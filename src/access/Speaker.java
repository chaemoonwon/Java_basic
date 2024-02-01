package access;

public class Speaker {
    //접근 제어자를 사용하는 이유
    //어떠한 요구 사항이 있을 때 그 요구사항에 맞춰 설계를 했음에도 불구하고,
    //추후 새로운 변경 사항이 생격서 기존의 코드를 통해 수정을 할 경우 접근 제어자를 통해서 제한을 두지 않을 경우
    //오류 사항이 생길 수 있음.

    //접근 제어자의 핵심은 속성과 기능을 외부로부터 숨기는 것이다.

    //private 접근 제어자는 모든 외부 호출을 막는다.
    //private 이 붙은 경우 해당 클래스 내부에서만 호출할 수 있다.
    private int volume;

    Speaker(int value) {
        this.volume = value;
    }


    // 음량을 증가할 수 없도록 기능을 만듬
    void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량 입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("volumeDown 호출");
    }

    void showVolume() {
        System.out.println("현재 음량: "+ volume);
    }


}
