/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alpha;

/**
 *
 * @author Cale
 */
public class singleGrade {
	private String gradeName;
    private double availablePoints;
    private double earnedPoints;
	private double weight;
    
    public singleGrade(String name, double total, double grade, double weight){
        this.gradeName = name;
        this.earnedPoints = grade;
        this.availablePoints = total;
        this.weight = weight;
    }
    
    public String getGradeName(){
        return gradeName;
    }
    
    public double getTotal() {
    	return availablePoints;
    }
    
    public double getGrade(){
        return earnedPoints;
    }
    
    public double getWeight(){
        return weight;
    }
    
    public double getActualGrade(){
        return earnedPoints * weight / 100;
    }
    
	public void changeGrade(double grade) {
    	this.earnedPoints = grade;
    }
    
	public void changePoints(double points) {
    	this.availablePoints = points;
    }
    
	public void changeName(String name) {
    	this.gradeName = name;
    }
    
	public void changeWeight(double weight) {
    	this.weight = weight;
    }
    
}
