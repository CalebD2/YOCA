/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alpha;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 * @author Cale
 */

/// Stores an array of classes, called gradeHandlers, which store the class's name and array of individual grades
public class classHandler { 
	private String userName;
	private String semester;
	private Hashtable<String, course> classes;
    
    public classHandler(String user, String semester){
    	this.classes = (new Hashtable<String, course>());
        this.userName = user;
        this.semester = semester;
    }
    
    public boolean addClass(String name, int id, String code){
        if(classes.contains(name)) {
        	return false;
        }
        else {
    		this.classes.put(name, new course(name, id, code));
    		return true;
        }
    }
    
    public void removeClass(String name){
        this.classes.remove(name);
    }
    
    public String getName(){
        return userName;
    }
    
    public String[] listCourses(){
        ArrayList<String> temp = new ArrayList<String>();
        temp.add("Select Course...");
        for(String keys:classes.keySet()) temp.add(classes.get(keys).getName());
        return temp.toArray(new String[temp.size()]);
    }
    
    public boolean renameClass(String name, String replace) {
	    if(classes.contains(replace)) {
    		course temp = classes.get(replace);
	    	temp.changeName(name);
	    	classes.remove(replace);
	    	classes.put(name, temp);
	    	return true;
	    }
	    else {
	    	return false;
	    }
    	
    }
    
    
    public String getSemester(){
        return semester;
    }
    
    public String[] getClassDist(String className){
        return classes.get(className).getDistributions();
    }
    
    public distribution getSingleDist(String className, String dist) {
    	return classes.get(className).getDistribution(dist);
    }
    
    public singleGrade getSingleGrade(String className, String dist, String grade) {
    	return classes.get(className).getDistribution(dist).getSingleGrade(grade);
    }
    
    public Integer getClassNumber(){
        return classes.size();
    }
    
    public double getClassGrade(String name){
        return classes.get(name).calcGrade();
    }
    
    public int getSize(){
        return classes.size();
    }
    
    public void changeName(String name) {
    	this.userName = name;
    }
    
}
