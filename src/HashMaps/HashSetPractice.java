package HashMaps;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetPractice {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("John", "Sam", "John");

        Set<String> set = new HashSet<>(list);

        System.out.printf("Size of list is %s, size of set is %s. Is list unique: %s\n", list.size(), set.size(), list.size() == set.size());

        String s = String.format("This is the list size %s", list.size());//when you want to print out use the string format
        String b = String.format("%s\n%s\n%s", list.get(0), list.get(1), list.get(2));
        System.out.println(s);
        System.out.println(b);

        String message = String.format("Unique values test failed. Expected: %s, but was: %s", true, list.size() == set.size());
        System.out.println(message);
    }


}
