package org.launchcode;

import java.util.ArrayList;
import java.util.Objects;

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

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.

    public String toString() {

        return String.format("The %s course is instructed by %s %s and there are currently %d students enrolled", this.topic,
                this.instructor.getFirstName(), this.instructor.getLastName(), this.enrolledStudents.size());

    }


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.

    public boolean equals(Object toBeCompared) {

        if (toBeCompared == this) {
            return true;
        }

        if (toBeCompared == null) {
            return false;
        }

        if (toBeCompared.getClass() != getClass()) {
            return false;
        }

        Course theCourse = (Course) toBeCompared;
        return Objects.equals(theCourse.getTopic(), getTopic()) &&
                Objects.equals(theCourse.getInstructor(), getInstructor());

    }

}
