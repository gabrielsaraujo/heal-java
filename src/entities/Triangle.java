package entities;

public class Triangle { //classe será a referência para o tipo do meus objetos.
	
	//Quando a variável for do tipo "classe", temos que instanciar os atributos;
	
	public double a;
	public double b;
	public double c;
	
	public double calculateArea() {
		
		double p = (a + b + c) / 2;
		
		return  Math.sqrt(p * (p - a) * (p - b) * (p - c));
		
	}
	
	public void showMessage(String value, double areaX, double areaY) {
		
		System.out.printf("Area of Triangle X = %.4f\n", areaX);
		System.out.printf("Area of Triangle Y = %.4f\n", areaY);
		
		System.out.println("Larger area " + value);
	}

}
