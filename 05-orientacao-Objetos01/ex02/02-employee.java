package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;
    
    public double netSalary(){
        return grossSalary-tax;
    }

    public void increaseSalary(double percent){
        grossSalary += (grossSalary * 0.01)* percent;
    }

    public String toString(){
        return name + ", R$ " + String.format("%.2f",netSalary());
    }

}
