import java.util.ArrayList;

public class Course {

    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    public Course(String topic, Teacher instructor, ArrayList<Student> enrolledStudents) {

        this.topic = topic;
        this.instructor = instructor;
        this.enrolledStudents = enrolledStudents;

    }

    public void setTopic(String aTopic) {

        this.topic = aTopic;

    }

    public void setInstructor(Teacher aInstructor) {

        this.instructor = aInstructor;

    }

    public void setEnrolledStudents(ArrayList<Student> aEnrolledStudents) {

        this.enrolledStudents = aEnrolledStudents;

    }

    public String getTopic() {

        return this.topic;

    }

    public Teacher getInstructor() {

        return this.instructor;

    }

    public ArrayList<Student> getEnrolledStudents() {

        return this.enrolledStudents;

    }

}
