package variablesBatch14;

public class Increment {
    public static void main(String[] args) {

        int age = 5;

        System.out.println(age);
        System.out.println(++age);//6
        System.out.println(age++);//6 goes up in next line
        System.out.println(age); //7

        int x = 11;
        int y = x++; // int y =11

        System.out.println("x=" + x);
        System.out.println("y="+ y);
        System.out.println(y);

        int book = 10;

        System.out.println(book++);//10 is printed then it increment==>11
        System.out.println(++book);//11 incrts-->12then it prints
        System.out.println(book--);//still 12;next line wiil 11
        System.out.println(--book);// 11 becomes -->10

        System.out.println(5>4 && 6>4 && true);//and statements needs to be true
        System.out.println(4<3|| true);//one of them needs to be true

        boolean b = 5>1;
        boolean d = false;
        boolean check = d || b;
        boolean check1 = d && b;

        int rate =5;
        int rate2 = 6;
        boolean rateB = rate == rate2;
        boolean rateBB = rate !=rate2;

        System.out.println(rateB);
        System.out.println(rateBB);

        System.out.println();






    }

}
