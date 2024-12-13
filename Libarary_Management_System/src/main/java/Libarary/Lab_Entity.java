package Libarary;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Lab_Entity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String Author;
	private int price;
	public Lab_Entity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Lab_Entity(int id, String name, String author, int price) {
		super();
		this.id = id;
		this.name = name;
		Author = author;
		this.price = price;
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
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Lab_Entity [id=" + id + ", name=" + name + ", Author=" + Author + ", price=" + price + "]";
	}
	
}
