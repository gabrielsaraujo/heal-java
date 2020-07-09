package entities;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	/*tamb�m � poss�vel caso desejar, manter o construtor padr�o e utilizar da mesma forma de antes;*/
	public Product() {
	}
	
	/*Construtor -> Permite ou Obriga que seja informado os objetos especificados em sua Parametriza��o ();
	Palavra "this" -> ela serve pra fazer refer�ncia ao pr�prio objeto. Nesse caso utilizado abaixo, 
	ela ir� referenciar o atributo do objeto definido da classe e n�o o par�metro que foi criado dentro do construtor;*/
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	/*Sobrecarga -> � voc� disponibilizar mais de uma vers�o da mesma opera��o. Nesse caso fizemos uma sobrecarga 
	  de construtores, a diferen�a entre elas � que uma possui tr�s argumentos e outra dois; */
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	/*Na utiliza��o dos getters and setters Sempre perguntar se os objetos poderam ser alteradas.
	 Caso s� seja permitido alterar o valor de um objeto a partir de uma entrada do usu�rio(devido a regra de neg�cio), 
	 para evitar algum erro de desenvolvimento, n�o ser� necess�rio criar o seu "setter". Pensar nisso protege
	 a integridade do meu objeto Produto. Nesse caso, nosso objeto "quantity" s� poder� ser alterado � partir dos m�todos
	 addProducts e removeProducts*/
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int value) {
		quantity = quantity + value;
	}
	
	public void removeProducts(int value) {
		quantity = quantity - value;
	}
	
	public String toString() {
		return 	name
			+	", $"
			+	String.format("%.2f", price)
			+	", "
			+	quantity
			+	" units, Total: $"
			+	String.format("%.2f", totalValueInStock());
	}

}
