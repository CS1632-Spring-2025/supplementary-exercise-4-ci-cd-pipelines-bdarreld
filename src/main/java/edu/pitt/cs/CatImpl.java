package edu.pitt.cs;

public class CatImpl implements Cat {

	String name;
	int id;
	boolean rented;

	public CatImpl(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void rentCat() {
		rented = true;
	}

	public void returnCat() {
		rented = false;
	}

	public void renameCat(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public int getId() {
		return this.id;
	}

	public boolean getRented() {
		return this.rented;
	}

	public String toString() {
		return new String("ID " + id + ". " + getName());
	}

}