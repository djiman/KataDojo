package djiman.samples.kata.dojo.beans;

public class Person {
    private String nom;
    private int age;
    private String nationality;
	public Person(String nom, int age) {
		super();
		this.nom = nom;
		this.age = age;
	}
	
	public Person(String nom, int age, String nationality) {
		this(nom, age);
		this.nationality = nationality;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
    
}
