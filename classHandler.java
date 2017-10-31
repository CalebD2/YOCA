/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yoca;

import java.util.ArrayList;

/**
 *
 * @author Cale
 */

/// Stores an array of classes, called gradeHandlers, which store the class's name and array of individual grades
public class classHandler { 
    String userName;
    String semester;
    ArrayList<gradeHandler> classes;
    
    public classHandler(String user, String semester){
        this.userName = user;
        this.semester = semester;
    }
    
    public void addClass(String name){
        classes.add(new gradeHandler(name));
    }
    
    public void removeClass(int index){
        classes.remove(index);
    }
    
    public String getName(){
        return userName;
    }
    
    public String getSemester(){
        return semester;
    }
    
    public double getClassGrade(int index){
        return classes.get(index).calcGrade();
    }
}
