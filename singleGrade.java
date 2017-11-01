/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yoca;

/**
 *
 * @author Cale
 */
public class singleGrade {
    String gradeName;
    double grade;
    double weight;
    
    public singleGrade(String name, double grade, double weight){
        this.gradeName = name;
        this.grade = grade;
        this.weight = weight;
    }
    
    public String getGradeName(){
        return gradeName;
    }
    
    public double getGrade(){
        return grade;
    }
    
    public double getWeight(){
        return weight;
    }
    
    public double getActualGrade(){
        return grade * weight / 100;
    }
}
