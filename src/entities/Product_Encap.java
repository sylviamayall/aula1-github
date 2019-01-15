package entities;

public class Product_Encap {
	private String name;
	private double price;
	private int quantity;
	
    //Construtor padrão
	public Product_Encap() {
		
	}
	
	//Construtor é o cara que executa no momento da instanciação do objeto
	// tem o mesmo nome da Classe
	public Product_Encap(String name, double price, int quantity) {
		// this.name se referencia ao atributo do objeto ou seja é a linha 4 da classe 
		// this é uma referência para o próprio objeto
		// name é o que o metodo recebe
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//Construtor é o cara que executa no momento da instanciação do objeto
		public Product_Encap(String name, double price) {
			// this.name se referencia ao atributo do objeto ou seja é a linha 4 da classe 
			// this é uma referência para o próprio objeto
			// name é o que o metodo recebe
			this.name = name;
			this.price = price;
			//quantity = 0; Se quiser pode ser sem o this pois como quantity não é parametro não existe
			//a ambiguidade 
			// this.quantity = 0; é opcional pois por padrão no java inteiros são inicializados com ZERO
		}
	
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
		
		public void setPrice(double price) {
			this.price = price;
		}
		
		public double getPrice() {
			return price;
		}
		
		public int getQuantity() {
			return quantity;
		}
		
	public double totalValueInStock() {
		return price* quantity;
	}
	
	public void addProducts(int quantity) {
		// this explicita que vc quer acessar o atributo da classe
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
		+ ", $ "
		+ String.format("%.2f", price)
		+ ", "
		+ quantity
		+ " units, Total: $ "
		+ String.format("%.2f", totalValueInStock());
		
	}
}
