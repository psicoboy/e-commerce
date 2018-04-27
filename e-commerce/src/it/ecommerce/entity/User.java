package it.ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

	private Long id;
	private String nome;
	private String cognome;
	private String username;
	private String password;
	private String country;
	private String city;
	private String address;
	private String cap;

	
	public User() {
	}
	
	@Id
	@Column(name="id_cliente",nullable=false,updatable=false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	public  Long getId() {
		return id;
	}
	
/*	public void setId(Long id) {
		this.id = id;
	}*/


	@Column(name="nome_cliente",nullable=false,length=30)
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name="cognome_cliente",nullable=false,length=30)
	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	@Column(name="username_cliente",nullable=false,length=20)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name="password_cliente",nullable=false,length=8)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name="country_cliente",nullable=false,length=30)
	public final String getCountry() {
		return country;
	}

	public final void setCountry(String country) {
		this.country = country;
	}

	@Column(name="city_cliente",nullable=false,length=30)
	public final String getCity() {
		return city;
	}

	public final void setCity(String city) {
		this.city = city;
	}

	@Column(name="address_cliente",nullable=false,length=100)
	public final String getAddress() {
		return address;
	}

	public final void setAddress(String address) {
		this.address = address;
	}

	@Column(name="cap_cliente",nullable=false,length=10)
	public final String getCap() {
		return cap;
	}

	public final void setCap(String cap) {
		this.cap = cap;
	}

	
	/*CREATE TABLE `e_commerce`.`user` (
			  `id_cliente` INT NOT NULL,
			  `nome_cliente` VARCHAR(45) NOT NULL,
			  `cognome_cliente` VARCHAR(45) NOT NULL,
			  `username_cliente` VARCHAR(45) NOT NULL,
			  `password_cliente` VARCHAR(45) NOT NULL,
			  `country_cliente` VARCHAR(45) NOT NULL,
			  `city_cliente` VARCHAR(45) NOT NULL,
			  `address_cliente` VARCHAR(45) NOT NULL,
			  `cap_cliente` VARCHAR(45) NOT NULL,
			  PRIMARY KEY (`id_cliente`))
			ENGINE = InnoDB
			DEFAULT CHARACTER SET = utf8mb4;*/
	
	
}
