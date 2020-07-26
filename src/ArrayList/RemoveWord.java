package ArrayList;

import java.util.ArrayList;

public class RemoveWord {
    public static void main(String[] args) {

        ArrayList<String> wordList = new ArrayList<String>();
        wordList.add("hi");
        wordList.add("hello");
        wordList.add("oalla");
        wordList.add("hi");
        wordList.add("ola");
        wordList.add("papa");
        wordList.add("hello");
        wordList.add("hi");
        System.out.println(wordList);
        //removeAll(wordList,"hi");
        removeEveryOther(wordList);

    }
    static void removeAll(ArrayList<String> wordList, String targetWord ){
ArrayList <String> sample =new ArrayList<>();
sample.add(targetWord);
wordList.removeAll(sample);

            System.out.println(wordList);
    }

    static void removeEveryOther(ArrayList<String> words){
        for (int i = 0; i <words.size() ; i+=1) {
            words.remove(i);


        }
        System.out.println(words);

    }


}







//#2 Create a method that:
//
//is called removeEveryOther
//returns nothing
//takes in a single parameter - an ArrayList of Strings called words
//
//This method should take the ArrayList parameter and modify it by removing every other element in the list, starting with removing the 0th element.
//
//For example, if the parameter is:
//("hi","yo","sup","yolo","boop")
//The modified ArrayList should be:
//("yo","yolo")
//