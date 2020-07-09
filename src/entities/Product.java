package entities;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	/*também é possível caso desejar, manter o construtor padrão e utilizar da mesma forma de antes;*/
	public Product() {
	}
	
	/*Construtor -> Permite ou Obriga que seja informado os objetos especificados em sua Parametrização ();
	Palavra "this" -> ela serve pra fazer referência ao próprio objeto. Nesse caso utilizado abaixo, 
	ela irá referenciar o atributo do objeto definido da classe e não o parâmetro que foi criado dentro do construtor;*/
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	/*Sobrecarga -> é você disponibilizar mais de uma versão da mesma operação. Nesse caso fizemos uma sobrecarga 
	  de construtores, a diferença entre elas é que uma possui três argumentos e outra dois; */
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	/*Na utilização dos getters and setters Sempre perguntar se os objetos poderam ser alteradas.
	 Caso só seja permitido alterar o valor de um objeto a partir de uma entrada do usuário(devido a regra de negócio), 
	 para evitar algum erro de desenvolvimento, não será necessário criar o seu "setter". Pensar nisso protege
	 a integridade do meu objeto Produto. Nesse caso, nosso objeto "quantity" só poderá ser alterado à partir dos métodos
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
