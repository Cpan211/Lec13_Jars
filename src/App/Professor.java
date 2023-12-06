package App;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chris
 */
public class Professor extends Person {

    private String employeeId;

    // Constructors, getters, and setters
    public Professor(String name, int age, String employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    // Getter and setter for employeeId
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    
            @Override
    public String toString() {
        return this +
                ", professor ='" + employeeId + '\'';
    }
}
