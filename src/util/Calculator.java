package util;

public class Calculator {
	
	/*Nesse caso PI n�o � uma vari�vel, PI � uma constante, pois seu valor nunca ir� mudar. 
	Por isso escrevemos da forma "static" o que indica que ser� uma constante, um valor que n�o muda.
	e o "final" indica que esse esse valor da constante PI n�o pode ser alterado, � o valor final.*/ 
	public static final double PI = 3.14159;
	
	/*M�todos est�ticos s�o utilizados quando temos uma opera��o que nunca 
	vai mudar a sua forma de ser feita independente do seu objeto (n�o depende de inst�ncia).
	Por exemplo. Se eu tiver v�rios tri�ngulos uma opera��o de calcular sua �rea sempre ser� a mesma.
	O que ir� mudar na hora de calcular ser� apenas as medidas de cada um.*/
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3;
	}

}
