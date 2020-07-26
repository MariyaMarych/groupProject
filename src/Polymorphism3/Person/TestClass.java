package Polymorphism3.Person;

public class TestClass {

    public static void main(String[] args) {

        HighSchoolStudent highSchoolStudent = new HighSchoolStudent("James",19,6);

        Student student2 = new HighSchoolStudent("james",19,10);

        Person student3 = new HighSchoolStudent("adam",25,6);

        student2.info();

        System.out.println(highSchoolStudent.getGrade());
        System.out.println(((HighSchoolStudent)student2).getGrade());


        Person [] people = new Person[3]; // usually do the parents
        people[0] = highSchoolStudent;
        people[1] = student2;
        people [2]= student3;


        for (Person p: people) {
            p.info();

        }

    }
}
