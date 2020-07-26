package ABC;

public abstract class Browser {
    String name;
    double size;
    double version;

    public Browser(){
        super();
    }

    public abstract void launch();

    public abstract void browser(String url); // no blocks

    public abstract int getnumOfTabs();

    public void close(){
        System.out.println("Browser is closing");
    }

    @Override
    public String toString() {
        return "what up";
    }
}
