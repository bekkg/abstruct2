public class Cat extends  Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void metcat() {
        System.out.println("it is a cat class. ");
    }
}
