package String;

public class HappyG {

    public static void main(String[] args) {

        String str = "gg";
        int indexOfG = str.indexOf("g");

        int lastG = str.lastIndexOf("g");
        char g = 'g';
        int count = 0;

        if(lastG==1 && indexOfG ==0){
            System.out.println("cool");
        }


        if(indexOfG==0){
            System.out.println("okkkk");
        }


if(lastG==0){
    System.out.println("ok");
}
        System.out.println(lastG);
        System.out.println(str.substring(lastG-1,lastG+1));
        System.out.println(lastG);
        System.out.println(str.indexOf('g'));
        System.out.println(indexOfG);
        System.out.println(str.substring(indexOfG, indexOfG + 3));
        System.out.println(str.substring(indexOfG, indexOfG + 2));
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == g) {
                count++;

            }
            if(str.substring(lastG-1,lastG+1).equals(g)){
                System.out.println();
            }

        }

//        if (count == 3 && str.substring(indexOfG, indexOfG + 3).equals("ggg")) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
//        if (count == 2 && str.substring(indexOfG, indexOfG + 2).equals("gg")) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }


    }

}
