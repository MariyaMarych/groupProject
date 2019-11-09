package Methods;

public class ReturnTypeMethods {
    public static void main(String[] args) {

        int b = getThree()+7;//we got number 3 from our method and add 3
        System.out.println(b);
        String date = getDate("11/03/2019").replace("/","");//we declared and then called the method witch had value
        System.out.println(date);//once we store it we can declare it

        System.out.println("negative number "+ checkNumber(-5));
        System.out.println("negative number "+ checkNumber(5));

        String word = "word";
        System.out.println(word.length());
        System.out.println(stringLength("word"));

    }

    public static int getThree (){
        return 3;
    }

    public static String getDate(String date){//if we add parameters (String date)we get the parameters in main method, we add them ourselves in ""!!

        return date.replace("/","");

    }

    public  static  int checkNumber (int num){
        if (num < 0){
            return 0;
        }else {
            return num;
        }


    }

public static  int stringLength (String str){
        int count =0;
        for (int i = 0; i < str.length(); i ++){
            count++;
        }

        return count;
}










}
