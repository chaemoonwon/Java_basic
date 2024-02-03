package poly.ex6;

public class SoundFlyMain {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Dog dog = new Dog();
        Chicken chicken = new Chicken();

        soundAnimal(bird);
        soundAnimal(dog);
        soundAnimal(chicken);

        flyAnimal(bird);
        flyAnimal(chicken);

    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void flyAnimal(Fly fly) {
        System.out.println("새 움직임 테스트 시작");
        fly.fly();
        System.out.println("새 움직임 테스트 종료");
    }
}
