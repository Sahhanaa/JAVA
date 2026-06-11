public class Main {

    public static void main(String[] args) {

        try {

            Car car = new Car();

            ReflectionInjector.inject(car);

            car.drive();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}