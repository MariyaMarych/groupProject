package Methods;

public class ReturnTasks {
    public static void main(String[] args) {

        System.out.println(checkIf("mmm","95995"));
        System.out.println(checkIf("james", "password"));

        if (checkIf("james","password")){
            System.out.println("login in");
        }else {
            System.out.println("invalid credetials");
        }

    }
    public static boolean checkIf (String username, String password){
        String username1 = "james";
        String password1 = "password";
        if (username.equals(username1)&& password.equals(password1)){
            return true;///if it never was true then you can set return to false bu default
        }else{////if you didn't meet the right critiria then you have to return false
            return false;
        }


    }





}
