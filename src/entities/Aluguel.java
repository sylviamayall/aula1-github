package entities;

public class Aluguel {
	private String name;
	private String email;
		
	//Construtor é o cara que executa no momento da instanciação do objeto
		public Aluguel(String name, String email) {
			// this.name se referencia ao atributo do objeto ou seja é a linha 4 da classe 
			// this é uma referência para o próprio objeto
			// name é o que o metodo recebe
			this.name = name;
			this.email = email;
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
	
		public void setEmail(String email) {
			this.email = email;
		}
		
		public String getEmail() {
			return email;
		}
		
		public String toString() {
			return name + ", " + email;
		}
}
