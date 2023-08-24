public class Teacher {

    private String firstName;
    private String lastName;
    private String subject;
    private double yearsTeaching;

    public Teacher(String firstName, String lastName, String subject, double yearsTeaching) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;

    }

    public void setFirstName(String aFirstName) {

        this.firstName = aFirstName;

    }

    public void setLastName(String aLastName) {

        this.lastName = aLastName;

    }

    public void setSubject(String aSubject) {

        this.subject = aSubject;

    }

    public void setYearsTeaching(double aYearsTeaching) {

        this.yearsTeaching = aYearsTeaching;

    }

    public String getFirstName() {

        return this.firstName;

    }

    public String getLastName() {

        return this.lastName;

    }

    public String getSubject() {

        return this.subject;

    }

    public double getYearsTeaching() {

        return this.yearsTeaching;

    }


}
