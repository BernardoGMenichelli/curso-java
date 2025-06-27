package entities;

public class Student {
    public String name;
    public double a;
    public double b;
    public double c;
    
    public double gradeCalculation(){
            return a + b + c;
    }
    
    public Double missingGrade(){
        if(gradeCalculation() < 60){
            return 60.0 - gradeCalculation(); 
        }
        else return 0.0;
   }
    
}
