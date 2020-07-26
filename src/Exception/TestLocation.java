package Exception;

public class TestLocation {
    public static void main(String[] args)  {

        Driver driver =new Driver();
        try {
            driver.setName("saim");
        } catch (Exception e) {
            e.printStackTrace();
        }
       // System.out.println(driver.getName());
        try {
            driver.setLocation("chicago");
        } catch (InvalidLocationexception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println(driver.getName());
            System.out.println(driver.getLocation());
        }
    }
}
