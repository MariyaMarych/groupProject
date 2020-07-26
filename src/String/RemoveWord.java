package String;

public class RemoveWord {
    public static void main(String[] args) {

        String name = "Ilove love going to the picnic with my family";
        name = name.replaceAll("picnic","");
        System.out.println(name);



String  reverse= "";
        String [] arr = name.split(" ");
        for (int i = 0; i <arr.length ; i++) {
            for ( int j =arr[i].length()-1;j>=0; j--) {
                reverse +=arr[i].charAt(j);
            }
            reverse+= " ";
        }

        System.out.println(reverse);


    }
}
