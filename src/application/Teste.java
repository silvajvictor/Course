package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Teste {
	 
	public static void main(String[] args) throws ParseException {
		
		System.out.println("Horas: ");
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		
		Date y1 = sdf1.parse("25/06/2018 15:42:07");
		
		System.out.println("X2:" + sdf1.format(x2));
		System.out.println("X1:" + sdf1.format(x1));
		System.out.println("Y1:" + sdf1.format(y1));
		
	}
}