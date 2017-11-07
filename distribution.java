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

/// This handles all of the single grades that are entered, which are saved in "grades"
public class distribution {
    ///Name is the class name

	private String name;
	private Hashtable<String, singleGrade> grades;
	private double weight;
	private double earnedPoints;
	private double availablePoints;
    
    public distribution(String name, double weight){
    	this.grades = (new Hashtable<String, singleGrade>());
        this.name = name;
        this.weight = weight;
        this.earnedPoints = 0;
        this.availablePoints = 0;
    }
    
    public boolean enterGrade(String gradeName, double total, double grade){
    	double weight = 0;
    	weight = this.weight/grades.size();
    	if(grades.contains(gradeName)) {
    		return false;
    	}
    	else {
        	grades.put(gradeName, new singleGrade(gradeName, total, grade,weight));
        	return true;
    	}
    }
    
    public boolean removeGrade(String name){
        if(grades.contains(name)) {
    		grades.remove(name);
    		return true;
        }
        else
        	return false;
    }
    
    public singleGrade getSingleGrade(String name) {
    	return grades.get(name);
    }
    
    public String[] getGrades() {
    	ArrayList<String> temp = new ArrayList<String>();
    	temp.add("Select Semester...");
    	for(String keys:grades.keySet()) {
    		temp.add(grades.get(keys).getGradeName());
    	}
    	return temp.toArray(new String[temp.size()]);
    }
   
	public void editWeight(double weight) {
    	this.weight = weight;
    	for(String keys:grades.keySet()) {
    		grades.get(keys).changeWeight(weight/grades.size());
    	}
    }
    
	public void editEarned(double earned) {
    	earnedPoints = earned;
    }
    
	public void editAvailable(double available) {
    	availablePoints = available;
    }
    /// Calculates the grade of a class with grade weight in consideration
    public double calcGrade(){
        double estGrade = 0;
        estGrade = earnedPoints/availablePoints;
        return estGrade;
    }
    
    public boolean changeGradeName(String name, String replace) {
    	 if(grades.contains(replace)) {
     		singleGrade temp = grades.get(replace);
 	    	temp.changeName(name);
 	    	grades.remove(replace);
 	    	grades.put(name, temp);
 	    	return true;
 	    }
 	    else {
 	    	return false;
 	    }
    }
    
    public Integer getGradeNumber(){
        return grades.size();
    }
    
    public String getName(){
        return name;
    }
    
    public void changeName(String name) {
    	this.name = name;
    }
    
    public double getGrade() {
		return this.earnedPoints;
	}
    
    public double getPoints() {
		return this.availablePoints;
	}
    
    public double getWeight() {
		return this.weight;
	}
}
