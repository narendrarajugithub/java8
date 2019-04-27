package java8sample.model;

public class Person {
	public Person(String firstName, String lastName,Integer age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age=age;
	}


	public String firstName;
	public String lastName;
	public Integer age;
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	@Override
	public String toString() {
		
		return "Person:[firstName : "+firstName+"lastName : "+lastName+"]";
	}
	
}
