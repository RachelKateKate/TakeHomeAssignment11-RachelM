package rachelmiller.takehomeassignment11_rachelm;

import java.io.Serializable;

/**
 * Created by rachelmiller on 4/17/17.
 */

public class Assignment implements Serializable {

    public String assignmentName;
    public String dueDate;
    public int photoId;

    public Assignment() {

    }

    public Assignment(String assignmentName, String dueDate, int photoId) {
        this.assignmentName = assignmentName;
        this.dueDate = dueDate;
        this.photoId = photoId;
    }

    public String getAssignmentName() {
        return assignmentName;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public String toString() {
        return "Assignment{ " +
                "assignmentName= ' " + assignmentName + '\'' +
                ", dueDate=' " + dueDate + '\'' +
                ", photoId=" + photoId +
                '}';
    }
}

