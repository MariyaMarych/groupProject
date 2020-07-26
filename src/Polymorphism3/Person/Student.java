package Polymorphism3.Person;

public class Student extends Person {

    private int studentNumber;

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public void info() {
        super.info(); // call parents info method
        System.out.println("Student Number "+getStudentNumber());
    }
// Student s1 = new Person;
    // Student s2 = new Person;
    // s1.equals(s2)
    public boolean equals(Student otherStudent){

        return this.hasSameName(otherStudent) && this.getStudentNumber() ==otherStudent.getStudentNumber();

    }
    public Student(String name, int number){
        super(name);//calling parent constractor with parametr
        setStudentNumber(number);

    }


}
