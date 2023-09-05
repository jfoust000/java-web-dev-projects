package org.example;

public class Computer {

    private String keyboardType;
    private String mouseType;
    private String monitorType;

    private String wifi;

    public Computer(String kbType, String msType, String monType, String wifi) {

        this.keyboardType = kbType;
        this.mouseType = msType;
        this.monitorType = monType;
        this.wifi = wifi;

    }


    public void powerOn() {

        System.out.println("Powered On");

    }

    public void powerOff() {

        System.out.println("Powered Off");

    }

    public String enableWifi() {

        this.wifi = "Enabled";
        return "Wifi is " + this.wifi;

    }

    public String disableWifi() {

        this.wifi = "Disabled";
        return "Wifi is " + this.wifi;

    }

    public String getKeyboardType() {
        return keyboardType;
    }

    public void setKeyboardType(String keyboardType) {
        this.keyboardType = keyboardType;
    }

    public String getMouseType() {
        return mouseType;
    }

    public void setMouseType(String mouseType) {
        this.mouseType = mouseType;
    }

    public String getMonitorType() {
        return monitorType;
    }

    public void setMonitorType(String monitorType) {
        this.monitorType = monitorType;
    }

}
