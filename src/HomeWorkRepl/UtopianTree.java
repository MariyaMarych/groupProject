package HomeWorkRepl;

public class UtopianTree {
    public static void main(String[] args) {
        int growthNum = 0;
        for (int years = 1, treeSize = 0, lengthTree = 1; years <= 10; years++) {
            if (years >= 4) {
                treeSize = treeSize + 2;
                lengthTree += 2;
            } else {
                treeSize = treeSize+1;
            }


            System.out.println("year " + years + "- growth " + lengthTree + "cm");
            System.out.println("tree size: " + treeSize + " cm");
        }
    }
}