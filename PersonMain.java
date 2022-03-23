package day2;

public class PersonMain {

	public static void main(String[] args) {
		
		Person person1=new Person();
		Person person2=new Person();
		
		person1.setAge(20);
		person1.setName("Ammu");
		person2.setAge(22);
		person2.setName("Heera");
		
		System.out.println("First Person's Details name and age: "+person1.getAge() +" & & "+person1.getName());
		System.out.println("First Person's Details name and age: "+person2.getAge() +" & & "+person2.getName());
		
		

	}

}
