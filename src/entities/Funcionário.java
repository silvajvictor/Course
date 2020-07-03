package entities;

public class Funcionário {

	public String name;
	public double grossSalary;
	public double tax;
	
	public double salarioLiq(){
		return grossSalary - tax;
	}
	
	public double salarioAum(double aumento){
		return grossSalary + ((grossSalary / 100) * aumento);
	}
	
}
