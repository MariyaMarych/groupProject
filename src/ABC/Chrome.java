package ABC;

public class Chrome extends Browser implements BookMark{

    //Chrome chrome = new Chrome();// Constractor of the Object class is created

    @Override
    public void launch(){
        System.out.println("Chrome is launching ");
    }

    @Override
    public void browser(String url) {
        System.out.println("Chrome is browsing URL: "+ url);
    }

    @Override
    public int getnumOfTabs() {
        System.out.println("Chrome is returning number of tabs open");
        return 10;
    }


    @Override
    public void addUrlToBookmark(String url) {
        System.out.println("Given "+url+"added to bookmark");

    }

    @Override
    public void removeUrlFromBookmark(String url) {
        System.out.println("Given "+url+"removed from bookmark");
    }
}
