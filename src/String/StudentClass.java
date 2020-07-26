package String;

public class StudentClass {


    String name;
    public String toSring(){
        return String.format("Student name is %s", this.name);
    }


    public StudentClass (String name){
        this.name=name;
    }


    public boolean equals(StudentClass s) {
        return this.name.equals(s.name);
    }

    public static void main(String[] args) {
        StudentClass s = new StudentClass("John");
        System.out.println(s);

        
    }

}
