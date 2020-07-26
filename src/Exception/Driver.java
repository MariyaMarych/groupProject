package Exception;

public class Driver {
   private String name;
   private int age;
   private String location;

    public String getName() {
        return name;
    }


    public void setName(String name)throws Exception {
       if(name.contains(" ")){
          throw new Exception ("Name should consist of one word");
       }
        this.name= name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) throws InvalidLocationexception{
        for (int i = 0; i < location.length() ; i++) {
            if(Character.isDigit(location.charAt(i))){
                throw new InvalidLocationexception(location+"Location contains a number");
            }
        }
        this.location = location;
    }
}
