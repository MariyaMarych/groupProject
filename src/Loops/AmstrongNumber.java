package Loops;

public class AmstrongNumber {
    public static void main(String[] args) {
        int hundred = 0;
        int tens =0;
        int ones =0;

        for (int i = 1; i < 500; i++) {
            hundred = i/100;// so we get first number-->3
            tens = i -100/10;// so we get 343-100/10 = 43/10->4;
            ones = i - ((hundred*100)-(tens*10));
           if ((hundred*hundred*hundred)+(tens*tens*tens)+(ones*ones*ones)==i){


                System.out.println((hundred*hundred*hundred)+(tens*tens*tens)+(ones*ones*ones));

            }

        }



    }
}
