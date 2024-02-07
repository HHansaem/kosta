package pac;

public class Person {
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {  //논리적으로 데이터가 같으면 true 다르면 false
		if(!(obj instanceof Person)) return false;
		Person per = (Person)obj;
		return name.equals(per.name) && age == per.age;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age*2;
	}
	
	@Override
	public String toString() {
		return String.format("이름:%s, 나이:%d", name, age);
	}
	
	@Override
	public Object clone() {
		return new Person(name, age);
	}
}