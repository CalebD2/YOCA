/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alpha;

import java.util.ArrayList;

/**
 *
 * @author Cale
 */

/// Stores an array of classes, called gradeHandlers, which store the class's name and array of individual grades
public class classHandler { 
	private String userName;
	private String semester;
	private ArrayList<course> classes;
    
    public classHandler(String user, String semester){
    	this.classes = (new ArrayList<course>());
        this.userName = user;
        this.semester = semester;
    }
    
    public void addClass(String name, int id, String code){
        this.classes.add(new course(name, id, code));
    }
    
    public void removeClass(int index){
        this.classes.remove(index);
    }
    
    public String getName(){
        return userName;
    }
    
    public String[] listCourses(){
        ArrayList<String> temp = new ArrayList<String>();
        String[] output;
        for(int i = 0; i < classes.size();i++) temp.add(classes.get(i).getName());
        output = temp.toArray(new String[temp.size()]);
        return output;
    }
    
    public String getSemester(){
        return semester;
    }
    
    public String getClassName (int index) {
        return classes.get(index).getName();
    }
    
    public Integer getClassNumber(){
        return classes.size();
    }
    
    public double getClassGrade(int index){
        return classes.get(index).calcGrade();
    }
    
}
