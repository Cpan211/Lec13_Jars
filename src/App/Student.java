package App;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chris
 */
public class Student extends Person {

    private String studentId;

    // Constructor
    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    // Getter and setter for studentId
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    
        @Override
    public String toString() {
        return super.toString() +
                ", studentId='" + studentId + '\'';
    }
}
