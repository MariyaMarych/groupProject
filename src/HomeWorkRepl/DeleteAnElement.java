package HomeWorkRepl;

//It removes element int from the array.
//
//example use (pseudo code):
//
//deleteR([1,2,3],2)
//returns [1,3]
//
//deleteR([19,99,9,9999],9)
//returns [19,99,9999]
//
//deleteR([1,5,3,4],5)
//returns [1,3,4]
//
//hint:
//
//create a new arry for  return with -1 the length of arr
//
//And add all elements from arr except for  the element that matches element value
//return that new array
public class DeleteAnElement {
    public static int[] deleteR(int[] arr,int element) {

        int[] newarr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            if (arr[i] != element) {
                newarr[j] = arr[i];
            }
            else if (arr[i] == element)
                j--;
        }
        return newarr;
    }
}

