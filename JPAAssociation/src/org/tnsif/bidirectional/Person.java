package org.tnsif.bidirectional;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "Person")

public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer adharno;
	private String name;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="contactNo")
	private Contact contact;

	public Integer getAdharno() {
		return adharno;
	}

	public void setAdharno(Integer adharno) {
		this.adharno = adharno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	//Default
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Parameterized
	public Person(Integer adharno, String name, Contact contact) {
		super();
		this.adharno = adharno;
		this.name = name;
		this.contact = contact;
	}
	
	//To String

	@Override
	public String toString() {
		return "Person [adharno=" + adharno + ", name=" + name + ", contact=" + contact + "]";
	}
	
	
	
	
	
	
	
	

}
