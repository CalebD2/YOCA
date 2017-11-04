/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alpha;

import java.util.ArrayList;

/**
 *
 * @author Caleb
 */

/// This handles all of the single grades that are entered, which are saved in "grades"
public class distribution {
    ///Name is the class name

	private String name;
	private ArrayList<singleGrade> grades;
	private double weight;
	private double earnedPoints;
	private double availablePoints;
    
    public distribution(String name, double weight){
    	this.grades = (new ArrayList<singleGrade>());
        this.name = name;
        this.weight = weight;
        this.earnedPoints = 0;
        this.availablePoints = 0;
    }
    
    public int enterGrade(String gradeName, double total, double grade){
    	double weight = 0;
    	weight = this.weight/grades.size();
        grades.add(new singleGrade(gradeName, total, grade,weight));
        return 0;
    }
    
    public int removeGrade(int location){
        grades.remove(location);
        return 0;
    }
   
	public void editWeight(double weight) {
    	this.weight = weight;
    	for(int i=0; i<grades.size(); i++) {
    		grades.get(i).changeWeight(weight/grades.size());
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
    
    public int findGrade(String name) {
    	int index = -1;
    	for(int i=0; i<grades.size(); i++) {
    		if(grades.get(i).getGradeName()==name) {
    			index = i;
    			break;
    		}
    	}
    	return index;
    }
    
    public Integer getGradeNumber(){
        return grades.size();
    }
    
    public String getName(){
        return name;
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
