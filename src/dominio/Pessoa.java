package dominio;

import java.io.Serializable;

public class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private String Email;

	public Pessoa() {
	}
	
	public Pessoa(Integer id, String name, String email) {
		this.id = id;
		this.name = name;
		Email = email;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", name=" + name + ", Email=" + Email + "]";
	}
}
