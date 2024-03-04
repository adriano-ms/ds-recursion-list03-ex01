package controller;

public class DigitsController {

	public int digitsCount(int n) {
		
		if(n <= 0) {
			//O metodo se encerrara retornando 1 quando 'n' chegar a 0
			return 1;
		} else {
			//Primeiro, faz-se uma verificacao que tem como proposito
			//distinguir quando o numero digitado foi 0 ou se o resultado da operacao anterior foi 0
			//Logo apos, soma-se o resultado a chamada do metodo com a divisao de 'n' por 10
			//que resulta em um numero com 1 digito a menos
			return (n % 10 == 0 ? 1 : 0 ) + digitsCount(n/10);
		}
	}
}
