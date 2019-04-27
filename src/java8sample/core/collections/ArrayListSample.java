package java8sample.core.collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java8sample.model.Person;

public class ArrayListSample {
static Integer sum;
	public static void main(String ar[]) {
		
		List<Person> person=Arrays.asList( 	
				new Person("NarendaRaju","Yarakaraju",30),
				new Person("Subbaraju","Yarakaraju",32),
				new Person("Ravi","Yarakaraju",28)
				);
		
		
	//	Collections.sort(person, (a1, a2)->a1.getFirstName().compareTo(a2.firstName) );
		
		/*
		 * consumer is functional interface. it is used for the to do some operations on object which is passed a method reference object
		
		 * predicate is functional interface. it is used for the to pass the bulian value either true or false so that the operation on
		 * the object is applicable or not
		*/
		getAllPersons(person,p->true,p->{System.out.println(p);System.out.print(p.age);});
		/*for(Persion p:persion) {
			System.out.println(p.firstName);
		
		}*/
		
	List<Person> firstnamestream =	person.stream().filter(p -> p.firstName.toLowerCase().endsWith("raju")).collect(Collectors.toList()); 
		
	System.out.println("<-------------->");
	 person.stream().filter(p->{return p.firstName.toLowerCase().endsWith("raju");}).forEach(System.out::println);;
	
	//System.out.println(firstnames.findFirst());
	
	
	}
	
	public static List<Person> getAllPersons(List<Person> person, Predicate<Person> predicate , Consumer<Person> consumer) {

		for(Person p: person) {
			if(predicate.test(p)) {
				consumer.accept(p);
			}
			
		}
			
		
		
		return person;	
	}
	
}
