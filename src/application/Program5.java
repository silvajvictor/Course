package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;
 
public class Program5 {
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		System.out.println("Qual o nome do aluno? ");
		student.nome = sc.nextLine();
		System.out.println("Qual a primeira nota?[0-30] ");
		student.n1 = sc.nextDouble();
		System.out.println("Qual a segunda nota?[0-35] ");
		student.n2 = sc.nextDouble();
		System.out.println("Qual a terceira nota?[0-35] ");
		student.n3 = sc.nextDouble();
		
		System.out.println();
		System.out.println("Final grade: " + student.notaFinal());
		System.out.println();
		
		if(student.notaFinal() > 60){
			System.out.println("PASS");
		}else{
			System.out.println("FAILED");
			System.out.println("MISSING: " + student.notaFalta());
		}

		sc.close();
	}
}