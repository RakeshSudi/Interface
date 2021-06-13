public class Car implements Vehicle, Animal {

    @Override
    public void start() {
        //Nothing
    }

    @Override
    public void run() {
        System.out.println("Car runs");
    }
}
