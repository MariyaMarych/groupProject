package D2Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Bobby {
    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));
        System.out.print("please enter how many group : ");
        int a = scan.nextInt();
        System.out.print("please enter how many student each group : ");
        int b = scan.nextInt();
//        scan.nextLine();
        String [][] class1 = new String[a][b];
        for(int i = 0 ; i<a ;i++ ){
            System.out.println("for group " + (i+1) );
            for(int j=0;j<b;j++){
                System.out.print("enter student : ");
                class1[i][j] = scan.nextLine();
            }
        }
        System.out.println(Arrays.deepToString(class1));
    }
}
