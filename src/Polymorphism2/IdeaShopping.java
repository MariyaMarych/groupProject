package Polymorphism2;

public class IdeaShopping {
    public static void main(String[] args) {
        Chair c = new Aeron();

        c.sit();
        // Casting in Polymorphism:  switching to Aeron type. Because it is allowed normally

        Aeron a  = new Aeron();

            Collapsible co = new HumanScale(); // interface --> allowed to put as reference
        // on the right side -->the class that OVERRIDDEN this method
            co.unfold();


    }
}
