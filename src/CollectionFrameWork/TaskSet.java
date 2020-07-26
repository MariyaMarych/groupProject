package CollectionFrameWork;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TaskSet {
//    Create a java.util.Set of numbers and ask the user to enter to enter 5 numbers.
//    - Go through each number and remove any numbers that are odd
//    - Print your Changed Set
//    Collapse
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Set<Integer> numbers = new HashSet<>();

    System.out.println("Enter number one");
    numbers.add(input.nextInt());
    System.out.println("Enter number two");
    numbers.add(input.nextInt());
    System.out.println("Enter number three");
    numbers.add(input.nextInt());
    System.out.println("Enter number four");
    numbers.add(input.nextInt());
    System.out.println("Enter number five");
    numbers.add(input.nextInt());

    Iterator<Integer> it = numbers.iterator(); // to

while (it.hasNext()){
    int i = it.next();
    if(i%2!=0){
        it.remove();
    }


}

    System.out.println(numbers);

}

}
