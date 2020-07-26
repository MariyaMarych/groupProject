package Exception;

public class Dog {
    int age;


    void setAge(int age) throws DogInvalidAgeException{
        if (age < 0 || age > 30) {
            throw new DogInvalidAgeException();
        }
        this.age = age;
    }
    static void bark() throws Exception{
        System.out.println("Dog is barking");
        throw new RuntimeException();

    }

    }

