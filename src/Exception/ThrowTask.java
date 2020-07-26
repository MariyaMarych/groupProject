package Exception;

import java.io.IOException;

public class ThrowTask {
    public static void main(String[] args) throws  InterruptedException, IOException {

        //   Dog.bark(); //--> checked Exception 1. handle it2. ignore it

        // Thread.sleep(1000);
        Dog dog = new Dog();

        try {
            dog.setAge(1);
        } catch (Exception e) {
            e.printStackTrace();

        }
        //System.out.println(dog.age);

        Driver driver = new Driver();
        try {
            driver.setName("mama");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(driver.getName());
    }
}