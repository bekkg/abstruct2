public class Dog extends  Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void metdog() {
        System.out.println("it is a dog class. ");
    }
}
