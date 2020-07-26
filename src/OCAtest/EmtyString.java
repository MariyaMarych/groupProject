package OCAtest;

public class EmtyString {
    private char var;

    public static void main(String[] args) {

// false /false
        double num = 3.3333335;
        System.out.println(Math.floor(num));


        String s = " ";
        s.trim();
        System.out.println(s.equals("") + " " + s.isEmpty());

        //2/
        StringBuilder sb = new StringBuilder();
        sb.insert(0, "Mama");
        sb.delete(0, sb.length());// deletes the whole sb
        System.out.println(sb);
//3
        char var1 = 'K';
        char var2 = var1;
        var2 = 'e';// ONCE YOU REASSIGN PRIMITIVE , EACH TIME THEY HAVE NEW VALUE;


        EmtyString obj1 = new EmtyString();
        EmtyString obj2 = obj1; //they now look  in the same direction FOREVER, if you reassign they both change
// Once you reassign Object to each other  => they both point in one direction, no matter how many time you reassign!
        obj1.var = 'i';
        obj2.var = 'm';


        System.out.println(var1 + " " + var2);
/// k  e --> once you reassign primitive it goes back to new value

        System.out.println(obj1.var + " " + obj2.var);
// m  m they both equal to m

        String str1 = "java";
        String[] str2 = {"j", "a", "v", "a"};
        String str3 = "";
        for (String element : str2) {
            str3 = str3 + element;
        }
        boolean m = (str1 == str3); //!!! ==!! compare reference address not strings themselvs;
        boolean k = (str1.equals(str3));
        System.out.println(str3);
        System.out.println(str1);
        System.out.println(m + " " + k);

        StringBuilder sb2 = new StringBuilder(5);
        String sb1 = "";
        System.out.println();

        if (sb2.equals(sb1)) {
            System.out.println(" match1");
        } else if (sb2.toString().equals(sb1.toString())) {
            System.out.println("match2");
        } else {
            System.out.println(" no match");
        }

        // #5

        System.out.println("Result a " + 0 + 2);
        System.out.println("Result b " + (2 + 3));


        for (int i = 0; i < 3; i++) {
            for (int j = 3; j >= 0; j--) {
                if (i == j)
                    continue;

                System.out.print(i + "" + j + "\n");

            }
        }

        String name = "Mariya Marych";

        String reversed = new StringBuilder(name).reverse().toString();
        System.out.println(reversed);

        char[] name1 = {'m', 'o', 'p', 'y'};
        for (int i = name1.length - 1; i >= 0; i--) {

            System.out.println(name1[i]);


        }

        System.out.println(getPrime(8));


    }

        public static boolean getPrime(int n) {


            for (int i = 2; i <n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
return true;

        }
    }

