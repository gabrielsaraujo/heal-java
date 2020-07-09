package util;

public class Calculator {
	
	/*Nesse caso PI não é uma variável, PI é uma constante, pois seu valor nunca irá mudar. 
	Por isso escrevemos da forma "static" o que indica que será uma constante, um valor que não muda.
	e o "final" indica que esse esse valor da constante PI não pode ser alterado, é o valor final.*/ 
	public static final double PI = 3.14159;
	
	/*Métodos estáticos são utilizados quando temos uma operação que nunca 
	vai mudar a sua forma de ser feita independente do seu objeto (não depende de instância).
	Por exemplo. Se eu tiver vários triângulos uma operação de calcular sua área sempre será a mesma.
	O que irá mudar na hora de calcular será apenas as medidas de cada um.*/
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3;
	}

}
