package Exception;

public class B extends A{
    @Override
    void m() throws InterruptedException { //it can go higher ierarhy you can go below

        //it can be itself or more restrictive.
        super.m();
    }

    @Override
    void method2() throws C {

       // super.method2();

    }
}
