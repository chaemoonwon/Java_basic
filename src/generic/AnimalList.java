package generic;

public class AnimalList {

    private Object[] animal;

    public AnimalList(Object[] animal) {
        this.animal = animal;
    }

    public Object getAnimal(int index) {
        return animal[index];
    }
}
