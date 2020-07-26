package String;

public class XYZabc {




    public boolean xyzThere(String str) {
        if(str.equals("xyz")) return true;
        boolean check = false;
        for(int i = 0; i < str.length() - 2; i++) {
            if(str.startsWith("xyz")) check = true;
            else if(i != 0 && str.substring(0 + i, 3 + i).equals("xyz") && str.charAt(i-1) != '.') check = true;
        }
        return check;
    }

}
