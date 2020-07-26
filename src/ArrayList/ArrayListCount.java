package ArrayList;

import java.util.ArrayList;

public class ArrayListCount {


    public String blogDb(ArrayList<String[]> r, String id) {

String name = "";

        for (int i = 0; i <r.size() ; i++) {
            if(r.get(i)[0].equals(id)){
       name+=(r.get(i)[1]+"\n"+r.get(i)[2]);
            }

        }


return name;
    }


    public static void main(String[] args) {
        ArrayListCount m = new ArrayListCount();
        ArrayList<String[]> arr1 = new ArrayList<String[]>();
        arr1.add(new String[]{"1", "title 1", "content"});
        arr1.add(new String[]{"2", "title 2", "content"});
        arr1.add(new String[]{"3", "title 3", "content3"});

        String post = m.blogDb(arr1, "3");
        System.out.print(post);
        //should output:
        //title 3
        //content3


    }
}
