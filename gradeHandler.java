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

/// This handles all of the single grades that are entered, which are saved in "grades"
public class gradeHandler {
    ///Name is the class name
    String name;
    ArrayList<singleGrade> grades;
    
    public gradeHandler(String name){        
        this.name = name;
    }
    
    public int enterGrade(String gradeName, double grade, double weight){
        grades.add(new singleGrade(gradeName,grade,weight));
        return 0;
    }
    
    public int removeGrade(int location){
        grades.remove(location);
        return 0;
    }
    
    /// Calculates the grade of a class with grade weight in consideration
    public double calcGrade(){
        double estGrade = 0;
        
        for (singleGrade grade : grades) {
            estGrade = estGrade + grade.getActualGrade();
        }
        
        return estGrade;
    }
    
    public Integer getGradeNumber(){
        return grades.size();
    }
    
    public String getName(){
        return name;
    }
}
