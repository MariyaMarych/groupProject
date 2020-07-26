package Polymorphism3.Person;

public class HighSchoolStudent extends Student {
    private int gradeLevel;


    public HighSchoolStudent(String name, int number, int gradeLevel){
        super(name, number);
        this.gradeLevel=gradeLevel;
    }

    public int getGrade() {
        return gradeLevel;
    }


    public void info(){
        super.info();
        System.out.println("Grade level: "+ gradeLevel);
    }

    public void setGrade(int grade) {
        if(gradeLevel>= 9 && gradeLevel <=12) {
            this.gradeLevel = grade;
        }else {
            System.out.println("Invalid grade level");
            System.exit(0);
        }
    }

    public boolean equals(HighSchoolStudent otherStudent){
       return super.equals(otherStudent) && this.getGrade() == otherStudent.getGrade();

    }
}
