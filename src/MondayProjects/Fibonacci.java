package MondayProjects;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            int x = input.nextInt();
            int t1 = 0, t2 = 1;
            for (int i =0; i< x;i++){
                System.out.print(t1 + " ");
                int sum = t1 + t2;
                t1 = t2;
                t2 = sum;
            }
        }
    }
