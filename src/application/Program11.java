package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee;


public class Program11 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Employee> list = new ArrayList<>();
		
		//lê a quantidade e prenche os membros
		System.out.print("How many employees will be registred? ");
		int n = sc.nextInt();
		
		for(int i=1 ; i<=n ; i++){
			System.out.println();
			System.out.println("Employee #" + i +": ");
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(list, id)){
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employee(id, name, salary));
		}
		
		//escolhe quem deseja alterar
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(emp == null) {
			System.out.println("This id does not exist! ");
		}else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		//listar funcionários
		System.out.println();
		System.out.println("List of employees: ");
		for(Employee obj : list) {
			System.out.println(obj);
		}
		
		
		
		sc.close();
	}

	private static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
	
}
