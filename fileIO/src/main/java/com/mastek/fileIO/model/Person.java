package com.mastek.fileIO.model;

import java.io.IOException;
import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private transient int age;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		return true;
	}

	private void writeObject(java.io.ObjectOutputStream out) throws IOException {
		//default we need handle
		out.defaultWriteObject();	//this[ID,NAME]	
		out.writeObject(this);
		//customize logic		
		out.writeInt(getAge());
	}

	private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
		//default we need handle
		in.defaultReadObject();
		Person p=(Person) in.readObject();
		p.setAge(in.readInt());
		//customize logic
		
	}
}
