package entities;

public class Retangulo {
	
	public double width;
	public double height;
	
	public double calcularArea(){
		return width * height;
	}
	
	public double calcularPerimeter(){
		return (width * 2) + (height * 2);
	}
	
}
