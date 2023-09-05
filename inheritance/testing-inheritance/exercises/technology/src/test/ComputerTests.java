import org.example.Computer;
import org.example.Laptop;
import org.example.SmartPhone;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ComputerTests {

    @Test
    public void computerInitializesKeyboardMouseMonitorTypesAndWifi() {

        Computer pc = new Computer("External", "Two-Button", "External", "Disabled");

        assertEquals("External", pc.getKeyboardType());
        assertEquals("Two-Button", pc.getMouseType());
        assertEquals("External", pc.getMonitorType());
        assertEquals("Disabled", pc.getWifi());

    }

    @Test
    public void computerPrintsPowerOn() {

        Computer pc = new Computer("External", "Two-Button", "External", "Disabled");

        assertEquals("Powered On", pc.powerOn());

    }

    @Test
    public void computerPrintsPowerOff() {

        Computer pc = new Computer("External", "Two-Button", "External", "Disabled");

        assertEquals("Powered Off", pc.powerOff());

    }

    @Test
    public void laptopInitializesKeyboardMouseMonitorWifiAndTopPanel() {

        Laptop macBookPro = new Laptop("Internal", "Touch",
                "Internal", "Disabled", "Closed");

        assertEquals("Internal", macBookPro.getKeyboardType());
        assertEquals("Touch", macBookPro.getMouseType());
        assertEquals("Internal", macBookPro.getMonitorType());
        assertEquals("Disabled", macBookPro.getWifi());
        assertEquals("Closed", macBookPro.getTopPanel());

    }

    @Test
    public void laptopOpensTopPanel() {

        Laptop macBookPro = new Laptop("Internal", "Touch",
                "Internal", "Disabled", "Closed");

        macBookPro.openTopPanel();

        assertEquals("Open", macBookPro.getTopPanel());

    }

    @Test
    public void laptopClosesTopPanel() {

        Laptop macBookPro = new Laptop("Internal", "Touch",
                "Internal", "Disabled", "Open");

        macBookPro.closeTopPanel();

        assertEquals("Closed", macBookPro.getTopPanel());

    }

    @Test
    public void smartPhoneInitializesKeyboardMouseMonitorWifiAndCaseType() {

        SmartPhone ipPhone15 = new SmartPhone("Internal", "Touch",
                "Internal", "Enabled", "Gel");

        assertEquals("Internal", ipPhone15.getKeyboardType());
        assertEquals("Touch", ipPhone15.getMouseType());
        assertEquals("Internal", ipPhone15.getMonitorType());
        assertEquals("Enabled", ipPhone15.getWifi());
        assertEquals("Gel", ipPhone15.getCaseType());

    }

    @Test
    public void smartPhoneReturnsCaseType() {

        SmartPhone ipPhone15 = new SmartPhone("Internal", "Touch",
                "Internal", "Enabled", "Gel");

        assertEquals("Gel", ipPhone15.getCaseType());

    }

    @Test
    public void smartPhoneSetsCaseType() {

        SmartPhone ipPhone15 = new SmartPhone("Internal", "Touch",
                "Internal", "Enabled", "Gel");

        ipPhone15.setCaseType("Hard");
        assertEquals("Hard", ipPhone15.getCaseType());

    }


}
