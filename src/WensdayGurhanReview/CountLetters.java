package WensdayGurhanReview;

public class CountLetters {
    public static void main(String[] args) {

        System.out.println(countLetters("aaaabbyydddaaabb"));
    }

    public static String countLetters(String word) {

//        String checked = "";
//        int count = 0;
//        String name = "";
//        for (int i = 0; i < word.length(); i++) {
//            count = 0;
//            for (int j = 0; j < word.length(); j++) {
//                if (word.charAt(i) == word.charAt(j)) {
//                    count++;
//                }
//            }
//                    if (!checked.contains(word.charAt(i) + "")) {
//                        checked += word.charAt(i);
//                        name += word.charAt(i)+ " " + count + ", ";
//                    }
//                }
//        return name;

        String unique = "";
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            if(!unique.contains(word.charAt(i)+"")){
                for(int j = 0; j < word.length(); j++){
                    if(word.charAt(i)==word.charAt(j)){
                        count++;
                    }

                }
                unique+=word.charAt(i); // TO STORE IN UNIQUE TO KNOW IF WE ALREADY INCLUDED
                result+= word.charAt(i)+" "+count+", "; // TO PRINT UNIQUE AND COUNT
            }

        }
        return result.substring(0,result.length()-2);// TO GET RID OF COMA -->SUBSTRING--> FROM 0 TO THE LAST CHAR

            }



    }
