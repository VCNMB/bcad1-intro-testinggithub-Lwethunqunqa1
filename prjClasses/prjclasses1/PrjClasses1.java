/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjclasses1;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class PrjClasses1 {
    
    private static Students s = new Students();
    
    public static void main(String[]args) {
        
        String strName = JOptionPane.showInputDialog(null,"Please enter student name");
        String strCourse = JOptionPane.showInputDialog(null,"Please enter student Course");
        double dblAvg = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter student avarage result"));
        
        s.setName(strName);
        s.setCourse(strCourse);
        s.setAverage(dblAvg);
        print();
}
    

    public static void print()
{
String strDisplay = "The updated student average results are:\n" + 
        "Student: " + s.getName() + "\n" + 
        "Course: " + s.getCourse() + "\n" + 
        "Updated Average: " + s.getAverage() + "%";

JOptionPane.showMessageDialog(null,strDisplay);
}

}
