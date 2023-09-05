package org.example;

public class Laptop extends Computer {


    private String topPanel;

    public Laptop(String kbType, String msType, String monType, String wifi, String topPanel) {

        super(kbType,msType,monType, wifi);
        this.topPanel = topPanel;

    }

    public String closeTopPanel() {

        this.topPanel = "Closed";
        return "Top panel is " + this.topPanel;

    }

    public String openTopPanel() {

        this.topPanel = "Open";
        return "Top panel is " + this.topPanel;

    }

    public String getTopPanel() {
        return topPanel;
    }

    public void setTopPanel(String topPanel) {
        this.topPanel = topPanel;
    }
}
