package com.anurag.concepts.model.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.anurag.concepts.model.Person;
import com.anurag.concepts.model.Person.Sex;

public class PersonModelExample {
	public static void main(String[] args) {

		// print all person
		System.out.println("Printing all person");
		Person.createRoster().stream().forEach((p) -> System.out.println(p.getName()));

		// print name of all Males
		System.out.println("Printing only male person");
		Person.createRoster().stream().filter((s) -> s.getGender() == Person.Sex.MALE).forEach((p) -> {
			System.out.println(p.getName());
		});

		// Average age of male members
		Stream<Person> personStream1 = Person.createRoster().stream().filter((s) -> s.getGender() == Person.Sex.MALE);
		Double average = personStream1.mapToInt(Person::getAge).average().getAsDouble();
		System.out.println(average);

		//sort by age
		List<Person> roaster = Person.createRoster();
		Person[] personArr = roaster.toArray(new Person[roaster.size()]);
		Arrays.sort(personArr, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getBirthday().compareTo(o2.getBirthday());
			}
		});
		
		System.out.println(personArr);
		
		
		//put the name of male members in collection
		List<String> list = Person.createRoster().stream().filter((p)->p.getGender() == Person.Sex.MALE).map((p)->p.getName()).collect(Collectors.toList());
		list.forEach(System.out::println);
		
		//group person by male and female
		Map<Sex,List<Person>> map = Person.createRoster().stream().collect(Collectors.groupingBy(Person :: getGender));
		System.out.println(map.keySet().toString());
		map.values().stream().forEach((p)->{
			p.forEach((k)->{
				System.out.println(k.getName());
			});
		});
		
		System.out.println("name Group by male and female example");
		// group names by male and female
		Map<Sex, List<String>> nameByGender = Person.createRoster().stream().collect(
				Collectors.groupingBy(Person::getGender, Collectors.mapping(Person::getName, Collectors.toList())));
		nameByGender.values().stream().forEach((p)->{
			p.forEach(System.out::println);
		});
		
		
		
		
	}

}
