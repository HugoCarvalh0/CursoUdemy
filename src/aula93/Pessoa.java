package aula93;

public class Pessoa {

	private String nome, email;

	public Pessoa() {

	}
	
	public Pessoa(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return "Nome: " + this.nome
				+ "\nEmail: " + this.email;
	}
	
}
