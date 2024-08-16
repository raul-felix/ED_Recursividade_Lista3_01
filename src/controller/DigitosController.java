package controller;

public class DigitosController {
	
	public DigitosController() {
		super();
	}
	
	public int retornaDigitos(int n) {
		// se n < 10, o número só tem um dígito
		if (n < 10) {
			return 1;
		} else {
			// se não, retornamos 1 somado com o retorno da função passado como parâmetro (n / 10), já que essa operação deixará n com um dígito a menos
			return 1 + retornaDigitos(n / 10);
		}
	}

}
