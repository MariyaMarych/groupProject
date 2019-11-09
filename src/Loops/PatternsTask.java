package Loops;

public class PatternsTask {
    public static void main(String[] args) {

                int i, j, k, l, stars, space, starsNew, c;
                stars = 6;
                starsNew = 1;

                for (i = 1; i <= 2; i++) {  // rows

                    for (j = 1; j <= stars; j++) { // 6 stars row
                        System.out.print("*");
                    }
                    if (i == 2) {
                        break;
                    }
                    System.out.println();
                    for (c = 1; c <= 2; c++) { //print 2 times
                        for (k = 1; k <= 2; k++) { // 2 star row

                            System.out.print("*");
                            if (k == 2) {
                                break;
                            }

                            for (l = 1; l <= 4; l++) {

                                System.out.print(" ");
                            }

                        }
                        System.out.println();

                    }

                }


            }
        }

