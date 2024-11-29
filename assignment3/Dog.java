package assignment3;

public class Dog {
	String name;
	String breed;
	
	Dog(String name,String breed){
		this.name=name;
		this.breed=breed;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public static void main(String[] args) {
		Dog d = new Dog("chotu","desi");
		Dog d1 = new Dog("mike","lab");	
		
		d.setName("bobby");
		d.setBreed("shitzu");
		d1.setName("mike");
		d1.setBreed("Husky");
		
		System.out.println("name: "+d.getName());
		System.out.println("age:"+d.getBreed());
		System.out.println("name1: "+d1.getName());
		System.out.println("age1:"+d1.getBreed());
		
	}

}
