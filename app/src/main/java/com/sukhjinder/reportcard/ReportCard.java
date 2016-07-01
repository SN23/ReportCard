package com.sukhjinder.reportcard;

/**
 * Created by Sukhjinder on 6/30/16.
 */
public class ReportCard {

    private String Grade;
    private String Comments;
    private double Average;
    private String subject;
    private String term;
    private String studentName;

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

    public String getComments() {
        return Comments;
    }

    public void setComments(String comments) {
        Comments = comments;
    }

    public double getAverage() {
        return Average;
    }

    public void setAverage(double average) {
        Average = average;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "Grade='" + Grade + '\'' +
                ", Comments='" + Comments + '\'' +
                ", Average=" + Average +
                ", subject='" + subject + '\'' +
                ", term='" + term + '\'' +
                ", studentName='" + studentName + '\'' +
                '}';
    }

    /**
     * Calculates a students grade based on homeworks, exams, and participation
     *
     * @return grade
     */
    public double calculateGrade() {

        double grade = 0;
        return grade;
    }

    /**
     * Calculates a students average by adding all the grades from each class and dividing by the number of classes
     *
     * @return average
     */
    public double calculateAverage() {
        double average = 0;
        return average;
    }


}
