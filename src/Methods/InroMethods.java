package Methods;

public class InroMethods {
    public static void main(String[] args) {

// Methods:

        // VOID METHOD CAN'T STORE
        //   RETURN METHOD CAN STORE AND BRING THE VALUE WITH IT!!
//set of java statements in one code block
        // purpose of methods : does some behavior or action
        //  methods have some function
//        note --. methods do not store data.They only have some action;
//why we write methods: if there us an action that need to be done many
// times then
// the method is created and called anywhere you need it.
// note:
//there is two types of methods : VOID an RETURN;
//VOID --> return nothing
//return -->   returns some data type back
//       Most important pars of methods:
//  Rules for creating methods:
//NEVER CREATE METHOD INSIDE OF ANOTHER METHOD !
//GIVE METHOD A MEANINGFUL NAME ;
//NEVER START WITH UPPERCASE  OR NUMBERS
//ONE CLASS CANT HAVE TWO METHODS WITH THE SAME NAME;
/*VOID Method
 --> Methods that does not return an value. Only does an action;
 --> Arrays.sort()--> does not return anything, just does an action.
 Notice we store anything anywhere.
 public static void sayHello(){
 System.out.println("hi");
 Note : to use the method action you have call the method IN THE MAIN CLASS
 Syntax

 public static void printName (String bound){

Multiple data transfer
--> Accepting multiple data in the parameters
public static void goTo (String orgin,String newLocation)

Return Methods:
--> methods that give a single value to the user;
-->the value given back should match the datatype that is provided inthe method declaration;

SYNTAX:

public static int getThree (){ ///int, String,--> method Name
return 3; ///make sure we return int;
}

public static void main (Strings [] args){

int a = getThree(); ///1)You need to Declare !!!!int/str  where to to call the Method;if in method there is result we can assign when we call a method
}                         You need to Declare

Keyword: return
--> return type methods to use this keyword to give a value
--> without this return statement there will be a syntax error
--> return statement value needs to match the data types given as the return type of the method

You can have a multiple return statements if you are using IF and SWITCH STATEMENTS;

Method overloading
-->Having multiple versions of the same method in one class;
--> This allows you to have a method with the same name, but different implementations

Method signature
-->method name,number parameter, type of parameters
--> return type is NOT part of the signature;

public static void draw (String color){
}
* Rules for overloading:
1. give the same name for the method;
2. Change the number of parameters or change the data type of the parameters;
public static void draw (String color){
//statements
}
public static void draw (String color1, String color2){
}
public static void draw (int size){
// statements
--> if you overload a method a successfully you can change the return type;
 ---> Does changing the return type overload the method;

iq --> does changing the return type overload the method?
-->    no. Return type is not part of the method signature; in this case you also confuse java;
*Data parameter promotion
byte-->short-->int-->float/long-->double
public static void

**** Varargs --> Variable arguments

---> Using varargs allows you to pass an array as the argument without having to create an array first
-->The elements are passed in parameters;

public static void main ()

System.out.println(1,23,5,56,)

ARR ... in the methods () must be the last one!!!

no two vargas in one method!!!!just use [] to declare array



 */


    }
}









