package Abstraction;

public class InternetUsing {
    public static void main(String[] args) {
        Chrome chrome = new Chrome();
        chrome.version = 65.7;
        chrome.launch();
        chrome.browse("www.stackOverFlow.com");
        chrome.addTab("okta.cybertekscholl.com");
        System.out.println();
        FireFox fireFox = new FireFox();
        fireFox.launch();
        fireFox.launch();
        fireFox.browse("www.stackOverFlow.com");


    }
}
