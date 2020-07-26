package WensdayGurhanReview;

public class Student {

        String firstName;
        String lastName;
        Student(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;

            }
            @Override
            public String toString(){
            return lastName+ " "+ firstName;

            }

        public static void main(String[] args){
            Student student = new Student("John","Doe");

            System.out.println(student);
        }
    }




