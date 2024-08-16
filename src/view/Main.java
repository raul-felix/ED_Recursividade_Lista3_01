package view;

import controller.DigitosController;

public class Main {
	
	public static void main(String[] args) {
		DigitosController digController = new DigitosController();
		int n = 256;
		int digitos = digController.retornaDigitos(n);
		
		System.out.println(String.format("%d tem %d dígitos", n, digitos));
	}
	

}
