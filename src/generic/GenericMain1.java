package generic;

public class GenericMain1 {


    public static void main(String[] args) {
        //기본 제네릭 사용
        Person<String> p1 = new Person<>();         //<생략 가능>
        Person<StringBuilder> p2 = new Person<>();


        //제네릭 사용 이유
        //문제
        //컴파일 시 오류 확인 불가, 런타임 할 때 오류 확인 가능
//        Dog[] arr ={
//                new Dog(),
//                new Dog()
//        };
//
//        AnimalList animalList = new AnimalList(arr);
//
//        Dog dog = (Dog) animalList.getAnimal(0);
//        Cat cat = (Cat) animalList.getAnimal(1);

        // 해결
        Dog[] arr ={
                new Dog(),
                new Dog()
        };

       AnimalListV1<Dog> animalListV1 = new AnimalListV1<>(arr);

        Dog dog = (Dog) animalListV1.getAnimal(0);
//        Cat cat = (Cat) animalListV1.getAnimal(1);        //컴파일 시 오류 확인 가능


        //강제 캐스팅을 없애줌
        Dog dogV1 = animalListV1.getAnimal(0);

    }
}
